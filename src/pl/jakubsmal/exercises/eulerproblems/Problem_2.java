/**
 * @author Jakub Smal 
 * 20.08.2016 18:38:29
 */
package pl.jakubsmal.exercises.eulerproblems;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Title: Largest prime factor
 * Description: What is the largest prime factor of the number 600851475143 ?
 */
public class Problem_2 {
	static Set<Integer> setOfPrimes = new LinkedHashSet<>();

	public static void main(String args[]) {
		long testedValue = 600851475143l;
		setOfPrimes.add(2);
		int biggestPrime = 0;
		
		for(int i = 3; i <= 13195; i++){
			if(isPrime(i) == true){
				setOfPrimes.add(i);
				if(testedValue % i==0 ){
					biggestPrime = i;
				}
			}
		}
		
		System.out.println(biggestPrime);
	}
	
	public static boolean isPrime(int n){
		boolean result = false;
		for(Integer i : setOfPrimes){
			if(n % i == 0){
				result = false;
				break;
			}else {
				result = true;
			}
		}
		return result;
		   

	}

}
