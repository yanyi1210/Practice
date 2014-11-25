package yy.practice.datastructure.chapter4;

public class MyQueueWithoutN {

	private int maxSize;
	private char[] charArray;
	private int front;
	private int rear;

	public MyQueueWithoutN(int s) {
		super();
		maxSize = s + 1;
		charArray = new char[maxSize];
		front = 0;
		rear = -1;
	}

	public void insert(char c) {
		if (isFull()) {
			System.out.println("The stack is full.");
		} else {
			charArray[++rear] = c;
			System.out.println("Insert [" + rear + "]=" + c);
			if (rear == maxSize - 1) {
				rear = -1;
			}
		}
	}

	public long peekFront() {
		return charArray[front];
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
			return charArray[front++];
		}
	}

	public boolean isEmpty() {
		return (front - rear == 1) || (rear - front == maxSize - 1);
	}

	public boolean isFull() {
		return (front - rear == 2) || (rear - front == maxSize - 2);
	}

	// 4.1
	public void display() {
		if (isEmpty()) {
			System.out.println("Empty stack.");
		} else {
			System.out.print("Display:");
			int index = front;
			while (index != rear + 1) {
				System.out.print(charArray[index] + " ");
				index++;
				if (index == maxSize) {
					index = 0;
				}
			}
			System.out.println("");
		}
	}
}
