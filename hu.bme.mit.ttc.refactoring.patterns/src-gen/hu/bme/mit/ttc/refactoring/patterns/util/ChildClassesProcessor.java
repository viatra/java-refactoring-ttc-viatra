package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.ChildClassesMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.childClasses pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ChildClassesProcessor implements IMatchProcessor<ChildClassesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pParentClass the value of pattern parameter parentClass in the currently processed match
   * @param pChildClass the value of pattern parameter childClass in the currently processed match
   * 
   */
  public abstract void process(final TClass pParentClass, final TClass pChildClass);
  
  @Override
  public void process(final ChildClassesMatch match) {
    process(match.getParentClass(), match.getChildClass());
  }
}
