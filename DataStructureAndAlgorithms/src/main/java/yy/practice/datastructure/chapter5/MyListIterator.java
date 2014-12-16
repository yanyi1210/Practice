package yy.practice.datastructure.chapter5;

public class MyListIterator {

	private MyLink current;
	private MyLink previous;
	private MyLinkedList list;

	public MyListIterator(MyLinkedList list) {
		this.list = list;
		reset();
	}

	public MyLink getCurrent() {
		return current;
	}

	public boolean atEnd() {
		return (current.getNext() == null);
	}

	public void reset() {
		current = list.getFirst();
		previous = null;
	}

	public void nextLink() {
		previous = current;
		current = current.getNext();
	}

	public void insertAfter(int id, long dd) {

		if (list.isEmpty()) {
			list.insertFirst(id, dd);
			reset();
		} else {
			MyLink newLink = new MyLink(id, dd);
			newLink.setNext(current.getNext());
			current.setNext(newLink);
			nextLink();
		}

	}

	public void insertBefore(int id, long dd) {

		if (previous == null) {
			list.insertFirst(id, dd);
			reset();
		} else {
			MyLink newLink = new MyLink(id, dd);
			newLink.setNext(previous.getNext());
			previous.setNext(newLink);
			current = newLink;
		}

	}

	public MyLink deleteCurrent() {
		MyLink temp = current;
		if (previous == null) {
			temp = list.deleteFirst();
			reset();
		} else {
			previous.setNext(current.getNext());

			if (atEnd()) {
				reset();
			} else {
				current = current.getNext();
			}
		}
		return temp;
	}

}
