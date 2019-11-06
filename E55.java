package Hw3;
import java.util.Scanner;

public class E55 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        System.out.println("Please enter three numbers:");

		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();

        

        
       

        // Compare the numbers
        if(num1 < num2 && num2 < num3)
            System.out.println("increasing");

        else if(num1 > num2 && num2 > num3)
            System.out.println("decreasing");

        else
            System.out.println("neither");

	}

}
