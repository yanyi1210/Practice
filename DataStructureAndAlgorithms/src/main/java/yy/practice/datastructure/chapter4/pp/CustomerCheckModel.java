package yy.practice.datastructure.chapter4.pp;

import java.util.Random;

public class CustomerCheckModel {

	private Checker[] checkers = new Checker[10];
	private Thread[] checkerThreads = new Thread[10];
	private int noOfCheckers;
	private CustomerQueue customerEntrance;
	private Random randon = new Random();
	private static int maxSize = 100;

	public CustomerCheckModel(int noOfCheckers) {
		this.noOfCheckers = noOfCheckers;
		customerEntrance = new CustomerQueue(maxSize, "CustomerEntrance::");
	}

	private void init() throws InterruptedException {
		System.out.println("Init CustomerCheckModel");

		for (int i = 0; i < noOfCheckers; i++) {
			checkers[i] = new Checker(i, 3);
			checkerThreads[i] = new Thread(checkers[i]);
			String threadName = checkers[i].getThreadName();
			checkerThreads[i].start();
			System.out.println(threadName + " start working.");
		}

		for (int i = 0; i < noOfCheckers; i++) {
			checkerThreads[i].join();
		}

	}

	public void runModel(int runTimes) throws InterruptedException {
		init();
		while (runTimes > 0) {
			System.out.println("=============================== remain times::"
					+ runTimes + " =================================");
			newCustomerIn();
			while (!customerEntrance.isEmpty()) {
				customerEntrance.remove().chooseChecker(checkers, noOfCheckers);
			}
			Thread.currentThread().notifyAll();
			runTimes--;
		}

		System.out.println("End runModel");
	}

	private void newCustomerIn() {

		int noOfNewCustomers = randon.nextInt(5);
		System.out.println(noOfNewCustomers + " customers entered.");
		while (noOfNewCustomers > 0) {
			customerEntrance.insert(new Customer());
			noOfNewCustomers--;
		}
	}

}
