package pl.jakubsmal.algorithms.karatsuba_multiplication;

/**
 * @author Jakub Smal 10.08.2016
 */
//TODO change long to bigger numbers
public class KaratsubaMultiplication {


	public long calculate(long first, long second) throws Exception {
			
		long firstNumberLenght = getLengthOfNumber(first);
		long secondNumberLenght = getLengthOfNumber(second);
		long biggerNumberLenght = Math.max(firstNumberLenght, secondNumberLenght);
		
		long middlePoint = biggerNumberLenght/2 + biggerNumberLenght%2;
		long multiplier = (long)Math.pow(10, middlePoint);
				
		long[] firstArray = splitNumber(first, multiplier);
		long[] secondArray = splitNumber(second, multiplier);
		
		long valueX = firstArray[0] * secondArray[0];
		long valueY = firstArray[1] * secondArray[1];
		long valueZ = (firstArray[0]+firstArray[1])*(secondArray[0]+secondArray[1]) - valueX - valueY;
		
		return valueX*((long) Math.pow(multiplier, 2)) + valueY + valueZ *  multiplier;
	}

	private long[] splitNumber(long number, long multiplier) {
		long[] splittedNumbers = { 0, 0 };

			splittedNumbers[0] = number / multiplier;
			splittedNumbers[1] = number % multiplier;
		
		return splittedNumbers;

	}

	private long getLengthOfNumber(long number) {
		long numberLength = 0;
		if (number > 0) {
			++numberLength;
		} else {
			return 0;
		}
		number = number / 10;

		return numberLength + getLengthOfNumber(number);
	}
}
