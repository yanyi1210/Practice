package yy.practice.datastructure.chapter5.pp.matrix;

public class MatrixLink {

	private double value;
	private int rNo;
	private int cNo;

	public MatrixLink nextInRow;
	public MatrixLink nextInColumn;

	public MatrixLink(int rNo, int cNo, double value) {
		this.rNo = rNo;
		this.cNo = cNo;
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String toString() {
		String retValue = "[" + this.rNo + "," + this.cNo + "]=" + this.value;
		return retValue;
	}

}
