package yy.practice.datastructure.chapter5.pp.circlelink;

public class MyLink {

	private double data;
	private MyLink next;

	public MyLink(double dd) {
		data = dd;
	}

	public void displayLink() {
		System.out.print(data + "} ");
	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public MyLink getNext() {
		return next;
	}

	public void setNext(MyLink next) {
		this.next = next;
	}

}
