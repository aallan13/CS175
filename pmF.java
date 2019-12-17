package E3;

import java.util.Scanner;
public class pmF {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System. in);
		System.out.println("Enter any number:");
		// capture the input in an integer
		int num = scan.nextInt();
		scan.close();
		boolean isPrime = true;
		for (int I = 2; I < num; I++)
			if (num % I == 0)
				isPrime = false;
		// If isPrime is true then the number is prime, otherwise not
		if (isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");

	}// main
}// PrimeNumberCheckUsingFOR
