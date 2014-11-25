package yy.practice.datastructure.chapter2;

import org.junit.Test;

public class OrderedArrayTest {

	@Test
	public void test() {

		int maxSize = 100;
		int nElems = 10;
		OrderedArray testArray = new OrderedArray(maxSize);
		testArray.init(nElems);

		testArray.display();

		long searchKey = 101;

		int index = testArray.find(searchKey);
		if (index == testArray.getNoOfElems())
			System.out.println("Can not found " + searchKey);
		else
			System.out.println("Found " + searchKey + " at index=" + index);

		searchKey = testArray.getArrayValue(nElems / 2);
		index = testArray.find(searchKey);
		if (index == testArray.getNoOfElems())
			System.out.println("Can not found " + searchKey);
		else
			System.out.println("Found " + searchKey + " at index=" + index);

		System.out.println("Delete " + 102);
		testArray.delete(102);
		testArray.display();
		System.out.println("Delete " + testArray.getArrayValue(nElems / 2));
		testArray.delete(testArray.getArrayValue(nElems / 2));
		testArray.display();

	}

	@Test
	public void testMerge() {
		OrderedArray array1 = new OrderedArray(100);
		array1.init(100);
		array1.display();
		OrderedArray array2 = new OrderedArray(100);
		array2.init(100);
		array2.display();
		OrderedArray destinationArray = OrderedArray.mergeTwoOrderedArray(
				array1, array2);
		destinationArray.display();
	}

}
