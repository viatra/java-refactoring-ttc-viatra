package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.ClassWithSignatureMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.classWithSignature pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ClassWithSignatureProcessor implements IMatchProcessor<ClassWithSignatureMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pClazz the value of pattern parameter clazz in the currently processed match
   * @param pMethodSignature the value of pattern parameter methodSignature in the currently processed match
   * 
   */
  public abstract void process(final TClass pClazz, final TMethodSignature pMethodSignature);
  
  @Override
  public void process(final ClassWithSignatureMatch match) {
    process(match.getClazz(), match.getMethodSignature());
  }
}
