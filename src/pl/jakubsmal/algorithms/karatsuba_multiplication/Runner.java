/**
 * 
 */
package pl.jakubsmal.algorithms.karatsuba_multiplication;

/**
 * @author Jakub Smal
 * 10.08.2016
 */
public class Runner {
	public static void main(String[] args) throws Exception {
		long a1= 299412331, a2 = 241231266, expectedResult = a1*a2;
		
		KaratsubaMultiplication karatsubaMultiplication = new KaratsubaMultiplication();
		long karatsubaResult = karatsubaMultiplication.calculate(a1,a2);
		System.out.println(karatsubaResult);
		System.out.println(expectedResult);
	}

}
