package yy.practice.datastructure.chapter4;

/*
 * Evaluating a Postfix Expression
 * Operand - Push it onto the stack.
 * Operator - Pop the top two operands from the stack and apply the operator to them. Push the result.
 * 
 */

public class ArithmeticExpressionParsePost {

	private MyStack operandStack;

	public int doParse(String s) {

		operandStack = new MyStack(s.length());
		char ch;
		int j;
		int num1, num2, interAns;

		for (j = 0; j < s.length(); j++) {

			ch = s.charAt(j);
			System.out.print("ch=" + ch + "::");
			operandStack.displayInt();

			if (ch >= '0' && ch <= '9') {
				operandStack.push(ch);
			} else {
				num2 = getInt(operandStack.pop());
				num1 = getInt(operandStack.pop());

				switch (ch) {

				case '+':
					interAns = num1 + num2;
					break;
				case '-':
					interAns = num1 - num2;
					break;
				case '*':
					interAns = num1 * num2;
					break;
				case '/':
					interAns = num1 / num2;
					break;
				default:
					interAns = 0;
				}// end switch
				operandStack.push(getChar(interAns));
			}// end else
		}// end for
		interAns = getInt(operandStack.pop());
		return interAns;
	}

	private int getInt(char c) {
		return (int) (c - '0');
	}

	private char getChar(int i) {
		return (char) (i + '0');
	}
}
