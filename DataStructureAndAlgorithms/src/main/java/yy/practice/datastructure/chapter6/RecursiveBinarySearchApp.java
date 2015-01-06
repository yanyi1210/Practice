package yy.practice.datastructure.chapter6;

import org.junit.Test;

public class RecursiveBinarySearchApp {

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

class RecursiveBinarySearch {

	public int[] array;
	public int nElems;

	public RecursiveBinarySearch(int nElems) {
		this.nElems = nElems;
		array = new int[nElems];
		initArray(nElems);
	}

	private void initArray(int nElems) {
		for (int i = 0; i < nElems; i++) {
			array[i] = i;
		}
	}

	public int binarySearch(int key) {
		System.out.println("Enter binarySearch(" + key + ")");
		int lower = 0;
		int upper = nElems - 1;
		int current;

		while (true) {
			current = (lower + upper) / 2;
			if (array[current] == key) {
				return array[current];
			} else if (lower > upper) {
				System.out.println("Can not find " + key);
				return -1;
			} else {
				if (array[current] < key) {
					lower = current + 1;
				} else {
					upper = current - 1;
				}
			}
		}
	}

	public int recursiveBinarySearch(int key) {
		return recursiveBinarySearch(key, nElems - 1, 0);
	}

	private int recursiveBinarySearch(int key, int upper, int lower) {
		System.out.println("Enter recursiveBinarySearch(" + key + "," + upper
				+ "," + lower + ")");
		int current = (lower + upper) / 2;

		if (array[current] == key) {
			return array[current];
		} else if (lower > upper) {
			System.out.println("Can not find " + key);
			return -1;
		} else {
			if (array[current] < key) {
				return recursiveBinarySearch(key, upper, current + 1);
			} else {
				return recursiveBinarySearch(key, upper = current - 1, lower);
			}
		}
	}
}
