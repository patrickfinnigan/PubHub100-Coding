package Statements;

public class assignment8 {
	public static void main (String[] args) {
		int i = 0;
		do{
			if (i % 2 != 0) {
				System.out.println(i);
				++i;
			} else {
				++i;
			}
		}while(i <= 9);
	}
}

