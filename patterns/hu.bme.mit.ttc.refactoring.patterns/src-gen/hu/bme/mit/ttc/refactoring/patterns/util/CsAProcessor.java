package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.CsAMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.csA pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CsAProcessor implements IMatchProcessor<CsAMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pChild1 the value of pattern parameter child1 in the currently processed match
   * @param pChildN the value of pattern parameter childN in the currently processed match
   * 
   */
  public abstract void process(final TClass pChild1, final TClass pChildN);
  
  @Override
  public void process(final CsAMatch match) {
    process(match.getChild1(), match.getChildN());
  }
}
