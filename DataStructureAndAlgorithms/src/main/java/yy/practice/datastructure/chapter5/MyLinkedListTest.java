package yy.practice.datastructure.chapter5;

import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {
	MyLinkedList theList;
	
	@Before
	public void init(){
		theList = new MyLinkedList(); // make new list
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		theList.display();
	}
	

	@Test
	public void testMyLinkedList() {
		
		while (!theList.isEmpty()) {
			MyLink aLink = theList.deleteFirst();
			System.out.print("Deleted ");
			aLink.displayLink();
			System.out.println("");
		}
		theList.display(); // display list
	}

	@Test
	public void testMyLinkedListfind() {
		
		MyLink aLink =theList.find(44);
		if(aLink==null){
			System.out.println("Cannot find");
		}else{
			aLink.displayLink();
			System.out.println("");
		}

	}
	
	@Test
	public void testMyLinkedListdelete() {
		MyLink aLink = theList.delete(44);
		if(aLink==null){
			System.out.println("Cannot find");
		}else{
			aLink.displayLink();
			System.out.println("");
		}
		theList.display();
	}
}
