/**
 * @author Jakub Smal 
 * 20.08.2016 21:14:40
 */
package pl.jakubsmal.java8.lambdas.lambda.sorting;


/*
 * 	A lambda expression can be understood as a kind of anonymous function: it doesn’t have a name, but
	it has a list of parameters, a body, a return type, and also possibly a list of exceptions that can be
	thrown. 
*  	Lambda expressions let you pass code concisely. 
*  	A functional interface is an interface that declares exactly one abstract method.  Lambda expressions can be used only where a 
	functional interface is expected. 
*	Lambda expressions let you provide the implementation of the abstract method of a functional interface directly inline and treat 
	the whole expression as an instance of a functional interface. 
* 	Java 8 comes with a list of common functional interfaces in the java.util .function package, which
	includes Predicate<T>, Function<T, R>, Supplier<T>, Consumer<T>, and BinaryOperator<T>, described in table 3.2. 
*	There are primitive specializations of common generic functional interfaces such as Predicate<T> and Function<T, R>
	that can be used to avoid boxing operations: IntPredicate, IntToLongFunction, and so on.
*	The execute around pattern (that is, you need to execute a bit of behavior in the middle of code that’s always required in a method, 
	for example, resource allocation and cleanup) can be used with lambdas to gain additional flexibility and reusability. 
*	The type expected for a lambda expression is called the target type.  Method references let you reuse an existing method implementation 
	and pass it around directly. 
*	Functional interfaces such as Comparator, Predicate, and Function have several default methods that can be used to combine lambda expressions.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.comparing;
public class Main {

	public static void main(String[] args) {
		//sortListOn3DifferentWays();
		//reversedOrder();
		reversedAndByColorOrder();
	}

	public static void sortListOn3DifferentWays(){
		List<Apple> inventory1 = new ArrayList<>();
		List<Apple> inventory2 = new ArrayList<>();
		List<Apple> inventory3 = new ArrayList<>();
		List<Apple> inventory4 = new ArrayList<>();
        
		inventory1.addAll(Arrays.asList(new Apple(80,"green"), new Apple(155, "green"), new Apple(120, "red")));
		inventory2.addAll(Arrays.asList(new Apple(80,"green"), new Apple(155, "green"), new Apple(120, "red")));
		inventory3.addAll(Arrays.asList(new Apple(80,"green"), new Apple(155, "green"), new Apple(120, "red")));
		inventory4.addAll(Arrays.asList(new Apple(80,"green"), new Apple(155, "green"), new Apple(120, "red")));
		
		inventory1.sort(new AppleComparator());
        System.out.println(inventory1);
        
        inventory2.sort(new Comparator<Apple>() {
            public int compare(Apple a1, Apple a2){
                return a1.getWeight().compareTo(a2.getWeight()); 
        }});
        System.out.println(inventory2);
        
        
        inventory3.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(inventory3);

        inventory4.sort(comparing(Apple::getWeight));
        System.out.println(inventory4);
        
	}
	
	public static void reversedOrder(){
		List<Apple> inventory1 = new ArrayList<>();
		
		inventory1.addAll(Arrays.asList(new Apple(80,"green"), new Apple(155, "green"), new Apple(120, "red")));
		
		inventory1.sort(comparing(Apple::getWeight));
		        
		System.out.println(inventory1);
	}
	
	public static void reversedAndByColorOrder(){
		List<Apple> inventory1 = new ArrayList<>();
		
		inventory1.addAll(Arrays.asList(new Apple(80,"green"), new Apple(155, "green"), new Apple(120, "red")));
		
		inventory1.sort(comparing(Apple::getWeight).thenComparing(Apple::getColor));
		        
		System.out.println(inventory1);
	}
}
