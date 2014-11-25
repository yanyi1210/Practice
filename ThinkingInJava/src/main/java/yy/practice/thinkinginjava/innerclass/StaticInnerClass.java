package yy.practice.thinkinginjava.innerclass;



public class StaticInnerClass {

	public void f(){
		System.out.println("print from OuterClass.");
	}
	
	public InnerClass getInner(){
		return new InnerClass();
	}
	
	public static InnerClass getInner2(){
		return new InnerClass();
	}
	
	public static class InnerClass {
		
		void f() {
			System.out.println("print from InnerClass.");
		}

		/*
		 * No enclosing instance of the type StaticInnerClass is accessible in
		 * scope
		 * 
		 * StaticInnerClass getOuterClass(){ return StaticInnerClass.this; }
		 */
	}
	
	
	public static void main(String[] args){
		StaticInnerClass outerClass = new StaticInnerClass();
		StaticInnerClass.InnerClass innerClass = new InnerClass();

		InnerClass innerClass2 = new InnerClass();
		outerClass.f();
		innerClass.f();
		System.out.println("outerClass::"+outerClass);
		System.out.println("outerClass.getInner()::"+outerClass.getInner());
		System.out.println("getInner2()::"+getInner2());
		System.out.println("innerClass::"+innerClass);
		System.out.println("innerClass2::"+innerClass2);

	}
	
}


class AnotherClass{
	
}