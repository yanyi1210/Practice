package yy.practice.datastructure.chapter5;

import org.junit.Before;
import org.junit.Test;

public class MyDoublyLinkedListTest {

	@Before
	public void init() {

	}

	@Test
	public void testMyDoublyLinkedList() {

		MyDoublyLinkedList list = new MyDoublyLinkedList();

		list.insertLast(1);
		list.display();
		list.insertLast(2);
		list.display();
//		list.deleteFirst();
//		list.display();
		list.insertFirst(3);
		list.display();
		list.insertLast(4);
		list.display();
		list.insertFirst(5);
		list.display();
//		list.deleteFirst();
//		list.display();
		

	}
}
