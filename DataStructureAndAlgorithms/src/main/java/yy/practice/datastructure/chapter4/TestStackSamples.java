package yy.practice.datastructure.chapter4;

import java.util.Random;

import org.junit.Test;

public class TestStackSamples {

	@Test
	public void testBasicFuntions() {
		MyStack testStack = new MyStack(10);

		System.out.println("Start to push.");
		while (!testStack.isFull()) {
			testStack.push(getRandomChar());
			testStack.display();
		}

		System.out.println("Start to pop.");
		while (!testStack.isEmpty()) {
			testStack.pop();
			testStack.display();
		}

	}
	
	@Test
	public void testReverse() {
		String s = SampleStringReverser.doReverse("1a2b3c4d5f    ");
		System.out.println(s);
	}
	
	@Test
	public void testBracketsChecker() {
		boolean b =SampleBracketsChecker.doCheck("(asdf{as{df}sd})[<>]f");
		System.out.println(b);
	}
	
	private char getRandomChar() {
		Random random = new Random();
		if(random.nextBoolean()){
			return (char)(random.nextInt(10)+'0');
		}else{
			return (char)(random.nextInt(26)+'A');
		}

	}

}
