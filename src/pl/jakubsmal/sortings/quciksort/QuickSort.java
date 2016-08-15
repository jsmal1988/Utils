/**
 * Jakub Smal
 */
package pl.jakubsmal.sortings.quciksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jakub Smal 14.08.2016 23:05:31 Complexity O(n log(n))
 */
public class QuickSort {
	public int[] quickSort(int array[]) {
		return sort(array, 0, array.length - 1);
	}

	public int[] sort(int array[], int leftPointer, int rightPointer) {
		int start = leftPointer;
		int end = rightPointer;

		if (end - start >= 1) {
			int pivot = array[leftPointer];

			while (start < end) {
				while (array[start] <= pivot && start <= rightPointer && end > start) {
					start++;
				}

				while (array[end] > pivot && end >= leftPointer && end >= start) {
					end--;
				}

				if (end > start) {
					swapElements(array, start, end);
				}
			}
			
			swapElements(array, leftPointer, end);
			sort(array, leftPointer, end - 1);
			sort(array, end + 1, rightPointer);
			return array;
			
		} else {
			return array;
		}
	}

	public void swapElements(int array[], int firstIndex, int secondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}

}
