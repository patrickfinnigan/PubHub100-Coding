package one;

public class Automobile implements Movable{
	
	public void moveAround() {
		System.out.print("I'm moving!");
	}
	
	public static void main (String[] args) {
		Automobile Automobile = new Automobile();
		Automobile.moveAround();
	}
}
