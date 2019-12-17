package E3;

import java.util.Scanner;

public class fac {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter an integer value: ");
		int n = in.nextInt();
		
		int factorial = 1;
		
		for(int x = 1; x <= n; x++) {
			factorial = (factorial*x);
			
		}
		System.out.println("The factorial of " + n + " is " + factorial);
		

	}

}

