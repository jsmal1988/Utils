/**
 * @author Jakub Smal 
 * 16.08.2016 23:01:00
 */
package pl.jakubsmal.java8.lambdas.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
	/*@FunctionalInterface
	public interface Function<T,R>{
		R apply(T t);
	}*/
	
	public static <T,R> List<R> map(List<T> list, Function<T,R> function){
		List<R> result = new ArrayList<>();
		for(T element : list){
			result.add(function.apply(element));
		}
		return result;
	}
	
	public static void main(String argsp[]){
		List<Integer> list = map(
				Arrays.asList("lambdas","in","action"),
				(String s) -> s.length()
		);
		System.out.println(list);
	}
}
