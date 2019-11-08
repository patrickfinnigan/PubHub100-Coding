package Strings;

import java.util.Arrays;

public class assignment13 {
	public static void main( String[] args) {
		
		String x = "cinema";
		String y = "iceman";
		
		String[] a = x.split("");
		Arrays.sort(a);
		String aString = Arrays.toString(a);
		
		String[] b = y.split("");
		Arrays.sort(b);
		String bString = Arrays.toString(b);
		
		if (aString.equals(bString)) {
			System.out.println("These strings are anagrams");
		} else {
			System.out.println("These strings are not anagrams");
		}
	}
}
