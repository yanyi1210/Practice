package yy.practice.datastructure.chapter4.pp;

public class Customer {

	public CustomerQueue chooseChecker(Checker[] checkers, int noOfCheckers) {
		CustomerQueue currentQue;
		CustomerQueue shortest = checkers[0].getCustomerQue();
		for (int i = 0; i < noOfCheckers; i++) {
			currentQue = checkers[i].getCustomerQue();
			if (currentQue.getnItems() < shortest.getnItems()) {
				shortest = currentQue;
			}
		}
		shortest.insert(this);
		return shortest;
	}

}
