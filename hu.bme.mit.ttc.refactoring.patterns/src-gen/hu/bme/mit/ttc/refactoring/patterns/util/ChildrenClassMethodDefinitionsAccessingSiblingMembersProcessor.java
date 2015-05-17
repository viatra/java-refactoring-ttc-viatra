package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.childrenClassMethodDefinitionsAccessingSiblingMembers pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ChildrenClassMethodDefinitionsAccessingSiblingMembersProcessor implements IMatchProcessor<ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pParentClass the value of pattern parameter parentClass in the currently processed match
   * @param pMethodSignature the value of pattern parameter methodSignature in the currently processed match
   * 
   */
  public abstract void process(final TClass pParentClass, final TMethodSignature pMethodSignature);
  
  @Override
  public void process(final ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch match) {
    process(match.getParentClass(), match.getMethodSignature());
  }
}
