package yy.practice.datastructure.chapter5;

import org.junit.Test;

public class MyListIteratorTest {

	@Test
	public void testIterator() {
		MyLinkedList theList = new MyLinkedList();
		MyListIterator iter1 = theList.getIterator();

		iter1.insertAfter(21, 21);
		iter1.insertAfter(40, 40);
		iter1.insertAfter(30, 30);
		iter1.insertAfter(7, 7);
		iter1.insertAfter(45, 45);

		theList.display();
		iter1.reset();
		MyLink aLink = iter1.getCurrent();
		if (aLink.getdData() % 3 == 0) {
			iter1.deleteCurrent();
		}

		while (!iter1.atEnd()) {
			iter1.nextLink();
			aLink = iter1.getCurrent();
			if (aLink.getdData() % 3 == 0) {
				iter1.deleteCurrent();
			}
		}
		theList.display();
	}

}
