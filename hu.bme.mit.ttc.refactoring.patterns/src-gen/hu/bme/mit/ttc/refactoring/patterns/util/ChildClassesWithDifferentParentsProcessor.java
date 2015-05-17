package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TClass;
import TypeGraphTrace.ClassListTrace;
import hu.bme.mit.ttc.refactoring.patterns.ChildClassesWithDifferentParentsMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.childClassesWithDifferentParents pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ChildClassesWithDifferentParentsProcessor implements IMatchProcessor<ChildClassesWithDifferentParentsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pClassListTrace the value of pattern parameter classListTrace in the currently processed match
   * @param pClassOne the value of pattern parameter classOne in the currently processed match
   * @param pClassTwo the value of pattern parameter classTwo in the currently processed match
   * 
   */
  public abstract void process(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo);
  
  @Override
  public void process(final ChildClassesWithDifferentParentsMatch match) {
    process(match.getClassListTrace(), match.getClassOne(), match.getClassTwo());
  }
}
