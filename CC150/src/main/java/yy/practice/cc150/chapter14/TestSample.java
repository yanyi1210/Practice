package yy.practice.cc150.chapter14;

import org.junit.Test;

public class TestSample {

	@Test
	public void testCircularArray() {
		int size = 10;
		CircularArray<Integer> cArray = new CircularArray<Integer>(size);

		for (int i = 1; i <= size; i++) {
			cArray.add(i);
		}

		cArray.display();
		System.out.println("Begin retote.");
		cArray.retote(3);
		cArray.display();
	}

}
