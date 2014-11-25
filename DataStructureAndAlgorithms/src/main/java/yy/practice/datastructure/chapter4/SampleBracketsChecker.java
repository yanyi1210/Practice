package yy.practice.datastructure.chapter4;

public class SampleBracketsChecker {

	public static boolean doCheck(String input) {

		boolean match = true;

		MyStack brackets = new MyStack(input.length());

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			switch (ch) {
			case '{':
			case '[':
			case '(':
			case '<':
				brackets.push(ch);
				brackets.display();
				break;

			case '}':
			case ']':
			case ')':
			case '>':
				if (brackets.isEmpty()) {
					match = false;
				} else {
					char chx = brackets.pop();
					System.out.print(chx);
					System.out.println(ch);
					if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[')
							|| (ch == ')' && chx != '(')
							|| (ch == '>' && chx != '<')) {
						match = false;
					}
				}
				break;
			default:
				break;
			}

		}

		if (!brackets.isEmpty()) {
			match = false;
			brackets.display();
		}
		return match;

	}
}
