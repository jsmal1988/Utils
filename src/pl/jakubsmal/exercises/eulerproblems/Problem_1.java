/**
 * @author Jakub Smal 
 * 20.08.2016 18:38:29
 */
package pl.jakubsmal.exercises.eulerproblems;

/*
 * Title: Even Fibonacci numbers
 * Description: By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem_1 {
	public static void main(String args[]) {
		System.out.println(calculate());
	}

	public static int calculate() {
		int value = 1, nextValue = 1, sum = 0;

		while (value < 4000000) {
			if (value % 2 == 0) {
				sum = sum + value;
			}
			nextValue = nextValue + value;
			value = nextValue - value;
		}

		return sum;
	}

}
