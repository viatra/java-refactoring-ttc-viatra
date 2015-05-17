package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.DifferentParentsMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.differentParents pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DifferentParentsProcessor implements IMatchProcessor<DifferentParentsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pClassOne the value of pattern parameter classOne in the currently processed match
   * @param pClassTwo the value of pattern parameter classTwo in the currently processed match
   * 
   */
  public abstract void process(final TClass pClassOne, final TClass pClassTwo);
  
  @Override
  public void process(final DifferentParentsMatch match) {
    process(match.getClassOne(), match.getClassTwo());
  }
}
