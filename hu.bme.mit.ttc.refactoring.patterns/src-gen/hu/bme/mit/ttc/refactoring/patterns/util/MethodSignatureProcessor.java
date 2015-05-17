package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.MethodSignatureMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.methodSignature pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MethodSignatureProcessor implements IMatchProcessor<MethodSignatureMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pMethodSignature the value of pattern parameter methodSignature in the currently processed match
   * 
   */
  public abstract void process(final TMethodSignature pMethodSignature);
  
  @Override
  public void process(final MethodSignatureMatch match) {
    process(match.getMethodSignature());
  }
}
