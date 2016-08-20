/**
 * @author Jakub Smal 
 * 20.08.2016 18:38:29
 */
package pl.jakubsmal.exercises.eulerproblems;
/*
 * Title: Largest palindrome product
 * Description: Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem_3 {
	public static void main(String args[]) {
		int numberOfDigits = 2;
		
		System.out.println(findBiggestPalindromNumber(numberOfDigits));
	}
	
	public static int findBiggestPalindromNumber(int numberOfDigits){
		int number = 0;
		for(Integer i = 1000000; i>0;  i--){
			String currentNumber = i.toString();
			if(currentNumber.charAt(5) == currentNumber.charAt(0) && currentNumber.charAt(4) == currentNumber.charAt(1)&& currentNumber.charAt(3) == currentNumber.charAt(2)){
				if(checkIfNumberCanBeMultipliedByTwo3DigitsNumbers(i)){
					return i;
				}

			}
		}
		
		return number;
	}

	private static boolean checkIfNumberCanBeMultipliedByTwo3DigitsNumbers(Integer value) {
		for(int i = 100; i<999; i++){
			if(value%i == 0 && value/i < 1000 && value/i>=100 ){
				
				return true; 
			}
		}
		return false;
	}

}
