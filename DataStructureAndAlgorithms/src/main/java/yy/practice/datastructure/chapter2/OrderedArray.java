package yy.practice.datastructure.chapter2;

public class OrderedArray {

	private long[] a;
	private int nElems;

	public OrderedArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	public long getArrayValue(int index) {
		return a[index];
	}

	public int getNoOfElems() {
		return nElems;
	}

	public void setNoOfElems(int nElems) {
		this.nElems = nElems;
	}

	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = this.nElems - 1;
		int curIn;
		while (true) {
			curIn = (upperBound + lowerBound) / 2;
			if (upperBound < lowerBound)
				return nElems;
			else if (a[curIn] == searchKey)
				return curIn;
			else {
				if (a[curIn] > searchKey)
					upperBound = curIn - 1;
				else
					lowerBound = curIn + 1;
			}

		}
	}

	// 2.4
	public void insert(long value) {
		if (nElems == 0 || value >= a[this.nElems - 1]) {
			a[nElems] = value;
			System.out.println("Inserted a[" + nElems + "]=" + value);
		} else {
			int lowerBound = 0;
			int upperBound = this.nElems - 1;
			int curIn;
			while (true) {
				curIn = (upperBound + lowerBound) / 2;
				if (upperBound < lowerBound) {
					curIn = upperBound;
					break;
				} else if (a[curIn] == value) {
					break;
				} else {
					if (a[curIn] > value) {
						upperBound = curIn - 1;
					} else {
						lowerBound = curIn + 1;
					}
				}
			}
			int j;
			for (j = nElems; j > curIn + 1; j--) {
				a[j] = a[j - 1];
			}
			a[j] = value;
			System.out.println("Inserted a[" + j + "]=" + value);

		}
		nElems++;
		// System.out.println("Inserted " + value);
	}

	// 2.4
	public boolean delete(long value) {
		int j = this.find(value);
		if (j == nElems)
			return false;
		else {
			for (int k = j; k < nElems; k++) {
				a[k] = a[k + 1];
			}
			nElems--;
			return true;
		}
	}

	// 2.5
	public static OrderedArray mergeTwoOrderedArray(OrderedArray array1,
			OrderedArray array2) {
		int nElems1 = array1.getNoOfElems();
		int nElems2 = array2.getNoOfElems();
		System.out.println("nElems1=" + nElems1 + ";nElems2=" + nElems2);

		OrderedArray destinationArray = new OrderedArray(nElems1 + nElems2);
		int j = 0;
		for (int i = 0; i < nElems1; i++) {
			System.out.println("array1[" + i + "]=" + array1.getArrayValue(i));
			while (j < nElems2
					&& array2.getArrayValue(j) < array1.getArrayValue(i)) {
				System.out.println("array2[" + j + "]="
						+ array2.getArrayValue(j));
				destinationArray.insert(array2.getArrayValue(j));
				j++;
			}
			destinationArray.insert(array1.getArrayValue(i));
		}
		while (j < nElems2) {
			System.out.println("array2[" + j + "]=" + array2.getArrayValue(j));
			destinationArray.insert(array2.getArrayValue(j));
			j++;
		}

		return destinationArray;
	}

	public void display() {
		for (int j = 0; j < nElems; j++) {
			System.out.printf(a[j] + " ");
		}
		System.out.println("");
	}

	public void init(int nElems) {
		for (int j = 0; j < nElems; j++) {
			long value = (long) (Math.random() * 100);
			insert(value);
		}
	}
}
