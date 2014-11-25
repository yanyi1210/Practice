package yy.practice.thread;

public class ThreadDemo implements Runnable {

	private long waitTime;

	public ThreadDemo(long waitTime) {
		this.waitTime = waitTime;
	}

	public void run() {
		Thread t = Thread.currentThread();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(t.getName() + ":: i=" + i);
				Thread.sleep(waitTime);
			}
			System.out.println("End");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(t.getName());
		// checks if this thread is alive
		System.out.println(", status = " + t.isAlive());
	}

}
