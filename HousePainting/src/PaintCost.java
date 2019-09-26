import java.util.Scanner;
public class PaintCost {

	public static void main(String[] args) {
		/*
		 * This program will calculate the cost to paint a house 
		 */
		
		//double houseLengthFeet;
		//double houseLengthInch;
		//double houseWidthFeet;
		//double houseWidthInch;
		//double houseHeightFeet;
		//double houseHeightInch;
		//double windowLengthfeet;
		//double windowLengthInch;
		//double windowWidthFeet;
		//double windowWidthInch;
		//int windowNumber;
		//double doorLengthFeet;
		//double doorLengthInch;
		//double doorWidthFeet;
		//double doorWidthInch;
		//int doorNumber;
		//double sqFtCost;
		//double sqFtNormal;
		//double sqFtWindows;
		//double sqFtDoors;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter length of house in feet: ");
		double houseLengthFeet = in.nextDouble();
		
		System.out.print("Enter remaining length of house in inches: ");
		double houseLengthInch = in.nextDouble();
		houseLengthFeet = houseLengthFeet + houseLengthInch/12;
		
		System.out.print("Enter width of house in feet: ");
		double houseWidthFeet = in.nextDouble();
		
		System.out.print("Enter remaining width of house in inches: ");
		double houseWidthInch = in.nextDouble();
		houseWidthFeet = houseWidthFeet + houseWidthInch/12;
		
		System.out.print("Enter height of the house in feet: ");
		double houseHeightFeet = in.nextDouble();
		
		System.out.print("Enter remaining height of the house in inches: ");
		double houseHeightInch = in.nextDouble();
		houseHeightFeet = houseHeightFeet + houseHeightInch/12;
		
		System.out.print("Enter number of windows: ");
		int windowNumber = in.nextInt();
		
		System.out.print("Enter length of window in feet: ");
		double windowLengthFeet = in.nextDouble();
		
		System.out.print("Enter remaining length of window in inches: ");
		double windowLengthInch = in.nextDouble();
		windowLengthFeet= windowLengthFeet + windowLengthInch/12;
		
		System.out.print("Enter width of window in feet: ");
		double windowWidthFeet = in.nextDouble();
		
		System.out.print("Enter reamining width of window in inches: ");
		double windowWidthInch = in.nextDouble();
		windowWidthFeet = windowWidthFeet + windowWidthInch/12;
		
		System.out.print("Enter number of doors: ");
		int doorNumber = in.nextInt();
		
		System.out.print("Enter length of door in feet: ");
		double doorLengthFeet = in.nextDouble();
		
		System.out.print("Enter remaining length of door in inches: ");
		double doorLengthInch = in.nextDouble();
		doorLengthFeet = doorLengthFeet + doorLengthInch/12;
		
		System.out.print("Enter width of door in feet: ");
		double doorWidthFeet = in.nextDouble();
		
		System.out.print("Enter remaining width of door in inches: ");
		double doorWidthInch = in.nextDouble();
		doorWidthFeet = doorWidthFeet + doorWidthInch/12;
		
		System.out.print("Enter the cost per square foot: ");
		double sqFtCost = in.nextDouble();
		
		//System.out.print("Enter the square feet of the Normal side: ");
		//double sqFtNormal = in.nextDouble();
		
		//System.out.print("Enter the square feet of the windows: ");
		//double sqFtWindows = in.nextDouble();
		
		//System.out.print("Enter the square feet of the doors: ");
		//double sqFtDoors = in.nextDouble();
		
		double sqFtToPaint =(2 *(houseLengthFeet * houseWidthFeet) + 2 *(houseLengthFeet * houseWidthFeet + 0.5 * (houseLengthFeet * (houseHeightFeet-houseWidthFeet)))) - ((windowNumber * windowLengthFeet * windowWidthFeet) + (doorNumber * doorLengthFeet * doorWidthFeet));
		
		//System.out.println(costOfPainting);
		double costToPaint = (sqFtToPaint * sqFtCost);
		System.out.println(costToPaint);
		
		
		
		
		
		
		
		

		
		
		
		
		/*
		 * 1. Enter Width:
2. Enter Length:
3. Enter Height of the house:
4. Enter # of windows:
5. Enter # of doors:
6. Enter Width of door:
7. Enter Length of door:
8. Enter Width of window:
9. Enter Length of window:
10. Enter cost charges per Square foot:
11. Normal side = ((Multiply length * width)* sides needed to be painted) – (width*length of doors and windows) * cost charges per Square foot
12. Peak side = Multiply Length * width + ½(length*(height – width))* cost charges per Square foot

		 */
		
	

	}

}

