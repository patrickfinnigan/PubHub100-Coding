package One;

public class Application {

	public static Person getDetails(){
		String name = "Patrick";
		int age = 25;
		return new Person(name, age);
	}

	public static void main (String[] args) {
		Person Person = getDetails();
		System.out.println(Person.name);
		System.out.println(Person.age);
	}
	
}
