package Hw3;

import java.util.Scanner;

public class E58 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter 4 integers: ");
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        int fourth = in.nextInt();

        if ((first == second && third == fourth) ||
            (first == third && second == fourth) ||
            (first == fourth && second == third)) {

            System.out.println("Two pairs");
        }
        else {
            System.out.println("Not two pairs");
        }

       
    }

}
