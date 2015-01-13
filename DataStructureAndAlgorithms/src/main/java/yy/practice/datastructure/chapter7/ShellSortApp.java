package yy.practice.datastructure.chapter7;

import org.junit.Test;

public class ShellSortApp {

	@Test
	public void test() {
		int maxSize = 10;
		ShellSortArray arr = new ShellSortArray(maxSize);

		for (int j = 0; j < maxSize; j++) {
			long n = (int) (java.lang.Math.random() * 99);
			arr.insert(n);
		}
		arr.display();
		arr.shellSort();
		arr.display();
	}
}

class ShellSortArray {

	private long[] theArray;
	private int nElems;

	public ShellSortArray(int max) {
		theArray = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}

	public void display() {
		if (nElems == 0) {
			System.out.print("Empty!");
		} else {
			for (int i = 0; i < nElems; i++) {
				System.out.print(theArray[i] + ", ");
			}
		}
		System.out.println("");
	}

	public void shellSort() {
		int inner, outer;
		long temp;
		int h = findH(nElems);
		while (h > 0) {
			for (outer = h; outer < nElems; outer++) {
				inner = outer;
				temp = theArray[outer];
				//
				while (inner > h - 1 && theArray[inner - h] >= temp) {
					theArray[inner] = theArray[inner - h];
					inner -= h;
				}
				theArray[inner] = temp;
			}
			h = nextH(h);
		}
	}

	private int findH(int nElems_) {

		int h = 1;
		while (h <= nElems_ / 3) {
			h = h * 3 + 1;
		}
		return h;
	}

	private int nextH(int h_) {
		return (h_ - 1) / 3;
	}
}
