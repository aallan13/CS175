package E3;

import java.util.Scanner;

public class txM {

		
		public static void main(String[] args) {
			final double rate1 = 0.10;
			final double rate2 = 0.25;
			final double rate1_singlelimit = 32000;
			final double rate1_marriedlimit = 64000;
			final double Additionaltax_single = 4400;
			final double Additionaltax_married = 8800;
			
			double income;
			String status;
			double tax;
			Scanner in = new Scanner(System.in);
			
			System.out.println("Please enter your marital status ('S' or 'M'): ");
			status = in.next();
			
			System.out.println("Please enter your income ($): ");
			income = in.nextDouble();
			
			if (status.equals("S"))
				if (income <= rate1_singlelimit)
				    tax = rate1 * income;
				else
					tax = Additionaltax_single + rate2 * (income - rate1_singlelimit);
					
			
			
			else  
				if (income <= rate1_marriedlimit)
						tax = rate1 * income;
					else
						tax = Additionaltax_married + rate2 * (income - rate1_marriedlimit);
					
			System.out.println("Tax to be paid: $" + tax);
				
			}
				
			
		
			
		
	}

