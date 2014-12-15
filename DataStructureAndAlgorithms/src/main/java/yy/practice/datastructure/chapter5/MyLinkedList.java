package yy.practice.datastructure.chapter5;

public class MyLinkedList {

	private MyLink first;

	public MyLinkedList() {
		first = null;
	}

	//
	public void insertFirst(int id, double dd) {
		MyLink newLink = new MyLink(id, dd);
		newLink.setNext(first);
		first = newLink;
	}

	// delete first item
	public MyLink deleteFirst() {
		MyLink temp = null;
		if (!isEmpty()) {
			// save reference to link
			temp = first;
			// delete it: first-->old next
			first = first.getNext();
		}

		return temp;
	}

	public MyLink find(int key) {
		MyLink current = this.first;

		while (current.getiData() != key) {
			current = current.getNext();
			if (current == null) {
				break;
			}
		}
		return current;
	}

	public MyLink delete(int key) {
		MyLink current = this.first;
		MyLink previous = null;

		while (current.getiData() != key) {
			previous = current;
			current = current.getNext();
			if (current == null) {
				return current;
			}
		}
		if (current == this.first) {
			first = first.getNext();
			System.out.println("Find::" + current);
		} else {
			System.out.println("Find::" + current);
			previous.setNext(current.getNext());
		}
		return current;
	}

	public void display() {

		MyLink current = this.first;

		while (current != null) {
			current.displayLink();
			current = current.getNext();
		}

		System.out.println("End.");
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public MyLink getFirst() {
		return first;
	}

	public MyListIterator getIterator() {
		return new MyListIterator(this);
	}

}
