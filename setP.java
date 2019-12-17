package E3;

import java.util.Scanner;

public class setP {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float input = 0, sum = 0, avg = 0, largest = -999999, smallest = 999999;
		int count = 0;
		System.out.println("Enter a set of floating-point values (type any letter to quit): ");
		while (sc.hasNextFloat()) {
			
			input = sc.nextFloat();
			//Calculates sum and count to use for average calculation
			sum += input;
			count++;
			//Calculates smallest and largest values
			largest = Math.max(largest, input);
			smallest = Math.min(smallest, input);
			
			
		}
		
		
		//Calculates average value and range between smallest and largest
		avg = sum / count;
		
		
		//Prints all calculations to user
		System.out.println("Average value: " + avg);
		System.out.println("Smallest value: " + smallest);
		System.out.println("Largest value: " + largest);
		
	}
}
