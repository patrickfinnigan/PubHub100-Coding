package Three;


public class Application {
	public static TalkativePerson getDetails(){
		String name = "Patrick";
		int age = 25;
		return new TalkativePerson(name, age);
	}

	public static void main (String[] args) {
		TalkativePerson TalkativePerson = getDetails();
		TalkativePerson.talk();
		System.out.println(TalkativePerson.name);
		System.out.println(TalkativePerson.age);
	}
}
