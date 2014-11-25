package yy.practice.corejava.dataType.access;

public class TestFinal {
	
	public final String s = new String("This is the initial value.");
	public final MyString myString = new MyString("This is the initial value.");

	
	public void test(String inputString){
		System.out.println("String: "+s);
		System.out.println("myString: "+myString.toString());
		System.out.println("inputString: "+inputString);

		this.s.replaceAll("initial", inputString);
		System.out.println("String.replaceAll : "+s);
		
		this.changeString(s, "newString");
		System.out.println("this.changeString : "+s);
		
		this.myString.replaceMyString("test");
		System.out.println("myString.replaceMyString: "+myString.toString());
		this.myString.setMyString(inputString); 
		System.out.println("myString: "+myString.toString());
		
		inputString = "New String";
		
		System.out.println("inputString::"+inputString);
	}
	
	public String changeString(String ori, String newString){
		ori=newString;
		return ori;
	}
	
	public static void main(String[] ars){
		String s = "Test";
		TestFinal test = new TestFinal();
		System.out.println("s::"+s);
		test.test(s);
		System.out.println("s::"+s);

	}

}

class MyString{
	
	public String myString;

	public MyString(String s){
		this.myString = s;
	}
	
	public void replaceMyString(String s){
		this.myString.replaceAll("initial", s);
	}
	
	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

	@Override
	public String toString() {
		return "MyString [myString=" + myString + "]";
	}
	
	
}