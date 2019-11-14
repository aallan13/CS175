package EckertGpaConversion;

import java.util.Scanner;

public class LetterGradeConversionV2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double numGrade = 0.0;
		double GPA = 0.0;
		double Gradepoints = 0.0;
		double finalGpa = 0.0;

		int Totalcredit = 0;
		int Credit = 0;

		String Courselist = null;
		String Courseinfo = null;

		System.out.println("Enter the course information (Title,Credit hours,Letter grade (grade can be followed by + or -), or enter Q to quit: ");

		while(in.hasNext()) {

			Courseinfo = in.next();

			if(Courseinfo.equals("Q")) {
				break;
			}
			String [] data = Courseinfo.split(",");
			String info = data[0];
			int hours = Integer.parseInt(data[1]);
			String grade = data[2];

			Credit = hours;
			Courselist = info;
			Totalcredit += hours;



			System.out.println("Course: " + Courselist);
			System.out.println("Credits: " + Credit + " (" + Totalcredit + " total)");



			if (grade.equals("A") || grade.equals("A+")) {
				numGrade = 4.0;
				finalGpa += numGrade;
				System.out.println("The numeric value is: " + numGrade + " (" + finalGpa + " total)");
			}
			else if (grade.equals("A-")) {
				numGrade = 3.7;
				finalGpa += numGrade;
				System.out.println("The numeric value is: " + numGrade + " (" + finalGpa + " total)");
			}
			else if (grade.equals("B+")) {
				numGrade = 3.3;
				finalGpa += numGrade;
				System.out.println("The numeric value is: " + numGrade + " (" + finalGpa + " total)");
			}
			else if (grade.equals("B")) {
				numGrade = 3.0;
				finalGpa += numGrade;
				System.out.println("The numeric value is: " + numGrade + " (" + finalGpa + " total)");
			}
			else if (grade.equals("B-")) {
				numGrade = 2.7;
				finalGpa += numGrade;
				System.out.println("The numeric value is: " + numGrade + " (" + finalGpa + " total)");
			}
			else if (grade.equals("C+")) {
				numGrade = 2.3;
				finalGpa += numGrade;
				System.out.println("The numeric value is: " + numGrade + " (" + finalGpa + " total)");
			}
			else if (grade.equals("C")) {
				numGrade = 2.0;
				finalGpa += numGrade;
				System.out.println("The numeric value is: " + numGrade + " (" + finalGpa + " total)");
			}
			else if (grade.equals("C-")) {
				numGrade = 1.7;
				finalGpa += numGrade;
				System.out.println("The numeric value is: " + numGrade + " (" + finalGpa + " total)");
			}
			else if (grade.equals("D+")) {
				numGrade = 1.3;
				finalGpa += numGrade;
				System.out.println("The numeric value is: " + numGrade + " (" + finalGpa + " total)");
			}
			else if (grade.equals("D")) {
				numGrade = 1.0;
				finalGpa += numGrade;
				System.out.println("The numeric value is: " + numGrade + " (" + finalGpa + " total)");
			}
			else if (grade.equals("F")) {
				numGrade = 0;
				finalGpa += numGrade;
				System.out.println("The numeric value is: " + numGrade + " (" + finalGpa + " total)");
			}
			else {
				System.out.println("Invalid Letter Grade");
				
			}
		}
	}
}
	


