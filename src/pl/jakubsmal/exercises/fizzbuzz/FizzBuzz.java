/**
 * @author Jakub Smal 
 * 20.08.2016 12:00:43
 */
package pl.jakubsmal.exercises.fizzbuzz;

/*Write a program that prints the numbers from 1 to 100. 
 *For multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
 *For numbers which are multiples of both three and five print “FizzBuzz”
 * 
 */
public class FizzBuzz {

	public static void main(String[] args) {

		runFizzBuzz(1,100); 
	}

	public static void runFizzBuzz(int begin, int end){
		if(begin <0 || begin>end){
			throw new IllegalArgumentException("numbers have to be positive and first number has to be lower then second");
		}
		
		while(begin <= end){
			if(begin % 15 == 0){
				System.out.println("["+begin+"] : FizzBuzz");
			}else if(begin % 3 == 0){
				System.out.println("["+begin+"] : Fizz");
			}else if(begin % 5 == 0){
				System.out.println("["+begin+"] : Buzz");
			}else{
				System.out.println("["+begin+"] : "+begin);
			}		
			begin++;
		}
	}

}
