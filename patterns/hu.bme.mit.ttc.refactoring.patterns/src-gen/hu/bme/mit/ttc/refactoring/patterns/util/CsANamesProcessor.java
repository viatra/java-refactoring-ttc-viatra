package hu.bme.mit.ttc.refactoring.patterns.util;

import hu.bme.mit.ttc.refactoring.patterns.CsANamesMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.csANames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CsANamesProcessor implements IMatchProcessor<CsANamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pChild1Name the value of pattern parameter child1Name in the currently processed match
   * @param pChildNName the value of pattern parameter childNName in the currently processed match
   * 
   */
  public abstract void process(final String pChild1Name, final String pChildNName);
  
  @Override
  public void process(final CsANamesMatch match) {
    process(match.getChild1Name(), match.getChildNName());
  }
}
