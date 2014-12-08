package yy.practice.datastructure.chapter5;

public class MyLink {

	private int iData; 
	private double dData;
	// next link in list
//	public MyLink next;
	private MyLink next;

	public MyLink(int id, double dd) // constructor
	{
		iData = id; // initialize data
		dData = dd; // (‘next’ is automatically set to null)
	}

	public void displayLink() // display ourself
	{
		System.out.print("{" + iData + "'" + dData + "} ");
	}

	public int getiData() {
		return iData;
	}

	public void setiData(int iData) {
		this.iData = iData;
	}

	public double getdData() {
		return dData;
	}

	public void setdData(double dData) {
		this.dData = dData;
	}

	public MyLink getNext() {
		return next;
	}

	public void setNext(MyLink next) {
		this.next = next;
	}

}
