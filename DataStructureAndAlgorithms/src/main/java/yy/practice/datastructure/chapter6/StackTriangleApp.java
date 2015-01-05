package yy.practice.datastructure.chapter6;

public class StackTriangleApp {

	static int inputNumber;
	static int theAnswer;
	static StackX paramStack;
	static int codePart;
	static Params params;

	public static void main(String[] args) {
		for (int i = 9; i < 10; i++) {
			inputNumber = i;
			recTriangle(inputNumber);
			System.out.print("Triangle=" + theAnswer + " "
					+ paramStack.isEmpty());
		}
	}

	private static void recTriangle(int theNumber) {
		paramStack = new StackX(10000);
		codePart = 1;
		while (step() == false) {
			System.out.print("Answer=" + theAnswer + "; ");
			paramStack.display();
		}

	}

	private static boolean step() {
		switch (codePart) {
		// initial call: create first param with input number and return address
		case 1:
			params = new Params(inputNumber, 6);
			paramStack.push(params);
			codePart = 2;
			break;
		// Get the top param from stack
		// if value=1(end of getting the last number) return to address 6
		// else return to address 3
		case 2:
			params = paramStack.peek();
			if (params.n == 1) {
				theAnswer = 1;
				codePart = 5;
			} else {
				codePart = 3;
			}
			break;
		// breaking down the input number by 1
		// Create new param with the value params.n - 1
		// set return address to 4
		case 3:
			Params newParams = new Params(params.n - 1, 4);
			paramStack.push(newParams);
			codePart = 2;
			break;
		// Add all the numbers in stack to answer
		// Get the top param from stack and add it to answer
		// set return address to 5
		case 4:
			params = paramStack.peek();
			theAnswer = theAnswer + params.n;
			codePart = 5;
			break;
		// update return address the the top param in stack
		// Get the top param from stack and update return Address
		// remove the top param from stack;
		case 5:
			params = paramStack.peek();
			codePart = params.returnAddress;
			paramStack.pop();
			break;
		// Exist method
		case 6:
			return true;

		}
		return false;
	}

}
