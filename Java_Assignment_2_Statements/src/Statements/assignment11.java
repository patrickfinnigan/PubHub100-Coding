package Statements;

public class assignment11 {
	public static void main (String[] args) {
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i=0; i<intArray.length; i++){
//	        System.out.println(intArray[i]);
			int x = intArray[i];
	        for (int j=0; j<intArray.length; j++) {
	        	int y = intArray[j];
	        	int z = x * y;
	        	System.out.println(x + " multiplied by " + y + " = " + z);
	        }
		}
	}
}
