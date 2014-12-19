package yy.practice.datastructure.chapter5.pp.circlelink;

import org.junit.Test;

public class TestMyCircleLinkedList {

	@Test
	public void test() {

		MyCircleLinkedList list = new MyCircleLinkedList();
		list.insert(1);
		list.display();
		list.insert(2);
		list.display();
		list.insert(3);
		list.display();
		list.insert(1);
		list.display();
		list.insert(4);
		list.display();
		list.insert(3);
		list.display();
		list.deleteData(1);
		list.display();
		list.deleteData(4);
		list.display();
		list.search(3);

	}

	//5.3
	@Test
	public void testCountDown() {
		MyCircleLinkedList list = new MyCircleLinkedList();
		for (int i = 1; i <= 7; i++) {
			list.insert(i);
		}
		list.display();
		double last = list.countDown(3);
		System.out.println("Last is " + last);
	}

	//5.5
	@Test
	public void findCountOffN() {

		int n = 1;
		double last = -1;
		MyCircleLinkedList list = null;
		while (last != 7) {
			n++;
			list = new MyCircleLinkedList();
			for (int i = 1; i <= 20; i++) {
				list.insert(i);
			}
			last = list.countDown(n);
			System.out.println("When n=" + n);
			list.display();
		}
	}

	@Test
	public void testDeleteCurrent() {
		MyCircleLinkedList list = new MyCircleLinkedList();
		for (int i = 1; i <= 7; i++) {
			list.insert(i);
		}
		list.display();
		list.deleteCurrent();
		list.display();
	}

	//5.4
	@Test
	public void testStack() {
		MyStackWithCircleLinkedList stack = new MyStackWithCircleLinkedList();
		for (int i = 1; i <= 7; i++) {
			stack.push(i);
		}
		stack.display();
		while (!stack.isEmpty()) {
			stack.peek();
			stack.display();
		}

	}
}
