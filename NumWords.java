// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	     int num = Integer.parseInt(args[0]);
		int hundreds = num / 100;
		num = num - (hundreds * 100);
		int tens = num / 10;
		num = num - (tens * 10);
		int ones = num ;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
