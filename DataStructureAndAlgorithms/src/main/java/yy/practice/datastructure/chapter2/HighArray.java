package yy.practice.datastructure.chapter2;

public class HighArray {

	private long[] a;
	private int nElems;

	public HighArray(int max) {
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

	public boolean find(long searchKey) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (a[j] == searchKey)
				break;
		}

		if (j == nElems)
			return false;
		else
			return true;

	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public boolean delete(long value) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (value == a[j])
				break;
		}

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

	public long[] getArray() {
		return a;
	}

	public void setArray(long[] a) {
		this.a = a;
	}

	// 2.1 getMax
	public long getMax() {
		long max = 0;
		if (nElems == 0)
			max = -1;
		else {
			for (int j = 0; j < nElems; j++) {
				if (max < a[j])
					max = a[j];
			}
		}
		return max;
	}

	// 2.2 removeMax
	public long removeMax() {
		long max = 0;
		if (nElems == 0)
			max = -1;
		else {
			for (int j = 0; j < nElems; j++) {
				if (max < a[j])
					max = a[j];
			}
		}
		this.delete(max);
		return max;
	}

	// 2.6 removeMax
	public void removeDups() {

		for (int i = 0; i < nElems - 1; i++) {
			int j = i + 1;
			while (j < nElems) {
				if (a[j] == a[i]) {
					System.out.println("Found dup:" + a[j]);
					a[j] = 101;
				}
				j++;
			}
			delete(101);

		}
	}
}
