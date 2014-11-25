package yy.practice.thinkinginjava.innerclass;


public class OuterClass {

	public void f(){
		System.out.println("print from OuterClass.");
	}

	public class InnerClass{
		public void f(){
			System.out.println("print from InnerClass.");
		}
		
		public OuterClass get(){
			return OuterClass.this;
		}
	}
	
	public static void main(String[] args){
		OuterClass outerClass = new OuterClass();
		OuterClass outerClass1 = new OuterClass();

		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		outerClass.f();
		innerClass.f();
		System.out.println("outerClass.get()::"+outerClass);
		System.out.println("outerClass1.get()::"+outerClass1);
		System.out.println("innerClass.get()::"+innerClass.get());

	}

}
