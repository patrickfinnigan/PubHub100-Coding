package Three;

public class TalkativePerson {
	public String name;
	public int age;

	public void talk() {
		System.out.println("Hello, my name is ");
	}

	public TalkativePerson(String name, int age) {
	    this.name = name;
	    this.age = age;
	}
}
