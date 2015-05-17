package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.ClassesOfClassListTraceMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.classesOfClassListTrace pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ClassesOfClassListTraceProcessor implements IMatchProcessor<ClassesOfClassListTraceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pConcatSignature the value of pattern parameter concatSignature in the currently processed match
   * @param pTClass the value of pattern parameter tClass in the currently processed match
   * 
   */
  public abstract void process(final String pConcatSignature, final TClass pTClass);
  
  @Override
  public void process(final ClassesOfClassListTraceMatch match) {
    process(match.getConcatSignature(), match.getTClass());
  }
}
