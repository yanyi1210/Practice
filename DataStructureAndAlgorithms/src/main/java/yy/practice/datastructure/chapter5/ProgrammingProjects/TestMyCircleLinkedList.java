package yy.practice.datastructure.chapter5.ProgrammingProjects;

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
		list.delete(1);
		list.display();
		list.delete(4);
		list.display();
		list.search(3);

	}

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
}
