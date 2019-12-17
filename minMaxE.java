package E3;

import java.util.Scanner;

public class minMaxE {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a min number: ");
		int min = in.nextInt();
		
		System.out.println("Please enter a max number: ");
		int max = in.nextInt();
		
		int sum = 0;
		
		int currentnum = min;
		
		while(currentnum <= max) {
		
		if(currentnum % 2 == 0)
			sum = sum + currentnum;
		
		currentnum ++;
		}
		
		System.out.println("The sum of all even numbers between " + min + " and " + max + " is " + sum);
		

	}

}


