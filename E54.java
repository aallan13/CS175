package Hw3;
import java.util.Scanner;

public class E54 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//System.out.println("Please enter 3 numbers: ");
		System.out.print("Please enter 1st number: ");
		double num1 = in.nextDouble();
		System.out.print("Please enter 2nd number: ");
		double num2 = in.nextDouble();
		System.out.print("Please enter 3rd number: ");
		double num3 = in.nextDouble();
		
		if (num1 == num2 && num2 == num3) {
			System.out.println("Numbers are all the same.");
		}// if
		else if (num1 != num2 && num2 != num3 && num1 != num3 ) {
			System.out.println("Numbers are all different.");
		}// else if
		else {
			System.out.println("Neither");
		}

	}// main

}// class
