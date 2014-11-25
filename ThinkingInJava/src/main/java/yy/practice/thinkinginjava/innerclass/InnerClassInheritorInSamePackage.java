package yy.practice.thinkinginjava.innerclass;


public class InnerClassInheritorInSamePackage extends InnerClassInheritence {

	public class ChildPublicInnerClass extends PublicInnerClass {}
	public class ChildProtectedInnerClass extends ProtectedInnerClass {}
	public class ChildDefaultInnerClass extends DefaultInnerClass {}
	// public class ChildPrivateInnerClass extends PrivateInnerClass {}
	
	
	public static void main(String[] args) {

		InnerClassInheritence outerClass = new InnerClassInheritence();
		/** access to PublicInnerClass DefaultInnerClass ProtectedInnerClass in the same package  */
		InnerClassInheritence.PublicInnerClass publicInnerClass = outerClass.new PublicInnerClass();
		InnerClassInheritence.DefaultInnerClass defaultInnerClass = outerClass.new DefaultInnerClass();
		InnerClassInheritence.ProtectedInnerClass protectedInnerClass = outerClass.new ProtectedInnerClass();
		InnerClassInheritence.ProtectedInnerClassWithPublicConstructor protectedInnerClassWithPublicConstructor = outerClass.new ProtectedInnerClassWithPublicConstructor();

		/** The type InnerClassInheritence.PrivateInnerClass is not visible */
		// InnerClassInheritence.PrivateInnerClass privateInnerClass =
		// outerClass.new PrivateInnerClass();

	}
}
