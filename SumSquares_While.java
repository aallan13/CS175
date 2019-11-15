package EckertGpaConversion;

public class SumSquares_While {
	public static void main(String[] args) {
		int sum = 0;

		// The sum of all squares between 1 and 100
		int x = 1;
		while (x <= 100) {
			sum = sum + x * x;
			// OR
			// sum
			// sum +(int) Math . pow (x, 2);
			x++;
		}//while
		// Output the result
		System.out.println ("The sum is " + sum);
	}//main
}//SumSquares.java
