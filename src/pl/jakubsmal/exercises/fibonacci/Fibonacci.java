/**
 * @author Jakub Smal 
 * 20.08.2016 12:51:17
 */
package pl.jakubsmal.exercises.fibonacci;

public class Fibonacci {
	public static void main (String args[]){
		int n = 3;
		if(n <=0 ){
			throw new IllegalArgumentException("number havs to be positive");
		}
		System.out.println(calculate(n));
		
		
		
	}
	
	private static int calculate(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		return calculate(n-1) + calculate(n-2);
	}
}
