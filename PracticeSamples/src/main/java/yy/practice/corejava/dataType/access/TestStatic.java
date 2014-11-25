package yy.practice.corejava.dataType.access;

public class TestStatic{
	
	
	public static void main(String arg[]){
		 
		SuperClass superClass = new SuperClass();
		SuperClass subClassWithSuperRef = new SubClass();
		SubClass subClass = new SubClass();
		superClass.printMessage();
		subClassWithSuperRef.printMessage();
		subClass.printMessage();
	}
	


}


class SuperClass {
	
	public static final String message = "Hello!";
	
	public static void printMessage(){
		System.out.println("In SuperClass.");
	}
}

class SubClass extends SuperClass{
	
	public static void printMessage(){
		System.out.println("In SubClass.");
//		System.out.println(SuperClass.message);
	}
	
}