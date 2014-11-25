package yy.practice.datastructure.chapter3;

public class Person implements Comparable<Person> {

	private String lastName;
	private String firstName;
	private int age;

	public Person(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void displayPerson() {
		System.out.print("Last name:" + lastName);
		System.out.print(",First name:" + firstName);
		System.out.println(",Age:" + age);
	}

	@Override
	public int compareTo(Person person) {

		if (this.lastName.equals(person.getLastName())) {

			if (this.firstName.equals(person.getFirstName())) {
				return ((Integer) this.age).compareTo(person.getAge());
			} else {
				return this.firstName.compareTo(person.getFirstName());
			}
		} else {
			return this.lastName.compareTo(person.getLastName());
		}
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName
				+ ", age=" + age + "]";
	}

}
