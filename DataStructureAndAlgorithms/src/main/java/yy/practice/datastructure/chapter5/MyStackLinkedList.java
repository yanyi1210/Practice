package yy.practice.datastructure.chapter5;

public class MyStackLinkedList {

	private MyLinkedList list;
	private int count;

	public MyStackLinkedList() {
		super();
		list = new MyLinkedList();
		count = 0;
	}

	public void push(double value) {
		count++;
		list.insertFirst(count, value);
	}

	public double peek() {
		return list.getFirst().getdData();
	}

	public double pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
			return ' ';
		} else {
			return list.deleteFirst().getdData();
		}
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Empty stack.");
		} else {
			list.display();
			System.out.println("");
		}
	}

	public int getCount() {
		return count;
	}

	
}
