package pl.jakubsmal.sortings.quicksort;

import org.junit.Assert;
import org.junit.Test;

import pl.jakubsmal.sortings.mergesort.MergeSort;
import pl.jakubsmal.sortings.quciksort.QuickSort;

/**
 * @author Jakub Smal 15.08.2016 12:10:13
 */
public class QuickSortTest {
	QuickSort quickSort = new QuickSort();

	@Test
	public void checkCorrectResult1() {
		int[] array = { 5, 4, 1, 8, 7, 2, 6, 3 };
		int[] expectedResult = { 1, 2, 3, 4, 5, 6, 7, 8 };

		Assert.assertArrayEquals(quickSort.quickSort(array), expectedResult);
	}

	@Test
	public void checkCorrectResult2() {
		int[] array = { 2, 6, 3, 5, 1, 1, 8 };
		int[] expectedResult = { 1, 1, 2, 3, 5, 6, 8 };

		Assert.assertArrayEquals(quickSort.quickSort(array), expectedResult);
	}

	@Test
	public void checkCorrectResult3() {
		int[] array = { 16, 12, 333, 50, 1000, 5, 897, 1, 3, 66, 13 };
		int[] expectedResult = { 1, 3, 5, 12, 13, 16, 50, 66, 333, 897, 1000 };

		Assert.assertArrayEquals(quickSort.quickSort(array), expectedResult);
	}

}
