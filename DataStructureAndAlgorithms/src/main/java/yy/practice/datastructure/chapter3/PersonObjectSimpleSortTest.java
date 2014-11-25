package yy.practice.datastructure.chapter3;

import org.junit.Test;

public class PersonObjectSimpleSortTest {

	@Test
	public void testCompareTo() {
		PersonArray personArray = getTestPersonArray(100);
		personArray.display();
		Person person1 = personArray.getArrayValue(0);
		for (int i = 1; i < personArray.getNoOfElems(); i++) {
			int result = person1.compareTo(personArray.getArrayValue(i));
			System.out.println("person1 vs person" + (i + 1) + ":" + result);
		}

	}

	@Test
	public void testBobbleSort() {
		PersonArray testArray = getTestPersonArray(5);

		testArray.bubbleSort();
		testArray.display();
	}
	
	@Test
	public void testBobbleSortBidirection() {
		PersonArray testArray = getTestPersonArray(5);

		testArray.bubbleSort();
		testArray.display();
	}

	@Test
	public void testSeletionSort() {
		PersonArray testArray = getTestPersonArray(5);
		testArray.selectionSort();
		testArray.display();
	}

	@Test
	public void testInsertionSort() {
		PersonArray testArray = getTestPersonArray(5);
		testArray.insertionSort();
		testArray.display();
	}

	private PersonArray getTestPersonArray(int nElems) {
		PersonArray array = new PersonArray(100);
		for (int i = 0; i < nElems; i++) {
			array.insert(new Person(getRandomLastName(), getRandomFirstName(),
					getRandomAge()));
		}
		return array;
	}

	private int getRandomAge() {
		return (int) (Math.random() * 10 + 20);
	}

	private String getRandomFirstName() {
		String[] firstNames = { "Lionel", "Angel", "Luiz" };
		int i = (int) (Math.random() * (firstNames.length));
		return firstNames[i];
	}

	private String getRandomLastName() {
		String[] lastNames = { "Messi", "Muller", "Pique", "Suarez" };
		int i = (int) (Math.random() * (lastNames.length));
		return lastNames[i];
	}
}
