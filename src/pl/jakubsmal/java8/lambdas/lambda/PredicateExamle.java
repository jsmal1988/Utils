/**
 * @author Jakub Smal 
 * 15.08.2016 19:48:44
 */
package pl.jakubsmal.java8.lambdas.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamle {
	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> results = new ArrayList<>();
		for (T s : list) {
			if (p.test(s)) {
				results.add(s);
			}
		}
		return results;
	}
/*
	@FunctionalInterface
	public interface Predicate<T> {
		boolean test(T t);
	}
	*/
	public static void main(String args[]){
		List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("one");
		listOfStrings.add("");
		listOfStrings.add("three");
		Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
		List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
		
		System.out.println(nonEmpty);
	}
}
