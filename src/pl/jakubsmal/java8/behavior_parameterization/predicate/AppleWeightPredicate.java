/**
 * @author Jakub Smal 
 * 15.08.2016 16:18:08
 */
package pl.jakubsmal.java8.behavior_parameterization.predicate;

import pl.jakubsmal.java8.behavior_parameterization.model.Apple;

public class AppleWeightPredicate implements ApplePredicate {
	public boolean test(Apple apple) {

		return apple.getWeight() > 150;
	}
}