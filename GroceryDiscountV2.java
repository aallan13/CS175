import java.util.Scanner;

public class GroceryDiscountV2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean decision = true;

		System.out.println("Please enter the cost of your groceries or enter 0 to end: ");

		while (in.hasNextDouble()) {

			//System.out.println("Please enter the cost of your groceries or enter 0 to end: ");
			double costOfGroceries = in.nextDouble();
			
			if(costOfGroceries >= 10 && costOfGroceries <= 1000) {

			//while(decision == true) {

			if (costOfGroceries == 0) {
					decision = false;

				}
				else if (costOfGroceries > 210) {
					System.out.println("You win a discount coupon of $" + (.140* costOfGroceries) + " (14% of your purchase)");

				}else if (costOfGroceries > 150 && costOfGroceries <=210) {
					System.out.println("You win a discount coupon of $" + (.120* costOfGroceries) + " (12% of your purchase)");

				}else if (costOfGroceries > 60 && costOfGroceries <= 150) {
					System.out.println("You win a discount coupon of $" + (.100* costOfGroceries) + " (10% of your purchase)");

				}else if (costOfGroceries >= 10 && costOfGroceries <= 60) {
					System.out.println("You win a discount coupon of $" + (.080* costOfGroceries) + " (8% of your purchase)");

				}else  {
					System.out.println("You are not eligible for a coupon this time");
				}
			System.out.println();
			System.out.println("Please enter the cost of your groceries or enter 0 to end: ");
			



			
		}else {
			System.out.println("Please enter a number between 10 and 1000!");
		}
		}









	} // main

}// class
