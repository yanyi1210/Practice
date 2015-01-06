package yy.practice.datastructure.chapter6;

import org.junit.Test;

//6.1
public class MultiplicationApp {

	int count = 0;

	@Test
	public void test() {
		System.out.println(mult(6, 0));
		System.out.println(count);

	}

	public int mult(int x, int y) {

		if (x == 0 || y == 0) {
			return 0;
		} else if ((x < 0 && y > 0) || (x > 0 && y < 0)) {
			return -multAbsolute(getAbsoluteValue(x), getAbsoluteValue(y));
		} else {
			return multAbsolute(getAbsoluteValue(x), getAbsoluteValue(y));
		}

	}

	private int multAbsolute(int x, int y) {

		if (x <= y) {
			return plusRecursive(x, y);
		} else {
			return plusRecursive(y, x);
		}
	}

	private int getAbsoluteValue(int value) {
		if (value < 0) {
			return -value;
		} else {
			return value;
		}
	}

	private int plusRecursive(int small, int large) {
		count++;

		if (small == 1) {
			return large;
		} else {
			return plusRecursive(small - 1, large) + large;
		}
	}

}
