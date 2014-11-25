package yy.practice.datastructure.chapter4;

/*
 * Infix to Postfix Translation Rules
 * 
 * case: Operand - Write it to output (postfix)
 * case: Open parenthesis '(' - Push it on stack
 * case: close parenthesis ')' - While(stack not empty){
 * 									Pop an item,
 *  								If(item is not '(')  write it to output;
 *  								else Quit loop
 *  							 }
 * case: Operator(opThis) - If(stack is empty), Push opThis to stack
 *  						else{
 *  						    While(stack not empty){
 *    						       Pop an item,
 *      						   If(item is'('), push it,Quit loop
 *      						   else{
 *      						       If(opTop < opThis), push opTop  to stack, Quit loop
 *      						       else output opTop
 *      						   }
 *      						}
 *      						Push opThis to stack
 *      					}
 * case:No more items - While(stack not empty){ Pop item, output it.}
 * 
 */

public class ArithmeticExpressionInPostCoverter {

	private MyStack operatorStack;
	private String output = "";

	public String doConvert(String input) throws Exception {
		try {
			operatorStack = new MyStack(input.length());
			for (int i = 0; i < input.length(); i++) {

				char ch = input.charAt(i);
				System.out.print("For " + ch + "-: output:" + output
						+ ";stack:");
				operatorStack.display();
				processInputChar(ch);

			}// end of for

			while (!operatorStack.isEmpty()) {
				System.out.print("While ");
				operatorStack.display();
				char ch = operatorStack.pop();
				if (ch == '(') {
					System.out.println("Extra ( with no match.");
					throw new Exception();
				} else {
					output += ch;
				}
			}
		} catch (Exception e) {
			System.out.println("Exception in doConvert " + e);
			throw e;
		}
		System.out.print("End ");
		operatorStack.display();
		return output;
	}

	private void processInputChar(char ch) throws Exception {
		switch (ch) {

		case '+':
		case '-':
			gotOperator(ch, 1);
			break;
		case '*':
		case '/':
			gotOperator(ch, 2);
			break;
		case '(':
			operatorStack.push(ch);
			break;
		case ')':
			gotParen(ch);
			break;
		default:
			System.out.println("Add " + ch);
			output += ch;
			break;
		}// end of switch

	}

	// iterate through operatorStack to compare opThis with existing operators:
	// compare precedence of opThis and opTop
	// if opTop has higher precedence, the add it to output string
	// push opThis into operatorStack
	private void gotOperator(char opThis, int precThis) {
		System.out.println("gotOperator:");
		while (!operatorStack.isEmpty()) {
			char opTop = operatorStack.pop();
			if (opTop == '(') {
				operatorStack.push(opTop);
				break;
			} else {
				int precsTop;
				if (opTop == '+' || opTop == '-') {
					precsTop = 1;
				} else {
					precsTop = 2;
				}
				if (precsTop < precThis) { //
					operatorStack.push(opTop);
					break;
				} else {
					output += opTop;
				}
			}// end of else(opTop=='(')
		}// end of whiles
		operatorStack.push(opThis);
	}

	private void gotParen(char ch) throws Exception {
		System.out.println("gotParen:");
		boolean foundParen = false;
		while (!operatorStack.isEmpty()) {

			char chx = operatorStack.pop();
			if (chx == '(') {
				foundParen = true;
				break;
			} else {
				output += chx;
			}// end of else
		}

		if (!foundParen) {
			System.out.println(" ) with no match");
			throw new Exception();
		}
	}

}
