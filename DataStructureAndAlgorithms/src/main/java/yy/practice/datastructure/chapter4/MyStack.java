package yy.practice.datastructure.chapter4;

public class MyStack {

	private int maxSize;
	private char[] charArray;
	private int top;

	public MyStack(int s) {
		super();
		maxSize = s;
		charArray = new char[maxSize];
		top = -1;
	}

	public void push(char c) {
		if (isFull()) {
			System.out.println("The stack is full.");
		} else {
			charArray[++top] = c;
			// System.out.println("Push "+c);
		}
	}

	public long peek() {
		return charArray[top];
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
			return ' ';
		} else {
			// System.out.println("Pop "+charArray[top]);
			return charArray[top--];
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public void display() {
		if (top == -1) {
			System.out.println("Empty stack.");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.print(charArray[i] + " ");
			}
			System.out.println("");
		}
	}

	public void displayInt() {
		if (top == -1) {
			System.out.println("Empty stack.");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.print((int) (charArray[i] - '0') + " ");
			}
			System.out.println("");
		}
	}

	public void displayLastFirst() {
		if (top == -1) {
			System.out.println("Empty stack.");
		} else {
			System.out.print("Top=" + top + "::");
			int i = top;
			while (i >= 0) {
				System.out.print(charArray[i] + " ");
				i--;
			}
			System.out.println("");
		}
	}
}
