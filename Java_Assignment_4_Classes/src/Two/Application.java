package Two;

import One.Person;

public class Application {
	public static PrivatePerson getDetails(){
		String name = "Patrick";
		int age = 25;
		return new PrivatePerson(name, age);
	}

	public static void main (String[] args) {
		PrivatePerson Person = getDetails();
		System.out.println(Person.name);
		System.out.println(Person.age);
	}
}
