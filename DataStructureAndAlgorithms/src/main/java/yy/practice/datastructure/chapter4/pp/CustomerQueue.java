package yy.practice.datastructure.chapter4.pp;

public class CustomerQueue {

	private int maxSize;
	private Customer[] customerQue;
	private int front;
	private int rear;
	private int nItems;
	private String queMessage;

	public String getQueMessage() {
		return queMessage;
	}

	public CustomerQueue(int maxSize,String queMessage) {
		this.maxSize = maxSize;
		customerQue = new Customer[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
		this.queMessage = queMessage;
	}

	public boolean insert(Customer c) {
		if (isFull()) {
			System.out.println(queMessage+"The stack is full.");
			return false;
		} else {
			if (rear == maxSize - 1) {
				rear = -1;
			}
			customerQue[++rear] = c;
			nItems++;
			System.out.println(queMessage+"Insert [" + rear + "] = Customer@" + c.hashCode());
			return true;
		}
	}

	public Customer remove() {
		if (isEmpty()) {
			System.out.println(queMessage+"The stack is empty.");
			return null;
		} else {
			if (front == maxSize) {
				front = 0;
			}
			System.out.println(queMessage+"remove [" + front + "]=" + customerQue[front].hashCode());
			nItems--;
			return customerQue[front++];
		}
	}

	// 4.1
	public void display() {
		if (isEmpty()) {
			System.out.println(queMessage+"Empty stack.");
		} else {
			System.out.print(queMessage+"Display: front=" + front + ",rear=" + rear+"::");
			int index = front;
			for (int i = 1; i <= nItems; i++) {
				if (index == maxSize) {
					index = 0;
				}
				System.out.print(customerQue[index].hashCode() + " ");
				index++;
			}
			System.out.println("");
		}
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public int getnItems() {
		return nItems;
	}

}
