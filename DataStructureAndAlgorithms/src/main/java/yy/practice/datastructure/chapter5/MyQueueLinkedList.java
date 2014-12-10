package yy.practice.datastructure.chapter5;

public class MyQueueLinkedList {

	private MyDoubleEndedLinkedList list;
	private int nItems;

	public MyQueueLinkedList() {
		super();
		list = new MyDoubleEndedLinkedList();
		nItems = 0;
	}

	public void insert(double value) {
		nItems++;
		list.insertLast(nItems, value);
	}

	public double remove() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
			return 0;
		} else {
			return list.deleteFirst().getdData();
		}
	}

	public void display() {
		list.display();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getnItems() {
		return nItems;
	}

}
