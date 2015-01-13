package yy.practice.datastructure.chapter7;

import org.junit.Test;

public class PartitionApp {

	@Test
	public void test() {
		int maxSize = 16;
		PartitionArray arr = new PartitionArray(maxSize);
		for (int j = 0; j < maxSize; j++) // fill array with
		{ // random numbers
			long n = (int) (java.lang.Math.random() * 199);
			arr.insert(n);
		}
		arr.display(); // display unsorted array
		long pivot = 99; // pivot value
		System.out.print("Pivot is" + pivot);
		int size = arr.size();

		int partDex = arr.partitionIt(0, size - 1, pivot);
		System.out.println(", Partition is at index " + partDex);
		arr.display(); 
	} 
}

class PartitionArray {

	private long[] theArray;
	private int nElems;

	public PartitionArray(int max) {
		theArray = new long[max];
		nElems = 0;
	}

	public int size() {
		return nElems;
	}

	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}

	public void display() {

		for (int j = 0; j < nElems; j++) {
			System.out.print(theArray[j] + ", ");
		}
		System.out.println("");
	}

	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		while (true) {
			// find bigger item
			while (leftPtr < right && theArray[++leftPtr] < pivot) {

			}
			// find smaller item
			while (rightPtr > left && theArray[--rightPtr] > pivot) {

			}
			// if pointers cross,
			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr, rightPtr);
			}

		}
		return right;

	}

	private void swap(int dex1, int dex2) {
		long temp;
		temp = theArray[dex1]; // A into temp
		theArray[dex1] = theArray[dex2]; // B into A
		theArray[dex2] = temp;

	}

}