package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TMethodSignature;
import TypeGraphTrace.MethodSignatureTrace;
import hu.bme.mit.ttc.refactoring.patterns.MethodSignatureAndTraceMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.methodSignatureAndTrace pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MethodSignatureAndTraceProcessor implements IMatchProcessor<MethodSignatureAndTraceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTrace the value of pattern parameter trace in the currently processed match
   * @param pMethodSignature the value of pattern parameter methodSignature in the currently processed match
   * 
   */
  public abstract void process(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature);
  
  @Override
  public void process(final MethodSignatureAndTraceMatch match) {
    process(match.getTrace(), match.getMethodSignature());
  }
}
