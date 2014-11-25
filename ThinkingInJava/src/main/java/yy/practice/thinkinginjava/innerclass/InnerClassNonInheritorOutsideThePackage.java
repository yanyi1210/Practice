package yy.practice.thinkinginjava.innerclass;

import yy.practice.thinkinginjava.innerclass.InnerClassInheritence;

public class InnerClassNonInheritorOutsideThePackage {

	/**
	 * No enclosing instance of type InnerClassInheritence is accessible to
	 * invoke the super constructor. Must define a constructor and explicitly
	 * qualify its super constructor invocation with an instance of
	 * InnerClassInheritence (e.g. x.super() where x is an instance of
	 * InnerClassInheritence).
	 */
	// public class ChildPublicInnerClass extends InnerClassInheritence.PublicInnerClass{}

	/**
	 * The type InnerClassInheritence.ProtectedInnerClass is not visible since
	 * outerClass no longer inherits from the super outerclass
	 */
	// public class ChildProtectedInnerClass extends InnerClassInheritence.ProtectedInnerClass{}
	/** The type InnerClassInheritence.PrivateInnerClass is not visible */
	// public class ChildPrivateInnerClass extends InnerClassInheritence.PrivateInnerClass {}
	// public class ChildDefaultInnerClass extends InnerClassInheritence.DefaultInnerClass {}

	public static void main(String[] args) {

		InnerClassInheritence outerClass = new InnerClassInheritence();

		/**
		 * access to PublicInnerClass ProtectedInnerClassWithPublicConstructor
		 * in other package
		 */
		InnerClassInheritence.PublicInnerClass publicInnerClass = outerClass.new PublicInnerClass();

		/**
		 * The type
		 * InnerClassInheritence.ProtectedInnerClassWithPublicConstructor is not
		 * visible
		 */
		// InnerClassInheritence.ProtectedInnerClass protectedInnerClass = outerClass.new ProtectedInnerClass();
		// InnerClassInheritence.ProtectedInnerClassWithPublicConstructor 
		// 	protectedInnerClassWithPublicConstructor = outerClass.new ProtectedInnerClassWithPublicConstructor();

		/** The type InnerClassInheritence.PrivateInnerClass is not visible */
		// InnerClassInheritence.PrivateInnerClass privateInnerClass = outerClass.new PrivateInnerClass();
		/** The type InnerClassInheritence.DefaultInnerClass is not visible */
		// InnerClassInheritence.DefaultInnerClass defaultInnerClass = outerClass.new DefaultInnerClass();

	}
}
