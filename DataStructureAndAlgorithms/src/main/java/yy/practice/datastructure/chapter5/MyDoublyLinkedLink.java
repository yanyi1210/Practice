package yy.practice.datastructure.chapter5;

public class MyDoublyLinkedLink {

	private double dData;

	private MyDoublyLinkedLink next;
	private MyDoublyLinkedLink previous;

	public MyDoublyLinkedLink(double dData) {
		super();
		this.dData = dData;
	}

	public double getdData() {
		return dData;
	}

	public void setdData(double dData) {
		this.dData = dData;
	}

	public MyDoublyLinkedLink getNext() {
		return next;
	}

	public void setNext(MyDoublyLinkedLink next) {
		this.next = next;
	}

	public MyDoublyLinkedLink getPrevious() {
		return previous;
	}

	public void setPrevious(MyDoublyLinkedLink previous) {
		this.previous = previous;
	}

	/**
	 * Constructs a <code>String</code> with all attributes in name = value
	 * format.
	 * 
	 * @return a <code>String</code> representation of this object.
	 */
	public String toString() {
		return String.valueOf(dData);
	}

}
