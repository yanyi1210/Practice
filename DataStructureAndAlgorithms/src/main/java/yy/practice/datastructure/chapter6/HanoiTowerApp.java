package yy.practice.datastructure.chapter6;

public class HanoiTowerApp {

	static int nDisks = 5;
	static int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public static void main(String[] args) {
		doHanoiTower(nDisks, 'A', 'B', 'C');
	}

	private static void doHanoiTower(int nDisks2, char from, char to, char inter) {
		if (nDisks2 == 1) {
			System.out.println("Move " + array[0] + " from " + from + " to " + to);
		} else {
			doHanoiTower(nDisks2 - 1, from, inter, to);
			System.out.println("Move " + array[nDisks2 - 1] + " from " + from + " to " + to);
			doHanoiTower(nDisks2 - 1, inter, to, from);
		}
	}

}
