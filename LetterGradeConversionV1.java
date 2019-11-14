package EckertGpaConversion;

import java.util.Scanner;

public class LetterGradeConversionV1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double numGrade = 0;

		System.out.print("Enter a letter grade (and a + or - if applicable) or enter Q to quit the program: ");

		while (in.hasNext()) {
			String grade = in.next();


			if (grade.equals("Q")) {
				break;
			}// if
			if (grade.equals("A") || grade.equals("A+")) {
				numGrade = 4.0;
				System.out.println("The numeric value is " + numGrade);
			}//if
			else if (grade.equals("A-")){
				numGrade = 3.7;
				System.out.println("The numeric value is " + numGrade);
			}// else if 
			else if (grade.equals("B+")) {
				numGrade = 3.3;
				System.out.println("The numeric value is " + numGrade);

			}// else if
			else if (grade.equals("B")) {
				numGrade = 3.0;
				System.out.println("The numeric value is " + numGrade);

			}// else if
			else if (grade.equals("B-")) {
				numGrade = 2.7;
				System.out.println("The numeric value is " + numGrade);

			}// else if 
			else if (grade.equals("C+")) {
				numGrade = 2.3;
				System.out.println("The numeric value is " + numGrade);

			}// else if 
			else if (grade.equals("C")) {
				numGrade = 2.0;
				System.out.println("The numeric value is " + numGrade);

			}// else if 
			else if (grade.equals("C-")) {
				numGrade = 1.7;
				System.out.println("The numeric value is " + numGrade);

			}// else if 
			else if (grade.equals("D+")) {
				numGrade = 1.3;
				System.out.println("The numeric value is " + numGrade);

			}// else if 
			else if (grade.equals("D")) {
				numGrade = 1.0;
				System.out.println("The numeric value is " + numGrade);

			}// else if
			else if (grade.equals("F")) {
				numGrade = 0;
				System.out.println("The numeric value is " + numGrade);

			}
			else {
				System.out.println("Invalid Letter Grade");
			}// else
			System.out.println();
			System.out.print("Enter a letter grade (and a + or - if applicable) or enter Q to quit the program: ");


		}// while




	}

}
