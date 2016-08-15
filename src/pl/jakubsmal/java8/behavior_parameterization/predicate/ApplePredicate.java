/**
 * @author Jakub Smal 
 * 15.08.2016 16:04:41
 */
package pl.jakubsmal.java8.behavior_parameterization.predicate;

import pl.jakubsmal.java8.behavior_parameterization.model.Apple;

/*
 * Predicates are example of Strategy Pattern
 */

public interface ApplePredicate {
	public boolean test(Apple a);
}
