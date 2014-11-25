package yy.practice.thinkinginjava.innerclass;

import yy.practice.thinkinginjava.innerclass.InnerClassInheritence;


public class InnerClassInheritorOutsideThePackage extends InnerClassInheritence{
	
	
	public class ChildPublicInnerClass extends PublicInnerClass{}
	
	/** construct in ProtectedInnerClass is protected by default.
	 *  Since ChildProtectedInnerClass inherits from ProtectedInnerClass
	 *  It has access to the constructor inProtectedInnerClass
	 */
	public class ChildProtectedInnerClass extends ProtectedInnerClass{}
	// public class ChildPrivateInnerClass extends PrivateInnerClass {}
	// public class ChildDefaultInnerClass extends DefaultInnerClass {}
	
	public static void main(String[] args){
		
		InnerClassInheritence outerClass = new InnerClassInheritence();
		
		/** access to PublicInnerClass ProtectedInnerClassWithPublicConstructor in other package*/
		InnerClassInheritence.PublicInnerClass publicInnerClass = outerClass.new PublicInnerClass();
		
		/** construct in ProtectedInnerClass is protected by default.
		 *  InnerClassInheritor does not have access to the constructor in ProtectedInnerClass
		 *  but can access constructor in ProtectedInnerClassWithPublicConstructor
		 */
		//InnerClassInheritence.ProtectedInnerClass protectedInnerClass = outerClass.new ProtectedInnerClass();
		InnerClassInheritence.ProtectedInnerClassWithPublicConstructor protectedInnerClassWithPublicConstructor = outerClass.new ProtectedInnerClassWithPublicConstructor();
		
		/**The type InnerClassInheritence.PrivateInnerClass is not visible*/
		// InnerClassInheritence.PrivateInnerClass privateInnerClass = outerClass.new PrivateInnerClass();
		/**The type InnerClassInheritence.DefaultInnerClass is not visible*/
		// InnerClassInheritence.DefaultInnerClass defaultInnerClass = outerClass.new DefaultInnerClass();

	}
}


