package E3;

import java.util.Scanner;
class PrimeNumberCheckUsingWHILE {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System. in);
		System.out.println("Enter any number:");
		// capture the input in an integer

		int num = sc.nextInt();
		boolean isPrime = true;
		int i = 2;
		while (i < num && isPrime == true) {
			if (num % i == 0)
				isPrime =false;
			i++;
		} // while
		// If isPrime is true then the number is prime, otherwise not
		if (isPrime)
			System.out.println(num + " is a Prime Number");
		
		else
			System.out.println(num + " is not a Prime Number");			
	
		
	}// main
}// PrimeNumberCheckUsingWHILE
