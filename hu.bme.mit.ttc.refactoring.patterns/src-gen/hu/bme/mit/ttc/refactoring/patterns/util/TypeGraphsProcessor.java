package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TypeGraph;
import hu.bme.mit.ttc.refactoring.patterns.TypeGraphsMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.typeGraphs pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TypeGraphsProcessor implements IMatchProcessor<TypeGraphsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTypeGraph the value of pattern parameter typeGraph in the currently processed match
   * 
   */
  public abstract void process(final TypeGraph pTypeGraph);
  
  @Override
  public void process(final TypeGraphsMatch match) {
    process(match.getTypeGraph());
  }
}
