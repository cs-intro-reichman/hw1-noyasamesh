// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (lim * Math.random());
		int b = (int) (lim * Math.random());
		int c = (int) (lim * Math.random());
		System.out.println( a + " " + b + " " + c );
		int max = Math.max(a,b);
		max = Math.max(max,c);
		int min = Math.min(a,b);
		min = Math.min(min,c);
		int middle = (a+b+c) - (max+min);
		System.out.println( max + " " + middle + " " + min );

	}
}
