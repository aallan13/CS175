package Hw3;

import java.util.Scanner;

public class E56 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Strict or lenient? ");
        String input = in.next().toLowerCase();
        
        System.out.println("Please enter 3 integers: ");
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();

        if (input.equals("strict")) {
            if (first < second && second < third) {
                System.out.println("increasing");
            }
            else if (first > second && second > third) {
                System.out.println("decreasing");
            }
            else {
                System.out.println("neither");
            }
        }
        else if (input.equals("lenient")) {
            if ((first <= second && second < third) || (first < second && second <= third)) {
                System.out.println("increasing");
            }
            else if ((first >= second && second > third) || (first > second && second >= third)) {
                System.out.println("decreasing");
            }
            else if ((first == second) && (second == third)) {
                System.out.println("increasing and decreasing");
            }
            else {
                System.out.println("neither");
            }
        }

	}

}
