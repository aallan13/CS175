package Hw3;


import java.util.Scanner;

public class E51 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		double number = in.nextDouble();

		if (number > 0) {
			System.out.println(number + " is positive");
		}//if
		else if (number == 0 ) {
			System.out.println("The number is zero");
		}// else if 
		else {
			System.out.println(number + " is negative");
		}// else



	}//main

}//class