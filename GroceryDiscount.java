package EckertGpaConversion;

import java.util.Scanner;
public class GroceryDiscount {

	public static void main(String [] args) {

		final double RATE1 = 0.08;
		final double RATE2 = 0.10;
		final double RATE3 = 0.12;
		final double RATE4 = 0.14;
		final double RATE1_LIMIT = 10;
		final double RATE2_LIMIT = 60;
		final double RATE3_LIMIT = 150;
		final double RATE4_LIMIT = 210;

		Scanner in = new Scanner (System.in);
		System.out.print ("Please enter the cost of your groceries: ");
		double bill = in.nextDouble();
		double coupon = 0;

		if(bill < RATE1_LIMIT)
			System.out.println("You are not eligible for a coupon this time. ");

		else if(bill >= RATE1_LIMIT && bill <= RATE2_LIMIT) {
			coupon = bill * RATE1;
			System.out.printf("You win a discount coupon of $" + coupon + " (8 percent of your purchase)" );
		}//else if

		else if(bill > RATE2_LIMIT && bill <= RATE3_LIMIT) {
			coupon = bill * RATE2;
			System.out.println ("You win a discount coupon of $" + coupon + " (10 percent of your purchase)");
		}//else if

		else if(bill > RATE3_LIMIT && bill <= RATE4_LIMIT) {
			coupon = bill * RATE3;
			System.out.println("You win a discount coupon of $" +  coupon + " (12 percent of your purchase)");
		}//else if
		else {
			coupon = bill * RATE4;
			System.out.println("You win a discount coupon of $" + coupon + " (14 percent of your purchase)");
		}//else
	}//main
}//GroceryDiscount
