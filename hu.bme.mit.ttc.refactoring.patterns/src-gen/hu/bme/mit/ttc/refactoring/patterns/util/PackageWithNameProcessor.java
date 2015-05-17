package hu.bme.mit.ttc.refactoring.patterns.util;

import TypeGraphBasic.TPackage;
import hu.bme.mit.ttc.refactoring.patterns.PackageWithNameMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.refactoring.patterns.packageWithName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PackageWithNameProcessor implements IMatchProcessor<PackageWithNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTPackage the value of pattern parameter tPackage in the currently processed match
   * @param pPackageName the value of pattern parameter packageName in the currently processed match
   * 
   */
  public abstract void process(final TPackage pTPackage, final String pPackageName);
  
  @Override
  public void process(final PackageWithNameMatch match) {
    process(match.getTPackage(), match.getPackageName());
  }
}
