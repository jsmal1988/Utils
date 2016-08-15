/**
 * @author Jakub Smal 
 * 15.08.2016 15:52:47
 */
package pl.jakubsmal.java8.behavior_parameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pl.jakubsmal.java8.behavior_parameterization.model.Apple;
import pl.jakubsmal.java8.behavior_parameterization.predicate.AppleColorPredicate;
import pl.jakubsmal.java8.behavior_parameterization.predicate.ApplePredicate;
import pl.jakubsmal.java8.behavior_parameterization.predicate.AppleRedAndHeavyPredicate;
import pl.jakubsmal.java8.behavior_parameterization.predicate.AppleWeightPredicate;

public class BehaviorParameterization {
	/*
	 * Behavior parameterization is a software development pattern that lets you
	 * handle frequent requirement changes.
	 * 
	 * In a nutshell, it means taking a block of code and making it available
	 * without executing it. This block of code can be called later by other
	 * parts of your programs, which means that you can defer the execution of
	 * that block of code. For instance, you could pass the block of code as an
	 * argument to another method that will execute it later. As a result,
	 * themethod’s behavior is parameterized based on that block of code.
	 */
	public List<Apple> filter(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}
