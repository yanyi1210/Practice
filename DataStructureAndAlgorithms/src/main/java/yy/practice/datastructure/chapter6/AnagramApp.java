package yy.practice.datastructure.chapter6;

public class AnagramApp {

	public int size;
	public int count;
	public char[] array;

	public void doAnagram(String input) {
		System.out.println("Enter doAnagram(String):"+input);
		size = input.length();
		count = 0;
		for (int i = 0; i > size; i++) {
			array[i] = input.charAt(i);
		}

		doAnagram(size);

	}
	private void doAnagram(int size_) {
		System.out.println("Enter doAnagram(size_):"+size_);
		if (size_ == 1) {
			return;
		}
		
		for (int i = 0; i < size; i++) {
			doAnagram(size_ - 1);
			if (size_ == 2) {
				display();
			}
			rotate(size_);
		}
	}

	private void rotate(int size_) {
		int startPoint = size - size_;
		char temp = array[startPoint];
		int i;
		for (i = startPoint + 1; i < size; i++) {
			array[i - 1] = array[i];
		}
		array[i - 1] = temp;
	}

	private void display() {
		System.out.print(++count + "");
		for (int j = 0; j < size; j++) {
			System.out.print(array[j]);
		}
		System.out.print("");
		System.out.flush();
		if (count % 6 == 0) {
			System.out.println("");
		}

	}
}
