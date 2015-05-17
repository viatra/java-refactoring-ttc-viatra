package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphTrace.MethodSignatureTrace;
import hu.bme.mit.ttc.refactoring.patterns.MethodWithSignatureMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.methodWithSignature pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MethodWithSignatureProcessor implements IMatchProcessor<MethodWithSignatureMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTrace the value of pattern parameter trace in the currently processed match
   * @param pSignature the value of pattern parameter signature in the currently processed match
   * 
   */
  public abstract void process(final MethodSignatureTrace pTrace, final String pSignature);
  
  @Override
  public void process(final MethodWithSignatureMatch match) {
    process(match.getTrace(), match.getSignature());
  }
}
