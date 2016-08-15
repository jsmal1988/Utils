/**
 * @author Jakub Smal 
 * 15.08.2016 16:19:37
 */
package pl.jakubsmal.java8.behavior_parameterization.predicate;

import pl.jakubsmal.java8.behavior_parameterization.model.Apple;

public class AppleRedAndHeavyPredicate implements ApplePredicate{
	public boolean test(Apple apple){
		return "red".equals(apple.getColor()) 
				&& apple.getWeight() > 150; 
	}
}
