/*
 * Implement atoi to convert a string to an integer.
 * Hint: Carefully consider all possible input cases. 
 * If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
 * You are responsible to gather all the input requirements up front. 
 * Requirements for atoi:
 *  The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. 
 *  Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, 
 *  and interprets them as a numerical value.
 *  The string can contain additional characters after those that form the integral number,
 *  which are ignored and have no effect on the behavior of this function.
 *  If the first sequence of non-whitespace characters in str is not a valid integral number, 
 *  or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 *  If no valid conversion could be performed, a zero value is returned. 
 *  If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 */
package yy.practice.leetcode.freqency5;

import org.junit.Test;

public class StringtoInteger_Atoi {

	public static int INT_MAX = 2147483647;
	public static int INT_MIN = -2147483648;

	@Test
	public void testAtoi() {
//		System.out.println(atoi("13"));
//		System.out.println(atoi("   -13"));
//		System.out.println(atoi("++13"));
//		System.out.println(atoi("--13"));
//		System.out.println(atoi("-+13"));
//		System.out.println(atoi("+-13"));
//		System.out.println(atoi("2147483647"));
//		System.out.println(atoi("-2147483648"));
//		System.out.println(atoi("2147483648"));
//		System.out.println(atoi("-2147483649"));
//		System.out.println(atoi("2147483648000"));
		System.out.println(atoi(" -0012a42"));
		System.out.println(atoi(" b11228552307"));
		System.out.println(atoi("123 456"));

	}

	public int atoi(String str) {

		char[] chars = str.toCharArray();
		int number = 0;

		if (chars != null && chars.length > 0) {

			boolean numberStart = false;
			int checkPoint = INT_MAX / 10;
			char sign = ' ';
			for (char c : chars) {

				if (c == '-') {
					if (sign == ' ') {
						sign = c;
						numberStart = true;
					} else {
						return 0;
					}

				} else if (c == '+') {
					if (sign == ' ') {
						sign = c;
						numberStart = true;
					} else {
						return 0;
					}

				} else if (c == ' ') {
					if (!numberStart) {
						continue;
					} else {
						return number;
					}

				} else if (c >= '0' && c <= '9') {
					if (!numberStart) {
						numberStart = true;
					}
					int digit = c - '0';

					if (number < checkPoint && number > -checkPoint) {

						if (sign == '-') {
							number = number * 10 - digit;
						} else {
							number = number * 10 + digit;
						}

					} else if (number == checkPoint && digit <= 7) {
						number = number * 10 + digit;

					} else if (number == -checkPoint && digit <= 8) {
						number = number * 10 - digit;
					} else {
						if (sign == '-') {
							return INT_MIN;

						} else {
							return INT_MAX;
						}
					}
				} else {
					if (!numberStart) {
						return 0;
					} else {
						return number;
					}
				}

			}
		}
		return number;
	}
}
