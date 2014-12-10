package yy.practice.datastructure.chapter5;

import org.junit.Before;
import org.junit.Test;

public class MyDoubleEndedLinkedListTest {

	MyLinkedList theList;

	@Before
	public void init() {

	}

	@Test
	public void testMyDoubleEndedLinkedList() {

		MyDoubleEndedLinkedList list = new MyDoubleEndedLinkedList();

		list.insertLast(9, 99);
		list.display();
		list.insertLast(8, 88);
		list.display();
		list.deleteFirst();
		list.display();
		list.insertFirst(1, 11);
		list.display();
		list.insertLast(7,	77);
		list.display();
		list.insertFirst(2, 22);
		list.display();
		list.deleteFirst();
		list.display();
		

	}
}
