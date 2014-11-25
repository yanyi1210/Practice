package yy.practice.datastructure.chapter4;

public class MyQueueWithN {

	private int maxSize;
	private char[] charArray;
	private int front;
	private int rear;
	private int nItems;

	public MyQueueWithN(int s) {
		super();
		maxSize = s;
		charArray = new char[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(char c) {
		if (isFull()) {
			System.out.println("The stack is full.");
		} else {
			if (rear == maxSize - 1) {
				rear = -1;
			}
			charArray[++rear] = c;
			nItems++;
			System.out.println("Insert [" + rear + "]=" + c);

		}
	}

	public char remove() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
			return ' ';
		} else {
			if (front == maxSize) {
				front = 0;
			}
			System.out.println("remove [" + front + "]=" + charArray[front]);
			nItems--;
			return charArray[front++];
		}
	}

	// 4.1
	public void display() {
		if (isEmpty()) {
			System.out.println("Empty stack.");
		} else {
			System.out.println("Display: front=" + front + ",rear=" + rear);
			int index = front;
			for (int i = 1; i <= nItems; i++) {
				if (index == maxSize) {
					index = 0;
				}
				System.out.print(charArray[index] + " ");
				index++;
			}
			System.out.println("");
		}
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public int getnItems() {
		return nItems;
	}

}
