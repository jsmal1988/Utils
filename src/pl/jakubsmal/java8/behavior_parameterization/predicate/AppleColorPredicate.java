/**
 * @author Jakub Smal 
 * 15.08.2016 16:19:01
 */
package pl.jakubsmal.java8.behavior_parameterization.predicate;

import pl.jakubsmal.java8.behavior_parameterization.model.Apple;

public class AppleColorPredicate implements ApplePredicate{
	public boolean test(Apple apple){
		return "green".equals(apple.getColor());
	}
}