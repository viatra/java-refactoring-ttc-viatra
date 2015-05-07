package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.PumMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.pum pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PumProcessor implements IMatchProcessor<PumMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pParent the value of pattern parameter parent in the currently processed match
   * @param pChild1 the value of pattern parameter child1 in the currently processed match
   * @param pChildN the value of pattern parameter childN in the currently processed match
   * @param pDefinition1 the value of pattern parameter definition1 in the currently processed match
   * @param pDefinitionN the value of pattern parameter definitionN in the currently processed match
   * @param pSignature the value of pattern parameter signature in the currently processed match
   * 
   */
  public abstract void process(final TClass pParent, final TClass pChild1, final TClass pChildN, final TMethodDefinition pDefinition1, final TMethodDefinition pDefinitionN, final TMethodSignature pSignature);
  
  @Override
  public void process(final PumMatch match) {
    process(match.getParent(), match.getChild1(), match.getChildN(), match.getDefinition1(), match.getDefinitionN(), match.getSignature());
  }
}
