package yy.practice.datastructure.chapter5;

public class MyDoublyLinkedList {

	private MyDoublyLinkedLink first;
	private MyDoublyLinkedLink last;

	public MyDoublyLinkedList() {
		first = null;
		last = null;
	}

	public void insertFirst(double d) {
		MyDoublyLinkedLink newLink = new MyDoublyLinkedLink(d);

		if (isEmpty()) {
			last = newLink;
		} else {
			first.setPrevious(newLink);
		}
		newLink.setNext(first);
		first = newLink;

	}

	public MyDoublyLinkedLink deleteFirst() {
		MyDoublyLinkedLink temp = null;

		if (!isEmpty()) {
			temp = first;

			if (first == last) {
				last = last.getPrevious();
			}
			first = first.getNext();
		}
		return temp;
	}

	public void insertLast(double d) {
		MyDoublyLinkedLink newLink = new MyDoublyLinkedLink(d);

		if (isEmpty()) {
			first = newLink;
		} else {
			last.setNext(newLink);
		}
		newLink.setPrevious(last);
		last = newLink;
	}

	public MyDoublyLinkedLink deleteLast() {
		MyDoublyLinkedLink temp = null;

		if (!isEmpty()) {
			temp = last;

			if (first == last) {
				first = first.getNext();
			}
			last = last.getPrevious();
		}
		return temp;
	}

	public MyDoublyLinkedLink find(double key) {
		MyDoublyLinkedLink current = null;
		if (!isEmpty()) {
			current = this.first;
			while (current.getdData() != key) {
				current = current.getNext();
				if (current == null) {
					break;
				}
			}
		}
		return current;
	}

	public MyDoublyLinkedLink delete(double key) {
		MyDoublyLinkedLink current = null;
		MyDoublyLinkedLink previous = null;
		MyDoublyLinkedLink next = null;

		if (!isEmpty()) {
			current = this.first;
			while (current.getdData() != key) {
				current = current.getNext();
				if (current == null) {
					return current;
				}
			}
			previous = current.getPrevious();
			next = current.getNext();

			if (previous != null) {
				previous.setNext(next);
			} else {
				first = next;
			}
			
			if (next != null) {
				next.setPrevious(previous);
			} else {
				last = previous;
			}
		}

		return current;
	}

	public void display() {

		MyDoublyLinkedLink current = this.first;

		while (current != null) {
			System.out.print(current + ";");
			current = current.getNext();
		}
		System.out.println("End.");
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public MyDoublyLinkedLink getFirst() {
		return first;
	}

	public MyDoublyLinkedLink getLast() {
		return last;
	}
}
