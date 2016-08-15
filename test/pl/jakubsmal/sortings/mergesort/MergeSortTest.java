package pl.jakubsmal.sortings.mergesort;

import org.junit.Assert;
import org.junit.Test;

import pl.jakubsmal.sortings.mergesort.MergeSort;

/**
 * @author Jakub Smal 14.08.2016 19:56:26
 */
public class MergeSortTest {
	MergeSort mergeSort = new MergeSort();

	@Test
	public void checkCorrectResult1() {
		int[] array = { 5, 4, 1, 8, 7, 2, 6, 3 };
		int[] expectedResult = { 1, 2, 3, 4, 5, 6, 7, 8 };

		Assert.assertArrayEquals(mergeSort.sort(array), expectedResult);
	}

	@Test
	public void checkCorrectResult2() {
		int[] array = { 2, 6, 3, 5, 1, 1, 8 };
		int[] expectedResult = { 1, 1, 2, 3, 5, 6, 8 };

		Assert.assertArrayEquals(mergeSort.sort(array), expectedResult);
	}

	@Test
	public void checkCorrectResult3() {
		int[] array = { 16, 12, 333, 50, 1000, 5, 897, 1, 3, 66, 13 };
		int[] expectedResult = { 1, 3, 5, 12, 13, 16, 50, 66, 333, 897, 1000 };

		Assert.assertArrayEquals(mergeSort.sort(array), expectedResult);
	}

}
