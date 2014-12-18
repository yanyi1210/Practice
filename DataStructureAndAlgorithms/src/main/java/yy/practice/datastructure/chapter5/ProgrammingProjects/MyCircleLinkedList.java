package yy.practice.datastructure.chapter5.ProgrammingProjects;

public class MyCircleLinkedList {

	private MyLink current;

	public MyCircleLinkedList() {
	}

	public void insert(double data) {
		MyLink newLink = new MyLink(data);
		if (isEmpty()) {
			current = newLink;
			newLink.setNext(current);
		} else {
			newLink.setNext(current.getNext());
			current.setNext(newLink);
			current = current.getNext();
		}
	}

	public double search(double data) {
		MyLink start = current;
		while (current.getData() != data) {
			current = current.getNext();
			if (current == start) {
				System.out.println("Cannot find the data:" + data);
				return -1;
			}
		}
		System.out.println("Find " + data + " ");
		return current.getData();
	}

	public double delete(double data) {
		double temp;
		MyLink previous = current;
		MyLink start = current.getNext();
		current = current.getNext();
		while (current.getData() != data) {
			previous = current;
			current = current.getNext();
			if (current == start) {
				System.out.println("Cannot find the data:" + data);
				return -1;
			}
		}

		temp = current.getData();
		previous.setNext(current.getNext());
		current = current.getNext();
		return temp;
	}

	public double countDown(int n) {
		System.out.println("n=" + n);
		int count = 0;
		current = current.getNext();
		while (!isEmpty()) {
			count++;
			if (current.getNext() == current) {
				return current.getData();
			}
			if (count == n) {
//				System.out.println("Delete " + current.getNext().getData());
				current.setNext(current.getNext().getNext());
				current = current.getNext();
				count = 0;
			} else {
				current = current.getNext();
			}
		}
		return -1;
	}

	public void display() {
		if (!isEmpty()) {
			MyLink start = current;
			while (true) {
				current = current.getNext();
				System.out.print(current.getData() + " ; ");
				if (current == start) {
					System.out.println("End");
					break;
				}

			}
		}
	}

	public boolean isEmpty() {
		return current == null;
	}
}
