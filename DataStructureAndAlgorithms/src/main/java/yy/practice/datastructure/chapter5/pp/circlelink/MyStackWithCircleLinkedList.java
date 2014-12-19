package yy.practice.datastructure.chapter5.pp.circlelink;

public class MyStackWithCircleLinkedList {

	private MyCircleLinkedList list;

	public MyStackWithCircleLinkedList() {
		list = new MyCircleLinkedList();
	}

	public void push(double data) {
		list.insert(data);
	}

	public double peek() {
		MyLink deleted = list.deleteCurrent();
		System.out.println("deleted is " + deleted.getData());
		return deleted.getData();
	}

	public void display() {
		if (!list.isEmpty()) {
			list.display();
		} else {
			System.out.println("The stark is empty.");
		}

	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
}
