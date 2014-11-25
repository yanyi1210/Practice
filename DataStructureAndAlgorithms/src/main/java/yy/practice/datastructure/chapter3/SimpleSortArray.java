package yy.practice.datastructure.chapter3;

public class SimpleSortArray {

	private long[] array1;
	private int nElems;

	public SimpleSortArray(int max) {
		array1 = new long[max];
		nElems = 0;
	}

	public long getArrayValue(int index) {
		return array1[index];
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
			if (array1[j] == searchKey)
				break;
		}
		if (j == nElems)
			return false;
		else
			return true;

	}

	public void insert(long value) {
		array1[nElems] = value;
		nElems++;
	}

	public boolean deleteFirst(long value) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (value == array1[j])
				break;
		}

		if (j == nElems)
			return false;
		else {
			for (int k = j; k < nElems; k++) {
				array1[k] = array1[k + 1];
			}
			nElems--;
			return true;
		}
	}

	public void deleteAll(long value) {
		int j;
		boolean found = true;
		while (found) {
			found = false;
			for (j = 0; j < nElems; j++) {
				if (value == array1[j]) {
					found = true;
					int k;
					for (k = j; k < nElems; k++) {
						array1[k] = array1[k + 1];
					}
					array1[k] = 0;
					// display();
				}
			}

		}
	}

	public void display() {
		for (int j = 0; j < nElems; j++) {
			System.out.printf(array1[j] + " ");
		}
		System.out.println("");
	}

	public void init(int nElems, long maxValue) {
		for (int j = 0; j < nElems; j++) {
			long value = (long) (Math.random() * maxValue);
			insert(value);
		}
	}

	public void bubbleSort() {

		for (int outerIndex = nElems - 1; outerIndex > 0; outerIndex--) {
			// display();
			for (int innerIndex = 0; innerIndex < outerIndex; innerIndex++) {
				if (array1[innerIndex] > array1[innerIndex + 1]) {
					switchItem(innerIndex, innerIndex + 1);
				}
			}
		}
	}

	public void selectionSort() {

		int minIndex;

		for (int outerIndex = 0; outerIndex < nElems - 1; outerIndex++) {
			display();
			minIndex = outerIndex;
			for (int innerIndex = outerIndex + 1; innerIndex < nElems; innerIndex++) {
				if (array1[innerIndex] < array1[minIndex]) {
					minIndex = innerIndex;
				}
			}
			switchItem(outerIndex, minIndex);
		}
	}

	// with count 3.5
	public void insertionSort() {

		int outerIndex, innerIndex;
		int compare = 0, copy = 0;
		for (outerIndex = 1; outerIndex < nElems; outerIndex++) {
			// display();
			innerIndex = outerIndex;
			long temp = array1[outerIndex];
			while (innerIndex > 0 && array1[innerIndex - 1] >= temp) {
				compare++;
				array1[innerIndex] = array1[innerIndex - 1];
				copy++;
				innerIndex--;
			}
			array1[innerIndex] = temp;
			copy++;
		}
		System.out.println("Number of comparation:" + compare
				+ "; Number of copy:" + copy);
	}

	// 3.6
	public void insertionSortWithNoDups() {

		int outerIndex;
		int innerIndex;
		int tempNElems = nElems;
		for (outerIndex = 1; outerIndex < nElems; outerIndex++) {
			display();
			innerIndex = outerIndex;
			long temp = array1[outerIndex];
			while (innerIndex > 0 && array1[innerIndex - 1] >= temp) {

				array1[innerIndex] = array1[innerIndex - 1];
				if (array1[innerIndex - 1] == temp && temp != -1) {
					temp = -1;
					tempNElems--;
				}
				innerIndex--;
			}
			array1[innerIndex] = temp;
		}
		display();
		System.out.println("deleteAll");
		while (array1[0] == -1) {
			for (int i = 0; i < nElems; i++) {
				array1[i] = array1[i + 1];
			}
			nElems--;
		}
		this.nElems = tempNElems;
		System.out.println("nElems::" + this.nElems);

	}

	private void switchItem(int index1, int index2) {
		long temp = array1[index1];
		array1[index1] = array1[index2];
		array1[index2] = temp;
	}

	public void copy(SimpleSortArray source) {
		if (source != null) {
			this.nElems = source.getNoOfElems();
			for (int i = 0; i < nElems; i++) {
				array1[i] = source.getArrayValue(i);
			}
		}

	}

	// 3.1
	public void bubbleSortBiditrctionForLoop() {

		for (int outerUpper = nElems - 1, outerLower = 0; outerLower < outerUpper; outerUpper--, outerLower++) {
			display();
			int innerIndex;
			for (innerIndex = outerLower; innerIndex < outerUpper; innerIndex++) {
				if (array1[innerIndex] > array1[innerIndex + 1]) {
					switchItem(innerIndex, innerIndex + 1);
				}
			}
			display();

			for (innerIndex = outerUpper; innerIndex > outerLower; innerIndex--) {
				if (array1[innerIndex] < array1[innerIndex - 1]) {
					switchItem(innerIndex, innerIndex - 1);
				}
			}
		}
	}

	// 3.1
	public void bubbleSortBiditrctionWhileLoop() {
		int outerLower = 0;
		int outerUpper = nElems - 1;
		int inner = 0;
		while (outerLower < outerUpper) {
			display();
			while (inner < outerUpper) {
				if (array1[inner] > array1[inner + 1]) {
					switchItem(inner, inner + 1);
				}
				inner++;
			}
			outerUpper--;
			display();

			while (inner > outerLower) {
				if (array1[inner] < array1[inner - 1]) {
					switchItem(inner, inner - 1);
				}
				inner--;
			}
			outerLower++;
		}
	}

	// 3.3
	public void noDupsOfSortedArray() {
		int outer = 1;
		int index = 1;

		while (outer < nElems) {
			// System.out.println("outer=" + outer + ":array1[" + (outer - 1)
			// + "]=" + array1[outer - 1] + ";array1[" + outer + "]"
			// + array1[outer]);
			if (array1[outer] == array1[outer - 1]) {
				while (array1[outer - 1] == array1[outer] && outer < nElems) {
					// System.out.println("Find: array1[" + (outer - 1)
					// + "]==array1[" + outer + "] Skip insert for outer="
					// + outer);
					outer++;
				}
			} else {

			}

			if (outer < nElems) {
				array1[index] = array1[outer];
				// System.out.println("Insert: index=" + index + ":array1["+
				// (outer) + "]");
				outer++;
				index++;
			}

		}
		nElems = index;
		System.out.println("nElems=" + index);
		while (index <= outer) {
			array1[index] = 0;
			index++;
		}

	}

	// 3.4
	public void oddEvenSort() {
		boolean sorted = false;

		while (sorted != true) {
			sorted = true;
			display();
			for (int i = 1; i < nElems - 1; i += 2) {
				if (array1[i] > array1[i + 1]) {
					switchItem(i, i + 1);
					sorted = false;
				}
			}

			for (int i = 0; i < nElems - 1; i += 2) {
				if (array1[i] > array1[i + 1]) {
					switchItem(i, i + 1);
					sorted = false;
				}
			}
		}

	}
}
