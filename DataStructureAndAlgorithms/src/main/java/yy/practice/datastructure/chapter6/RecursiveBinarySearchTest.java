package yy.practice.datastructure.chapter6;

import org.junit.Test;

public class RecursiveBinarySearchTest {

	@Test
	public void testBinarySearch() {
		RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch(
				10);
		int result = recursiveBinarySearch.binarySearch(7);
		System.out.println(result);
	}

	@Test
	public void testRecursiveBinarySearch() {
		RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch(
				10);
		int result = recursiveBinarySearch.recursiveBinarySearch(7);
		System.out.println(result);

	}

}
