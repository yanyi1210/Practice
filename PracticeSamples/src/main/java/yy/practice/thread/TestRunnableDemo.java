package yy.practice.thread;

import org.junit.Test;

public class TestRunnableDemo {

	@Test
	public void test() {
//		try {
			RunnableDemo R1 = new RunnableDemo("Thread-1");
			start(R1);

			RunnableDemo R2 = new RunnableDemo("Thread-2");
			start(R2);

//			Thread.currentThread().join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	/*
	 * @Test public void test2() { try { RunnableDemo R1 = new
	 * RunnableDemo("Thread-1"); R1.start();
	 * 
	 * RunnableDemo R2 = new RunnableDemo("Thread-2"); R2.start();
	 * 
	 * Thread.currentThread().join(); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */

	public void start(RunnableDemo r) {
		System.out.println("Starting " + r.getThreadName());
		if (r.getT() == null) {

			try {
				r.setT(new Thread(r, r.getThreadName()));
				r.getT().join();
				r.getT().start();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
