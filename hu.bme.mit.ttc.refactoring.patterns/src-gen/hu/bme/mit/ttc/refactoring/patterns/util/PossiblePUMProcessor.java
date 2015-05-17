package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TClass;
import TypeGraphTrace.MethodSignatureTrace;
import hu.bme.mit.ttc.refactoring.patterns.PossiblePUMMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.possiblePUM pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PossiblePUMProcessor implements IMatchProcessor<PossiblePUMMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pParentClass the value of pattern parameter parentClass in the currently processed match
   * @param pMethodSignatureTrace the value of pattern parameter methodSignatureTrace in the currently processed match
   * 
   */
  public abstract void process(final TClass pParentClass, final MethodSignatureTrace pMethodSignatureTrace);
  
  @Override
  public void process(final PossiblePUMMatch match) {
    process(match.getParentClass(), match.getMethodSignatureTrace());
  }
}
