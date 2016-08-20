/**
 * @author Jakub Smal 
 * 20.08.2016 18:38:29
 */
package pl.jakubsmal.exercises.eulerproblems;

import java.util.ArrayList;
import java.util.List;

/*
 * Title: Multiples of 3 and 5
 * 
 * Description: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
   Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem_0 {
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 3; i<1000; i++){
			if(i % 3 == 0 || i % 5 == 0){
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
