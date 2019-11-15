package EckertGpaConversion;

import java.util. Scanner;
public class SumOfOddNumbers_While {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Get the inputs
		System.out.print ( "Enter a: ");
		int a = in.nextInt();

		System.out.print ( "Enter b: ");
		int b = in.nextInt();

		int sum = 0;
		// The sum of odd numbers between a and b
		int x = a;

		while (x <= b) {
			// Only add number if it is odd
			if (x % 2 != 0)
				sum = sum +  x;
			x++;
		} //while
		// Output the result
		System.out.println ( "The sum is " + sum + ".");
	}//main
}// SumofoddNumbers

