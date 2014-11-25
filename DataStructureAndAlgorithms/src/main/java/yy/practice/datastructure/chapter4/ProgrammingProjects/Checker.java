package yy.practice.datastructure.chapter4.ProgrammingProjects;

import java.util.Random;

public class Checker implements Runnable {

	private CustomerQueue customerQue;
	private int workTimes;
	private Random randon;
	private int checkerNo;
	private int maxSize = 100;
	private String threadName;

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public Checker(int no, int runtimes) {
		checkerNo = no;
		workTimes = runtimes;
		threadName = "Checker" + checkerNo;
		this.customerQue = new CustomerQueue(maxSize, threadName + "::");
		randon = new Random();
		System.out.println(customerQue.getQueMessage() + " created.");
	}

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		threadName = threadName + "(" + t.getId() + ")";
		long waitTime;
		boolean working = true;
		try {
			while (working) {
				waitTime = getProcessTime();
				if (!customerQue.isEmpty()) {
					customerQue.display();
					Customer temp = customerQue.remove();
					System.out
							.println(threadName + " is helping Customer@"
									+ temp.hashCode() + ", please wait for "
									+ waitTime);
				} else {
					if (workTimes > 1) {
						System.out.println(threadName
								+ " Que is empty, wait for " + waitTime
								+ " remain workTimes " + workTimes);
						synchronized (t) {
							t.wait();
						}
					} else {
						working = false;
					}
				}
				Thread.sleep(waitTime);
			}

		} catch (InterruptedException e) {
			System.out.println(threadName + " InterruptedException");
		} finally {
			System.out.println(threadName + " End");

		}

	}

	private long getProcessTime() {
		return (long) ((randon.nextInt(3) + 1) * 500);
	}

	public CustomerQueue getCustomerQue() {
		return customerQue;
	}

	public int workTimesCountDown() {
		return workTimes--;
	}

	public int getWorkTimes() {
		return workTimes;
	}
}
