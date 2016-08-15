/**
 * Jakub Smal
 */
package pl.jakubsmal.sortings.mergesort;

/**
 * @author Jakub Smal 14.08.2016 19:05:33
 * Complexity O(n log(n))
 */
public class MergeSort {

	public int[] sort(int[] array) {
		if (array.length == 1) {
			return array;
		}
		int[] leftPart = new int[array.length / 2];
		int[] rightPart = new int[array.length - leftPart.length];

		System.arraycopy(array, 0, leftPart, 0, leftPart.length);
		System.arraycopy(array, leftPart.length, rightPart, 0, rightPart.length);

		sort(leftPart);
		sort(rightPart);

		array = merge(array, leftPart, rightPart);
		return array;
	}

	private int[] merge(int[] array, int[] leftPart, int[] rightPart) {
		int mainArrayIterator = 0;
		int leftPartIterator = 0;
		int rightPartIterator = 0;

		while (leftPartIterator < leftPart.length && rightPartIterator < rightPart.length) {
			if (leftPart[leftPartIterator] < rightPart[rightPartIterator]) {
				array[mainArrayIterator] = leftPart[leftPartIterator];

				leftPartIterator++;

			} else {
				array[mainArrayIterator] = rightPart[rightPartIterator];

				rightPartIterator++;

			}
			mainArrayIterator++;
		}

		System.arraycopy(leftPart, leftPartIterator, array, mainArrayIterator, leftPart.length - leftPartIterator);
		System.arraycopy(rightPart, rightPartIterator, array, mainArrayIterator, rightPart.length - rightPartIterator);
		
		return array;

	}

}
