package yy.practice.datastructure.chapter6;

import org.junit.Test;

//6.2
public class PrintBinaryTree {

	public static char[] array;
	public int length;

	@Test
	public void test() {
		printBinaryTree(5);
	}

	public void printBinaryTree(int nlevels) {
		System.out.println("printBinaryTree nlevels=" + nlevels);
		length = twoToPower(nlevels - 1);
		array = new char[length];
		System.out.println("length=" + length);
		for (int level = 1; level <= nlevels; level++) {
			System.out.println("level=" + level);
			initArray();
			makeBranches(0, length - 1, twoToPower(nlevels - level) - 1);
			display(array);
		}
	}

	private void makeBranches(int left, int right, int space) {
		// System.out.println("makeBranches left=" + left + ";right=" + right
		// + ";space=" + space);
		int middle = (left + right) / 2;
		if (right - left <= space) {
			array[middle] = 'X';
		} else {
			makeBranches(left, middle, space);
			makeBranches(middle + 1, right, space);
		}
	}

	private int twoToPower(int power) {
		// System.out.print("twoToPower " + power + ":");
		int result = 1;
		if (power == 0) {
			return result;
		} else {
			while (power > 0) {
				result = result * 2;
				power--;
			}
			return result;
		}
	}

	private void display(char[] array2) {
		for (char c : array2) {
			System.out.print(c);
		}
		System.out.println("");
	}

	private void initArray() {
		for (int i = 0; i < length; i++) {
			array[i] = '-';
		}
	}

}
