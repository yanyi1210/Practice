package yy.practice.cc150.chapter14;

public class CircularArraySolution<T> {

	private T[] array;
	private int size;
	private int index;

	@SuppressWarnings("unchecked")
	public CircularArraySolution(int size) {
		array = (T[]) new Object[size];
		index = 0;
		this.size = size;
	}

	public T[] retote(int leftSteps) {

		@SuppressWarnings("unchecked")
		T[] temp = (T[]) new Object[size];
		int index = size - leftSteps;
		for (T t : array) {
			temp[index] = t;
			index++;
			if (index > size - 1) {
				index = 0;
			}
		}
		this.array = temp;
		return this.array;
	}

	public void display() {
		for (T t : array) {
			System.out.print(t.toString() + " ");
		}
	}

	public void add(T t) {
		if (index == size) {
			System.out.println("The Array is full.");
		}
		array[index++] = t;
	}

	/*
	 * public void setArray(T[] array) { this.array = array; }
	 */
}
