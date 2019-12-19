package Objects;

public class Application {

	public static void main(String[] args) {
        
		MyObject objectA = new MyObject();
		MyObject objectB = new MyObject();
		
		if (objectA instanceof MyObject) {
			System.out.println("objectA is an instance of MyObject");
		} else {
			System.out.println("objectA is not an instance of MyObject");
		}
		
		if (objectA.equals(objectB)) {
			System.out.println("objectA and objectB are the same");
		} else {
			System.out.println("objectA and objectB are different");
		}

		
    }
}
