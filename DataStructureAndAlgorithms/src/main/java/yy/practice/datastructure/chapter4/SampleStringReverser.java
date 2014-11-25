package yy.practice.datastructure.chapter4;

public class SampleStringReverser {

	public static String doReverse(String input) {
		String output = "";
		
		MyStack inputArray = new MyStack(input.length());
		for(int i=0;i<input.length();i++){
			inputArray.push(input.charAt(i));
		}

		while(!inputArray.isEmpty()){
			output = output+inputArray.pop();
		}
		return output;
	}

}
