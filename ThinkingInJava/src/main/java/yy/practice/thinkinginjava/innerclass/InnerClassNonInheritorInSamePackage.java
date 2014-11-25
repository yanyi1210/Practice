package yy.practice.thinkinginjava.innerclass;

import yy.practice.thinkinginjava.innerclass.InnerClassInheritence;


public class InnerClassNonInheritorInSamePackage {
	
	
	/**
	 * No enclosing instance of type InnerClassInheritence is accessible to
	 * invoke the super constructor. Must define a constructor and explicitly
	 * qualify its super constructor invocation with an instance of
	 * InnerClassInheritence (e.g. x.super() where x is an instance of
	 * InnerClassInheritence).
	 */
	//	public class ChildPublicInnerClass extends InnerClassInheritence.PublicInnerClass{}
	
	/**
	 * No enclosing instance of type InnerClassInheritence is accessible to
	 * invoke the super constructor. Must define a constructor and explicitly
	 * qualify its super constructor invocation with an instance of
	 * InnerClassInheritence (e.g. x.super() where x is an instance of
	 * InnerClassInheritence).
	 */
	//	public class ChildProtectedInnerClass extends InnerClassInheritence.ProtectedInnerClass{}
	
	/**The type InnerClassInheritence.PrivateInnerClass is not visible*/
	//	public class ChildPrivateInnerClass extends InnerClassInheritence.PrivateInnerClass {}
	
	/**
	 * No enclosing instance of type InnerClassInheritence is accessible to
	 * invoke the super constructor. Must define a constructor and explicitly
	 * qualify its super constructor invocation with an instance of
	 * InnerClassInheritence (e.g. x.super() where x is an instance of
	 * InnerClassInheritence).
	 */
	//	public class ChildDefaultInnerClass extends InnerClassInheritence.DefaultInnerClass {}
	
	public static void main(String[] args){
		
		InnerClassInheritence outerClass = new InnerClassInheritence();
		
		/** access to PublicInnerClass ProtectedInnerClass DefaultInnerClass in the same package*/
		InnerClassInheritence.PublicInnerClass publicInnerClass = outerClass.new PublicInnerClass();
		InnerClassInheritence.ProtectedInnerClass protectedInnerClass = outerClass.new ProtectedInnerClass();
		InnerClassInheritence.ProtectedInnerClassWithPublicConstructor protectedInnerClassWithPublicConstructor = outerClass.new ProtectedInnerClassWithPublicConstructor();
		InnerClassInheritence.DefaultInnerClass defaultInnerClass = outerClass.new DefaultInnerClass();

		/**The type InnerClassInheritence.PrivateInnerClass is not visible*/
		//	InnerClassInheritence.PrivateInnerClass privateInnerClass = outerClass.new PrivateInnerClass();

	}
}


