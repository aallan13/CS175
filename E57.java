package Hw3;

import java.util.Scanner;

public class E57 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 3 integers: ");
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        
        if ((first > second && second > third) || (first < second && second < third) ||
            (first >= second && second > third) || (first <= second && second < third) ||
            (first > second && second >= third) || (first < second && second <= third)) {
            System.out.println("In order");
        }
        else {
            System.out.println("Not in order");
        }
        
        
    }

}
