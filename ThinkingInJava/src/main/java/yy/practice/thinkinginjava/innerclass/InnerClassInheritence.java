package yy.practice.thinkinginjava.innerclass;

public class InnerClassInheritence {

	private class PrivateInnerClass implements SuperClass {

		public void f() {
			System.out.println("PrivateInnerClass");
		}
	}

	protected class ProtectedInnerClass implements SuperClass {
		public void f() {
			System.out.println("ProtectedInnerClass");
		}
	}

	protected class ProtectedInnerClassWithPublicConstructor implements
			SuperClass {

		public ProtectedInnerClassWithPublicConstructor() {
			// TODO Auto-generated constructor stub
		}

		protected ProtectedInnerClassWithPublicConstructor(String s) {
			// TODO Auto-generated constructor stub
		}
		public void f() {
			System.out.println("ProtectedInnerClass");
		}
	}

	public class PublicInnerClass implements SuperClass {
		public void f() {
			System.out.println("PublicInnerClass");
		}
	}

	protected class DefaultInnerClass implements SuperClass {
		public void f() {
			System.out.println("DefaultInnerClass");
		}
	}

	public static void main(String[] args) {
		InnerClassInheritence outerClass = new InnerClassInheritence();
		InnerClassInheritence.PrivateInnerClass privateInnerClass = outerClass.new PrivateInnerClass();
		InnerClassInheritence.ProtectedInnerClass protectedInnerClass = outerClass.new ProtectedInnerClass();
		InnerClassInheritence.PublicInnerClass publicInnerClass = outerClass.new PublicInnerClass();
		InnerClassInheritence.DefaultInnerClass defaultInnerClass = outerClass.new DefaultInnerClass();

	}
}


interface SuperClass {
	void f();
}
