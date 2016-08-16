/**
 * @author Jakub Smal 
 * 16.08.2016 22:55:11
 */
package pl.jakubsmal.java8.lambdas.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
	/*@FunctionalInterface
	public interface Consumer<T>{
		void accept(T t);
	}*/

	public static <T> void forEach(List<T> list, Consumer<T> consumer){
		for(T element : list){
			consumer.accept(element);
		}
	}
	
	public static void main(String args[]){
		forEach(
			Arrays.asList(1,2,3,4,5), 
			(Integer i) -> System.out.println(i)
		);
	}
}
