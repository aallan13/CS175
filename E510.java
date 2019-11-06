package Hw3;

import java.util.Scanner;

public class E510 {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String employeeName = in.next();

        System.out.print("Enter hourly wage: ");
        double hourlyWage = in.nextDouble();

        System.out.print("Number of hours worked last week: ");
        double hours = in.nextDouble();

        // Calculate salary
        double salary = 0;
        if (hours <= 40)
        {
            salary = hours * hourlyWage;
        }
        else if (hours > 40)
        {
            salary = (40 * hourlyWage) + ((hours - 40) * hourlyWage * 1.5);
        }
       
        System.out.println(employeeName + "'s paycheck amounts to " + salary);
        
        

    }

}
