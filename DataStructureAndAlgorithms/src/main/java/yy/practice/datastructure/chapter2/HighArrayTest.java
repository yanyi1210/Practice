package yy.practice.datastructure.chapter2;

import org.junit.Test;

public class HighArrayTest {

	@Test
	public void main() {

		int maxSize = 100;
		int nElems = 10;
		HighArray hArray = new HighArray(maxSize);
		hArray.init(nElems);

		hArray.display();

		long searchKey = 101;

		if (hArray.find(searchKey))
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can not found " + searchKey);

		searchKey = hArray.getArrayValue(nElems / 2);

		if (hArray.find(searchKey))
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can not found " + searchKey);

		hArray.delete(102);
		hArray.display();
		hArray.delete(hArray.getArrayValue(nElems / 2));
		hArray.display();
		System.out.println(hArray.getMax());
		System.out.println(new HighArray(0).getMax());

		sortDescend(hArray).display();

	}

	// 2.3 inversely sorted.
	private static HighArray sortDescend(HighArray inputArray) {
		HighArray outputArray = new HighArray(inputArray.getNoOfElems());

		while (inputArray.getNoOfElems() > 0) {
			outputArray.insert(inputArray.removeMax());
		}
		return outputArray;
	}

	@Test
	public void testRevomeDups() {
		HighArray testArray = new HighArray(100);
		testArray.init(15);
		testArray.display();
		testArray.removeDups();
		testArray.display();

	}

}
