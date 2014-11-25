package yy.practice.datastructure.chapter3;

public class PersonArray {

	private Person[] personArray;
	private int nElems;

	public PersonArray(int max) {
		personArray = new Person[max];
		nElems = 0;
	}

	public Person getArrayValue(int index) {
		return personArray[index];
	}

	public int getNoOfElems() {
		return nElems;
	}

	public void setNoOfElems(int nElems) {
		this.nElems = nElems;
	}

	public boolean find(Person searchKey) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (personArray[j] == searchKey)
				break;
		}
		if (j == nElems)
			return false;
		else
			return true;

	}

	public void insert(Person value) {
		personArray[nElems] = value;
		nElems++;
	}

	public boolean delete(Person value) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (value == personArray[j])
				break;
		}

		if (j == nElems)
			return false;
		else {
			for (int k = j; k < nElems; k++) {
				personArray[k] = personArray[k + 1];
			}
			nElems--;
			return true;
		}
	}

	public void display() {
		for (int j = 0; j < nElems; j++) {
			System.out.println((j + 1) + ". " + personArray[j]);
		}
		System.out.println("");
	}

	public void bubbleSort() {

		for (int outerIndex = nElems - 1; outerIndex > 0; outerIndex--) {
			display();
			for (int innerIndex = 0; innerIndex < outerIndex; innerIndex++) {

				if (0 > personArray[innerIndex + 1]
						.compareTo(personArray[innerIndex])) {
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

				if (personArray[innerIndex].compareTo(personArray[minIndex]) < 0) {
					minIndex = innerIndex;
				}
			}
			switchItem(outerIndex, minIndex);
		}
	}

	public void insertionSort() {
		int outerIndex, innerIndex;

		for (outerIndex = 1; outerIndex < nElems; outerIndex++) {
			display();
			innerIndex = outerIndex-1;
			Person temp = personArray[outerIndex];
			while (innerIndex >= 0
					&& temp.compareTo(personArray[innerIndex]) <= 0) {
				personArray[innerIndex+1] = personArray[innerIndex];
				innerIndex--;
			}
			personArray[innerIndex+1] = temp;
		}
	}

	private void switchItem(int index1, int index2) {
		Person temp = personArray[index1];
		personArray[index1] = personArray[index2];
		personArray[index2] = temp;
	}

}
