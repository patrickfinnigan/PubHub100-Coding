package Strings;

public class assignmnet7 {
	public static void main( String[] args) {
		String x = "http://example.com?access_token=EFEc8328h29jndjd02h12$3829&ds98d";
		int a = x.indexOf("=");
		String y = x.substring(a + 1);
		System.out.println(y);
	}
}
