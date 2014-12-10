package yy.practice.datastructure.chapter5;

import java.util.Random;

import org.junit.Test;

public class MyStackAndQueueTest {

	@Test
	public void testBasicStacks() {
		MyStackLinkedList testStack = new MyStackLinkedList();

		System.out.println("Start to push.");
		while (testStack.getCount() <= 5) {
			testStack.push(getRandomDouble());
			testStack.display();
		}

		System.out.println("Start to pop.");
		while (!testStack.isEmpty()) {
			testStack.pop();
			testStack.display();
		}
	}


	@Test
	public void testBasicQueues() {
		MyQueueLinkedList testStack = new MyQueueLinkedList();

		System.out.println("Start to push.");
		while (testStack.getnItems()<= 5) {
			testStack.insert(getRandomDouble());
			testStack.display();
		}

		System.out.println("Start to pop.");
		while (!testStack.isEmpty()) {
			testStack.remove();
			testStack.display();
		}
	}
	private double getRandomDouble() {
		Random random = new Random();
		return random.nextDouble();
	}
}
