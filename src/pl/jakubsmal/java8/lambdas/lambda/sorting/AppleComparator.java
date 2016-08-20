/**
 * @author Jakub Smal 
 * 20.08.2016 21:13:37
 */
package pl.jakubsmal.java8.lambdas.lambda.sorting;

import java.util.Comparator;

public class AppleComparator implements Comparator<Apple> {
    public int compare(Apple a1, Apple a2){
        return a1.getWeight().compareTo(a2.getWeight());
    }
}

/*
* Instead of creation custom Comparator class we can use anonymous class like this:
* 	
* 	inventory.sort(new Comparator<Apple>() {
		public int compare(Apple a1, Apple a2){
			return a1.getWeight().compareTo(a2.getWeight());
		}
	});

*
* or use lambda:
* 
* 	inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight())
);
*/