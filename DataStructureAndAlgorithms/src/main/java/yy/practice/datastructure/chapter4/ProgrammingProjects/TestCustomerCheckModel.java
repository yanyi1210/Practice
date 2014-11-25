package yy.practice.datastructure.chapter4.ProgrammingProjects;

import org.junit.Test;

public class TestCustomerCheckModel {

	@Test
	public void testCustomerCheckModel() {
		CustomerCheckModel model = new CustomerCheckModel(1);
		System.out.println(Thread.currentThread().getId());
		try {
			checkThread();
			model.runModel(3);
			checkThread();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
