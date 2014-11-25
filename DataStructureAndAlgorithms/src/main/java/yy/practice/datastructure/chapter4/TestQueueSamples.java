package yy.practice.datastructure.chapter4;

import java.util.Random;

import org.junit.Test;

public class TestQueueSamples {

	@Test
	public void testMyQueueWithN() {
		MyQueueWithN testQueue = new MyQueueWithN(10);

		Random random = new Random();
		for (int i = 1; i <= 15; i++) {
			if (random.nextBoolean()) {
				testQueue.insert(getRandomChar());
			} else {
				testQueue.remove();
			}
			testQueue.display();
		}

	}

	@Test
	public void testInsertMyQueueWithN() {
		MyQueueWithN testQueue = new MyQueueWithN(10);

		for (int i = 1; i <= 10; i++) {
			testQueue.insert(getRandomChar());
			testQueue.display();
		}

		testQueue.remove();
		testQueue.insert(getRandomChar());
		testQueue.display();
	}

	@Test
	public void testMyQueueWithoutN() {
		MyQueueWithoutN testQueue = new MyQueueWithoutN(10);

		Random random = new Random();
		for (int i = 1; i <= 10; i++) {
			if (random.nextBoolean()) {
				testQueue.insert(getRandomChar());
			} else {
				testQueue.remove();
			}
			testQueue.display();
		}

	}

	@Test
	public void testInsertMyQueueWithouN() {
		MyQueueWithoutN testQueue = new MyQueueWithoutN(10);

		for (int i = 1; i <= 10; i++) {
			testQueue.insert(getRandomChar());
			testQueue.display();
		}

		testQueue.remove();
		testQueue.insert(getRandomChar());
		testQueue.display();
	}

	@Test
	public void testMyQueueDeque() {
		MyQueueDeque testQueue = new MyQueueDeque(10);
		Random random = new Random();

		for (int i = 1; i <= 10; i++) {
			if (random.nextBoolean()) {
				if (random.nextBoolean()) {
					testQueue.insertLeft(getRandomChar());
				} else {
					testQueue.insertRight(getRandomChar());
				}
			} else {
				if (random.nextBoolean()) {
					testQueue.removeLeft();
				} else {
					testQueue.removeRight();
				}
				// testQueue.display();
			}
		}
	}

	@Test
	public void testInsertMyQueueDeque() {
		MyQueueDeque testQueue = new MyQueueDeque(10);
		Random random = new Random();

		for (int i = 1; i <= 11; i++) {

			if (random.nextBoolean()) {
				testQueue.insertLeft(getRandomChar());
			} else {
				testQueue.insertRight(getRandomChar());
			}

			testQueue.display();
		}
		for (int i = 1; i <= 11; i++) {
			if (random.nextBoolean()) {
				testQueue.removeLeft();
			} else {
				testQueue.removeRight();
			}
			testQueue.display();

		}

		for (int i = 1; i <= 3; i++) {

			if (random.nextBoolean()) {
				testQueue.insertLeft(getRandomChar());
			} else {
				testQueue.insertRight(getRandomChar());
			}
			testQueue.display();
		}
	}

	@Test
	public void testMyQueuePriority() {
		MyQueuePriority testQ = new MyQueuePriority(10);
		for (int i = 1; i <= 10; i++) {
			testQ.insert(getRandomChar());
			testQ.display();
		}

	}

	private char getRandomChar() {
		Random random = new Random();
		if (random.nextBoolean()) {
			return (char) (random.nextInt(10) + '0');
		} else {
			return (char) (random.nextInt(26) + 'A');
		}

	}

}
