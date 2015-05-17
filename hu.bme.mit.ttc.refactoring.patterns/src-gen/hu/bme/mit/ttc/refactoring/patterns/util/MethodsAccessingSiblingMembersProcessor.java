package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TMethodDefinition;
import hu.bme.mit.ttc.refactoring.patterns.MethodsAccessingSiblingMembersMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.methodsAccessingSiblingMembers pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MethodsAccessingSiblingMembersProcessor implements IMatchProcessor<MethodsAccessingSiblingMembersMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pMethodDefinition the value of pattern parameter methodDefinition in the currently processed match
   * 
   */
  public abstract void process(final TMethodDefinition pMethodDefinition);
  
  @Override
  public void process(final MethodsAccessingSiblingMembersMatch match) {
    process(match.getMethodDefinition());
  }
}
