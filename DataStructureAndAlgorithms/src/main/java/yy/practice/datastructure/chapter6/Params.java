package yy.practice.datastructure.chapter6;

public class Params {

	public int n;
	public int returnAddress;

	public Params(int n_, int returnAddress_) {
		n = n_;
		returnAddress = returnAddress_;
	}

	public String toString() {
		final String TAB = "    ";

		String retValue = "";

		retValue = "Params ( " + super.toString() + TAB + "n = " + this.n + TAB
				+ "returnAddress = " + this.returnAddress + TAB + " )";

		return retValue;
	}

}
