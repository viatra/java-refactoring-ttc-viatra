package hu.bme.mit.ttc.refactoring.solution;

import hu.bme.mit.ttc.refactoring.transformations.CSCTransformation;
import hu.bme.mit.ttc.refactoring.transformations.PUMTransformation;
import hu.bme.mit.ttc.refactoring.transformations.TraceTransformation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Java_Class;
import ttc.testdsl.tTCTest.Java_Method;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;
import ttc.testsuite.interfaces.TestInterface;

import com.google.common.collect.BiMap;

public class ViatraSolution implements TestInterface {

	protected File tmpPath;
	protected File logPath;
	protected File permanentStoragePath;
	protected AdvancedIncQueryEngine engine;
	protected TraceTransformation transformation;
	
	public static Logger logger = Logger.getLogger("ViatraSolution");
	
	protected ViatraTransformator.ParseResult parseResult;
	protected Map<String, String> originalFileContent = new HashMap<>();
	
	protected boolean serializationNeeded = false;
	
	/**
	 * A solution should have a unique name.
	 *
	 * @return the name of the solution
	 */
	@Override
	public String getPluginName() {
		return "hu.bme.mit.ttc.refactoring.viatra"; //$NON-NLS-1$
	}

	/**
	 * Returns weather the solution is realizing the basic case or the extended case. In the extended case the given type graph has to be
	 * used as intermediate representation on which the refactorings will be applied.
	 *
	 * @return true iff the solution the solution uses the given Type graph as intermediate representation, otherwise false.
	 */
	@Override
	public boolean usesProgramGraph() {
		return true;
	}

