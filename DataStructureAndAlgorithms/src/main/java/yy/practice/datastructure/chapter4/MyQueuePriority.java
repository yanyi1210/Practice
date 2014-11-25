package yy.practice.datastructure.chapter4;

public class MyQueuePriority {

	private int maxSize;
	private char[] queArray;
	private int nItems;

	public MyQueuePriority(int s) {

		maxSize = s;
		queArray = new char[maxSize];
		nItems = 0;
	}

	public void insert(char c) {
		int j;
		if (nItems == 0) {
			queArray[nItems++] = c;
		} else {
			for (j = nItems - 1; j >= 0; j--) {
				if (queArray[j] < c) {
					queArray[j + 1] = queArray[j];
				} else {
					break;
				}
			}
			System.out.println("Insert [" + (j + 1) + "]=" + c + ";");
			queArray[j + 1] = c;
			nItems++;
		}
	}

	public char remove() {
		return queArray[--nItems];
	}

	public char peekMin() {
		return queArray[nItems - 1];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public void display() {
		System.out.print("Display::");

		for (int i = 0; i < nItems; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.println("");
	}
}
