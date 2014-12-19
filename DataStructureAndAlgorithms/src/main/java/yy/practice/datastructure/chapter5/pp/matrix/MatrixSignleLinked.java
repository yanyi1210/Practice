package yy.practice.datastructure.chapter5.pp.matrix;

public class MatrixSignleLinked {

	public MatrixLink first;

	private int nRow;
	private int nColumn;

	public MatrixSignleLinked(int nRow, int nColumn) {
		this.nRow = nRow;
		this.nColumn = nColumn;
		init();
	}

	private void init() {

		System.out.println("Init Matrix... nRow=" + nRow + "; nColumn=" + nColumn);

		first = new MatrixLink(1, 1, -1);
		MatrixLink current = first;

		for (int i = 2; i <= nColumn; i++) {
			current.nextInRow = new MatrixLink(1, i, -1);
			current = current.nextInRow;
		}

		int j = 2;
		MatrixLink starter = first;
		MatrixLink previousRowCurrent = null;
		MatrixLink newRowCurrent = null;

		do {
			// Move pointer to the starter of the previous row
			previousRowCurrent = starter;
			// create the new cell in the new row
			newRowCurrent = new MatrixLink(j, 1, -1);
			// Set the column reference in the previous row
			previousRowCurrent.nextInColumn = newRowCurrent;

			for (int i = 2; i <= nColumn; i++) {
				newRowCurrent.nextInRow = new MatrixLink(j, i, -1);
				newRowCurrent = newRowCurrent.nextInRow;
				previousRowCurrent = previousRowCurrent.nextInRow;
				previousRowCurrent.nextInColumn = newRowCurrent;
			}

			starter = starter.nextInColumn;
			j++;
		} while (j <= nRow);

	}

	public double getValue(int rNo, int cNo) {
		MatrixLink current = first;
		if (rNo < nRow && cNo < nColumn) {
			for (int i = 1; i < cNo; i++) {
				current = current.nextInRow;
			}
			for (int i = 1; i < rNo; i++) {
				current = current.nextInColumn;
			}
			return current.getValue();
		} else {
			System.out.println("Axceed the size of the Matrix.");
			return -1;
		}
	}

	public void insert(int rNo, int cNo, double value) {
		System.out.println("Insert ");
		MatrixLink current = first;
		if (rNo < nRow && cNo < nColumn) {
			for (int i = 1; i < cNo; i++) {
				current = current.nextInRow;
			}
			for (int i = 1; i < rNo; i++) {
				current = current.nextInColumn;
			}
			current.setValue(value);
		} else {
			System.out.println("Axceed the size of the Matrix.");
		}
	}

	public void display() {
		System.out.println("Display Matrix...  ");
		MatrixLink starter = first;
		MatrixLink current = null;
		while (starter != null) {
			current = starter;
			while (current != null) {
				System.out.print(current+" ");
				current = current.nextInRow;
			}
			starter = starter.nextInColumn;
			System.out.println("");
		}
		System.out.println("End...  ");
	}
}
