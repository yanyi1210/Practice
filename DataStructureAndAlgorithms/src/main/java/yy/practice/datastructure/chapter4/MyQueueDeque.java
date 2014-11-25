package yy.practice.datastructure.chapter4;

//4.2
public class MyQueueDeque {

	private int maxSize;
	private char[] charArray;
	private int left;
	private int right;
	private int nItems;

	public MyQueueDeque(int s) {
		super();
		maxSize = s;
		charArray = new char[maxSize];
		left = 0;
		right = -1;
	}

	public void insertRight(char c) {
		if (isFull()) {
			System.out.println("The stack is full.");
		} else {
			charArray[++right] = c;
			System.out.println("Insert Right [" + right + "]=" + c);
			nItems++;
			if (right == maxSize - 1) {
				right = -1;
			}

		}
	}

	public void insertLeft(char c) {
		if (isFull()) {
			System.out.println("The stack is full.");
		} else {
			System.out.println("Insert Left [" + left + "]=" + c);
			charArray[left--] = c;
			nItems++;
			if (left == -1) {
				left = maxSize - 1;
			}
		}
	}

	public char removeLeft() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
			return ' ';
		} else {
			if (left == maxSize) {
				left = 0;
			}
			System.out.println("remove Left[" + left + "]=" + charArray[left]);
			nItems--;
			return charArray[left++];
		}
	}

	public char removeRight() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
			return ' ';
		} else {
			if (right == -1) {
				right = maxSize - 1;
			}
			System.out.println("remove Right[" + right + "]="
					+ charArray[right]);
			nItems--;
			return charArray[right--];
		}
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Empty stack.");
		} else {
			System.out.print("Display:");
			int index = left;
			for (int i = 1; i <= nItems; i++) {
				if (index == maxSize) {
					index = 0;
				}
				System.out.print("[" + index + "]=" + charArray[index] + "; ");
				index++;
			}
			System.out.println("");
		}
	}
}
