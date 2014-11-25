package yy.practice.datastructure.chapter3;

import org.junit.Test;

public class SimpleSortTest {

	@Test
	public void testBobbleSort() {
		SimpleSortArray testArray = new SimpleSortArray(100);
		testArray.init(5, 100);
		// testArray.display();
		testArray.bubbleSort();
		testArray.display();
	}

	@Test
	public void testBobbleSortBidirection() {
		SimpleSortArray testArray1 = new SimpleSortArray(100);
		SimpleSortArray testArray2 = new SimpleSortArray(100);
		testArray1.init(10, 100);
		testArray2.copy(testArray1);
		testArray1.bubbleSortBiditrctionForLoop();
		testArray1.display();
		System.out.println("=============================================");
		testArray2.bubbleSortBiditrctionWhileLoop();
		testArray2.display();
	}

	@Test
	public void testSeletionSort() {
		SimpleSortArray testArray = new SimpleSortArray(100);
		testArray.init(5, 100);
		// testArray.display();
		testArray.selectionSort();
		testArray.display();
	}

	@Test
	public void testInsertionSort() {
		SimpleSortArray testArray = new SimpleSortArray(100);
		testArray.init(6, 100);
		testArray.display();
		testArray.insertionSort();
		testArray.display();
	}

	@Test
	public void testInsertionSortWithNoDups() {
		SimpleSortArray testArray = new SimpleSortArray(100);
		testArray.init(10, 10);
//		testArray.display();
		testArray.insertionSortWithNoDups();
		testArray.display();
		System.out.println(testArray.getNoOfElems());
	}
	
	@Test
	public void testNoDupsOfSortedArray() {
		SimpleSortArray testArray = new SimpleSortArray(100);
		testArray.init(15, 15);
		// testArray.display();
		testArray.insertionSort();
		testArray.display();
		System.out.println("======remove dups======");
		testArray.noDupsOfSortedArray();
		testArray.display();

	}

	@Test
	public void testOddEvenSort() {
		SimpleSortArray testArray = new SimpleSortArray(100);
		testArray.init(10, 15);
		// testArray.display();
		testArray.oddEvenSort();
		// testArray.display();

	}

}
