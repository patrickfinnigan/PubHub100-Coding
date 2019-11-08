package Strings;

public class assignment6 {
	public static void main( String[] args) {
		String x = "Hello My Name is Java";
		int a = x.indexOf(" ");
		System.out.println(a);
		int b = x.indexOf(" ", a + 1);
		System.out.println(b);
	}
}
