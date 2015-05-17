package hu.bme.mit.ttc.refactoring.solution;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import TypeGraphBasic.TypeGraph;
import TypeGraphBasic.TypeGraphBasicFactory;
import TypeGraphTrace.Trace;
import TypeGraphTrace.TypeGraphTraceFactory;

import com.google.common.collect.BiMap;

/**
 * Utility class for transforming the source code to Eclipse JDT and PG.
 */
public class ViatraTransformator {
	protected Logger logger = Logger.getLogger("ViatraSolution");
	
	protected EMFBuilder builder = new EMFBuilder();
	protected List<String> classpath = new ArrayList<>();
	protected ASTParser parser;

	protected String tmpPath;
	protected String logPath;
	protected String permanentStoragePath;

	public ViatraTransformator(String tmpPath, String logPath, String permanentStoragePath) {
		parser = ASTParser.newParser(AST.JLS8);
		EMFBuilder.initParser(parser);

		this.tmpPath = tmpPath;
		this.logPath = logPath;
		this.permanentStoragePath = permanentStoragePath;
	}

	public ParseResult transformToPG(String sourcePath) throws IOException {
		File pgFile = new File(tmpPath + File.separatorChar + "pg" + System.currentTimeMillis() + ".typegraphbasic");
		if (pgFile.exists()) {
			pgFile.delete();
		}
		
		logger.info("PG will be saved to: " + pgFile.getAbsolutePath());
		Resource resource = builder.createResource(pgFile.getAbsolutePath());

		Trace trace = TypeGraphTraceFactory.eINSTANCE.createTrace();
		TypeGraph typeGraph = TypeGraphBasicFactory.eINSTANCE.createTypeGraph();
		typeGraph.setTName(sourcePath);
		
		trace.setProgramGraph(typeGraph);
		resource.getContents().add(trace);
		
		logger.info("trace: " + trace.toString());
		logger.info("typegraph: " + trace.getProgramGraph().toString());
		
		File sourceDirectory = new File(sourcePath);
		List<String> sourceFiles = FileUtils.listFiles(sourceDirectory, new String[]{"java"}, true)
				.stream()
				.map(
						file -> file.getAbsolutePath()
				).collect(
						Collectors.toCollection(ArrayList<String>::new)
				);
		ViatraSolution.logger.info("source files to process: " + sourceFiles.toString());

		BiMap<String, CompilationUnit> compilationUnits =
				EMFBuilder.parseProject(
						parser,
						resource,
						classpath.toArray(new String[]{}),
						new String[]{sourcePath},
						sourceFiles.toArray(new String[]{}));

		return new ParseResult(resource, typeGraph, compilationUnits);
	}

	public class ParseResult {
		protected Resource resource;
		protected TypeGraph typeGraph;
		protected BiMap<String, CompilationUnit> compilationUnits;

		public ParseResult(Resource resource, TypeGraph typeGraph, BiMap<String, CompilationUnit> compilationUnits) {
			this.resource = resource;
			this.typeGraph = typeGraph;
			this.compilationUnits = compilationUnits;
		}
		
		public Resource getResource() {
			return resource;
		}

		public void setResource(Resource resource) {
			this.resource = resource;
		}

		public TypeGraph getTypeGraph() {
			return typeGraph;
		}

		public void setTypeGraph(TypeGraph typeGraph) {
			this.typeGraph = typeGraph;
		}

		public BiMap<String, CompilationUnit> getCompilationUnits() {
			return compilationUnits;
		}

		public void setCompilationUnits(BiMap<String, CompilationUnit> compilationUnits) {
			this.compilationUnits = compilationUnits;
		}

		@Override
		public String toString() {
			return "ParseResult [resource=" + resource + ", typeGraph="
					+ typeGraph + ", compilationUnits=" + compilationUnits
					+ "]";
		}
	}
}
