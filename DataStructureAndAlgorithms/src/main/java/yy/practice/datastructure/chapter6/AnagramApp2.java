package yy.practice.datastructure.chapter6;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class AnagramApp2 {

	public int size;
	public int count;
	public char[] array;
	public Set<String> uniqueAnagram;

	public void doAnagram(String input) {
		size = input.length();
		array = new char[size];
		uniqueAnagram = new HashSet<String>();
		count = 0;
		for (int i = 0; i < size; i++) {
			array[i] = input.charAt(i);
		}
		System.out.print("Get array:");
		for (int j = 0; j < size; j++) {
			System.out.print(array[j]);
		}
		System.out.println("");

		doAnagram(size);

	}
	
	private void doAnagram(int size_) {
		System.out.println("Enter doAnagram("+size_+")");
		if (size_ == 1) {
			System.out.println("size_="+size_+" return");
			return;
		}
		
		for (int i = 0; i < size_; i++) {
			System.out.println("size_="+size_+";i="+i);
			doAnagram(size_ - 1);
			if (size_ == 2) {
				display();
			}
			rotate(size_);
		}
		System.out.println("Complete doAnagram("+size_+"):"+getArrayString());
	}

	//Move the first element in the array to the end
	private void rotate(int size_) {
		System.out.println("rotate("+size_+")");
		int startPoint = size - size_;
		char temp = array[startPoint];
		int i;
		for (i = startPoint + 1; i < size; i++) {
			array[i - 1] = array[i];
		}
		array[i - 1] = temp;
	}

	private void display() {
		System.out.print(++count + ".");
		for (int j = 0; j < size; j++) {
			System.out.print(array[j]);
		}
		System.out.print(" ");
		System.out.flush();
		if (count % 6 == 0) {
			System.out.println("");
		}
	}
	
	private String getArrayString(){
	
		StringBuilder s = new StringBuilder();
		
		for(int i=0; i<size;i++){
			s.append(array[i]);
		}
		return s.toString();
	}
}
