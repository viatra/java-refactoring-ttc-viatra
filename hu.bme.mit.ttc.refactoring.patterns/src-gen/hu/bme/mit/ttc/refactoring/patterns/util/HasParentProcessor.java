package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.HasParentMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.hasParent pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class HasParentProcessor implements IMatchProcessor<HasParentMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTClass the value of pattern parameter tClass in the currently processed match
   * 
   */
  public abstract void process(final TClass pTClass);
  
  @Override
  public void process(final HasParentMatch match) {
    process(match.getTClass());
  }
}
