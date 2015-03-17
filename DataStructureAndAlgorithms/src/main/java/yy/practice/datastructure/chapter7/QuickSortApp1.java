package yy.practice.datastructure.chapter7;

import org.junit.Test;

public class QuickSortApp1 {

	@Test
	public void test() {
		int maxSize = 1000;
		ArrayIns arr = new ArrayIns(maxSize);
		for (int j = 0; j < maxSize; j++) {
			int n = (int) (java.lang.Math.random() * 1000);
			arr.insert(n);
		}
		arr.display();
		arr.quickSort();
		arr.display();
	}
}

class ArrayIns {

	private int[] array;

	private int nElems;

	public ArrayIns(int maxSize) {
		array = new int[maxSize];
		nElems = 0;
	}

	public void insert(int value) {
		array[nElems] = value;
		nElems++;
	}

	public void display() {

		if (nElems >= 0) {
			System.out.print("Array = {");
			int i;
			for (i = 0; i < nElems - 1; i++) {
				System.out.print(array[i] + ", ");
			}
			System.out.println(array[i] + "}");
		} else {
			System.out.print("Array is empty");
		}
	}

	public void quickSort() {
		doQuickSort(0, nElems - 1);
	}

	private void doQuickSort(int left, int right) {
		if (left - right >= 0) {
			return;
		} else {
			int pivot = array[right];
			int partition = doPartition(left, right, pivot);
			doQuickSort(left, partition - 1);
			doQuickSort(partition + 1, right);
		}
	}

	private int doPartition(int left, int right, int pivot) {

		int leftIndex = left - 1;
		int rightIndex = right;

		while (true) {
			display();
			while (array[++leftIndex] < pivot){
			}
			while (array[--rightIndex] > pivot && rightIndex > 0){
			}

			if (leftIndex >= rightIndex) {
				break;
			} else {
				swap(leftIndex, rightIndex);
			}
		}
		swap(leftIndex, right);
		return leftIndex;
	}

	private void swap(int leftIndex, int rightIndex) {
		int temp = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = temp;
	}
}