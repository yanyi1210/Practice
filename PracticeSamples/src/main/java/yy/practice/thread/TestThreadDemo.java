package yy.practice.thread;

public class TestThreadDemo {

	private Thread[] testThreads = new Thread[5];
	private int n;
	
	public TestThreadDemo(int n){
		this.n=n;
	}

	public void test() throws Exception {

		for (int i = 0; i < n; i++) {
			testThreads[i] = new Thread(new ThreadDemo(500 * i));
			testThreads[i].start();
		}
		for (int i = 0; i < n; i++) {
			testThreads[i].join();
		}

		checkThread();
	}

	private void checkThread() {
		int active = Thread.activeCount();
		Thread all[] = new Thread[active];
		Thread.enumerate(all);
		for (int i = 0; i < active; i++) {
			System.out.println(i + ": " + all[i]);
		}
	}
}
