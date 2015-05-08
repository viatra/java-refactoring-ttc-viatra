package hu.bme.mit.ttc.refactoring;

import java.io.File;
import java.util.Scanner;

import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;
import ttc.testsuite.interfaces.TestInterface;

public class ViatraTransformation implements TestInterface {

	boolean getBool(String text) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print(text + "\n\nEnter \"(t)rue\" or \"(f)alse\": ");
		String answer = scanner.next();

		if (answer.isEmpty()) {
			return getBool(text);
		}

		switch (answer.substring(0, 1).toLowerCase()) {
		case "t":
			return true;
		case "f":
			return false;
		default:
			return getBool("Wrong input. Retry:\n\n" + text);
		}
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
		// TODO Auto-generated method stub
		return getBool("Has the typegraph successful been created?"); //$NON-NLS-1$
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

	}

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
		// TODO Auto-generated method stub
		System.out.println("I've got the file: " + path);
	}

	/**
	 * Hands a File representation of a folder to the solution where data can be stored permanent.
	 *
	 * @param path
	 *            a File representation of the path
	 */
	@Override
	public void setPermanentStoragePath(File path) {
		System.out.println("I've got the file: " + path);
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
		return getBool("Was the synchronization of the changes successful?"); //$NON-NLS-1$
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

		return getBool("Was create super class successful?"); //$NON-NLS-1$
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
		return getBool("Was pull-up method successful?"); //$NON-NLS-1$
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
		System.out.println("I've got the file: " + path);
	}

}
