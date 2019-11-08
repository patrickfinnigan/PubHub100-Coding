package Strings;

public class assignment3 {
	public static void main( String[] args) {
		String x = "abc";
		String y = new String("abc");
		
		if (x == y) {
			System.out.println("These strings are equal");
		} else {
			System.out.println("These strings are not equal");
		}
		
		if (x.equals(y)) {
			System.out.println("These strings are equal");
		} else {
			System.out.println("These strings are not equal");
		}
		
	}
}
