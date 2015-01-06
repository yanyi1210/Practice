package yy.practice.datastructure.chapter6;

import org.junit.Test;

//6.3
public class RaisingANumberToAPower {
	int count;

	@Test
	public void test() {
		count=0;
		System.out.println(raisingToPower(2, 20));
		System.out.println(count);

	}

	public int raisingToPower(int number, int power) {
		System.out.println("number=" + number + ";power=" + power);
		int result;
		if (power == 0) {
			result = 1;
		} else if (power == 1) {
			result = number;
		} else if (power == 2) {
			count++;
			result = number * number;
		} else {
			
			if (power % 2 == 0) {
				result = raisingToPower(raisingToPower(number, 2), power / 2);
			} else {
				count++;
				result = number
						* raisingToPower(raisingToPower(number, 2), power / 2);
			}
		}

		return result;

	}

}
