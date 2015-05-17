package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.ChildClassesWithSignatureMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.childClassesWithSignature pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ChildClassesWithSignatureProcessor implements IMatchProcessor<ChildClassesWithSignatureMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pParentClass the value of pattern parameter parentClass in the currently processed match
   * @param pClazz the value of pattern parameter clazz in the currently processed match
   * @param pMethodSignature the value of pattern parameter methodSignature in the currently processed match
   * 
   */
  public abstract void process(final TClass pParentClass, final TClass pClazz, final TMethodSignature pMethodSignature);
  
  @Override
  public void process(final ChildClassesWithSignatureMatch match) {
    process(match.getParentClass(), match.getClazz(), match.getMethodSignature());
  }
}
