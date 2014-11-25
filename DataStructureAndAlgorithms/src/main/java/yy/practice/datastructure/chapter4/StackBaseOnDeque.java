package yy.practice.datastructure.chapter4;


//4.3
public class StackBaseOnDeque {

	private MyQueueDeque deque;
	int maxSize;

	public StackBaseOnDeque(int size) {
		maxSize = size;
		deque = new MyQueueDeque(maxSize);
	}

	public void push(char ch) {
		if (isFull()) {
			System.out.println("The Stack is full.");

		} else {
			deque.insertRight(ch);
		}

	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("The Stack is empty.");
			return ' ';
		} else {
			return deque.removeRight();
		}

	}

	public char peek() {
		char temp;

		if (isEmpty()) {
			System.out.println("The Stack is empty.");
			temp = ' ';
		} else {
			temp = deque.removeRight();
			deque.insertRight(temp);
		}
		return temp;
	}

	public boolean isFull() {
		return deque.isFull();
	}

	public boolean isEmpty() {
		return deque.isEmpty();
	}
}
