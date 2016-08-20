/**
 * @author Jakub Smal 
 * 20.08.2016 12:17:11
 */
package pl.jakubsmal.exercises.staircase;

import java.util.Scanner;

/*
 * Input Format
 * A single integer, , denoting the size of the staircase.
 * 
 * Output Format 
 * Print a staircase of size  using # symbols and spaces. Allignet to right:
 *   #
 *  ##
 * ###  
 */
public class Staircase {
	public static void main(String args[]){
		/* Scanner scanner = new Scanner(System.in);
		 int number = scanner.nextInt();*/
		 int number = 10;
		 
		 if(number<=0){
			 throw new IllegalArgumentException("n has to be positive bigger then 0");
		 }
		
		for(int i = 1; i<=number; i++){
			int localSpaces = number - i;
			int localStairs =  i;
			while(localSpaces>0){
				System.out.print(" ");
				localSpaces--;
			}
			while(localStairs>0){
				System.out.print("#");
				localStairs--;
			}
			System.out.println();
		}
	}
}