	/**
	 * Hands a File representation of a folder to the solution where logs can be stored permanent.
	 *
	 * @param path
	 *            a File representation of the path
	 */
	@Override
	public void setLogPath(File path) {
		this.logPath = path;
		try {
			String logFilePath = path + File.separator + System.currentTimeMillis() + ".log";
			FileHandler fileHandler = new FileHandler(logFilePath);
			
			logger.addHandler(fileHandler);
			logger.setLevel(Level.OFF);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		
		logger.info("Log path: " + path.getAbsolutePath());
	}

	/**
	 * Hands a File representation of a folder to the solution where data can be stored temporal. The folder is automatically cleaned up
	 * when the test toll is closed.
	 *
	 * @param path
	 *            a File representation of the path
	 */
	@Override
	public void setTmpPath(File path) {
		logger.info("Temp path: " + path.getAbsolutePath());
		this.tmpPath = path;
	}

	/**
	 * Hands a File representation of a folder to the solution where data can be stored permanent.
	 *
	 * @param path
	 *            a File representation of the path
	 */
	@Override
	public void setPermanentStoragePath(File path) {
		logger.info("Permanent storage path: " + path.getAbsolutePath());
		this.permanentStoragePath = path;
	}

	/**
	 * Gives the location of the java program on which refactorings will be applied to a solution. This method will only be called in the
	 * basic case. In the extended case createProgramGraph(String) will be called instead.
	 *
	 * @param path
	 *            Absolute path to a java programs main folder
	 * @see ttc.testsuite.interfaces.TestInterface#createProgramGraph(String)
	 */
	@Override
	public void setProgramLocation(String path) {
		throw new UnsupportedOperationException("This method will only be called in the basic case.");
	}

	/**
	 * Reads the java program located at the given path and creates the according program graph. This method will be only called on the
	 * extended case. On the basic case setProgramLocation(String).
	 *
	 * @param path
	 *            Absolute path to a java programs main folder
	 * @return true iff the type graph has successful been created, otherwise false.
	 * @see ttc.testsuite.interfaces.TestInterface#setProgramLocation(String)
	 */
	@Override
	public boolean createProgramGraph(String path) {
		logger.info("createProgramGraph " + path);
		try {
			ViatraTransformator transformator =
					new ViatraTransformator(
							tmpPath.getAbsolutePath(),
							logPath.getAbsolutePath(),
							permanentStoragePath.getAbsolutePath()
							);
			logger.info("transformator created");
			
			this.parseResult = transformator.transformToPG(path);
			logger.info(parseResult.getResource().toString());
			logger.info(parseResult.getResource().getAllContents().toString());

			logger.info("starting engine");
			engine = AdvancedIncQueryEngine.createUnmanagedEngine(
					new EMFScope(
					parseResult.getResource().getResourceSet()
					));
			logger.info("engine: " + engine);
			
			logger.info("starting trace transformation");
			transformation = new TraceTransformation(engine, parseResult.getResource());
			transformation.run();
			
			parseResult
					.getCompilationUnits()
					.keySet()
					.forEach(
							filePath -> originalFileContent.put(filePath,
									readFileToString(filePath)));

			return true;
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (IncQueryException e) {
			throw new RuntimeException(e);
		}
		

	}

	/**
	 * Applies pull up method on the generated type graph according to the values in the given refactoring instance.
	 *
	 * @param refactoring
	 *            A instance of a pull-up method refactoring described in the ttc dsl.
	 * @return true iff the application of pull-up method was successful, otherwise false.
	 */
	@Override
	public boolean applyPullUpMethod(Pull_Up_Refactoring refactoring) {
		logger.info("PULL UP METHOD");
		logger.info(refactoring.toString());
		Java_Class parent = refactoring.getParent();
		String parentPackage = parent.getPackage();
		String parentName = parent.getClass_name();

		Java_Method method = refactoring.getMethod();

		String parentSignature = "L" + parentPackage.replace('.', '/') + "/" + parentName + ";";
		
		String methodSignature = 
				"." + method.getMethod_name() + "(" +
				method.getParams().stream().map(
						param ->
							(param.getPackage() != null) ?
									"L" + param.getPackage().replace('.', '/') + "/" + param.getClass_name() + ";"
									: param.getClass_name()
							.replace("byte", "B").replace("char", "C")
							.replace("double", "D").replace("float", "F")
							.replace("int", "I").replace("long", "J")
							.replace("short", "S").replace("void", "V")
							.replace("boolean", "Z")
				).collect(Collectors.joining()) + ")";
		

		logger.severe("parent signature: " + parentSignature);
		logger.severe("method signature: " + methodSignature);

		PUMTransformation pumTransformation = new PUMTransformation(engine, parentSignature, methodSignature, parseResult.getCompilationUnits());
		if (pumTransformation.canExecutePUM()) {
			pumTransformation.fire();
			
			serializationNeeded = true;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Applies create superclass on the program graph according to the values in the given refactoring instance.
	 *
	 * @param refactoring
	 *            A instance of a create superclass refactoring described in the ttc dsl.
	 * @return true iff the application of extract superclass was successful, otherwise false.
	 */
	@Override
	public boolean applyCreateSuperclass(Create_Superclass_Refactoring refactoring) {
		logger.info("CREATE SUPERCLASS");
		
		List<String> childClassSignatures = refactoring.getChild().getClasses()
				.stream()
				.map(classDescriptor -> "L"
						+ classDescriptor.getPackage().replace('.', '/') + "/"
						+ classDescriptor.getClass_name() + ";")
				.collect(Collectors.toList());
		
		Java_Class target = refactoring.getTarget();
		transformation.addNewClassListTrace(childClassSignatures);
		
		CSCTransformation cscTransformation = new CSCTransformation(engine, childClassSignatures, target.getPackage(), target.getClass_name(), parseResult.getCompilationUnits());
		if (cscTransformation.canExecuteCSC()) {
			cscTransformation.fire();
			
			serializationNeeded = true;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Synchronizes the java code with the program graph and propagates all changes made in the program graph to the java source code.
	 * Synchronizing the program graph with the source code is only allowed when this method s called. This method will be only called in
	 * the extended case. In the basic case there is no equivalent method.
	 *
	 * @return true iff all changes have success full be synchronized with the java code, otherwise false.
	 */
	@Override
	public boolean synchronizeChanges() {
		logger.info("SYNCHRONIZE CHANGES");
		
		if (!serializationNeeded) {
			return true;
		}
		
		BiMap<String, CompilationUnit> compilationUnits = parseResult.getCompilationUnits();
		
		compilationUnits.forEach((filePath, unit) -> {
			try {
				Document doc;
				if (originalFileContent.containsKey(filePath)) {
					doc = new Document(originalFileContent.get(filePath));
					TextEdit rewrite = unit.rewrite(doc, null);
					rewrite.apply(doc);

					FileWriter fileWriter = new FileWriter(new File(filePath));
					fileWriter.write(doc.get());
					fileWriter.close();
				} else {
					FileWriter fileWriter = null;
					try {
						fileWriter = new FileWriter(new File(filePath));
						fileWriter.write(unit.toString());
					} catch (Exception e1) {
					} finally {
						try {
							if (fileWriter != null) {
								fileWriter.close();
							}
						} catch (Exception e1) {
						}
					}
				}


			} catch (Exception e) {
			}
		});
		
		return true;
	}
		
	protected static String readFileToString(String path)  {
		Scanner scanner = null;
		String next = "";
		
		try {
			scanner = new Scanner(new File(path));
			next = scanner.useDelimiter("\\A").next();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		
		return next;
	}

}
