package EckertGpaConversion;

public class EvenNumbers_WHILE {
	public static void main(String[] args) {
		int sum = 0;

		//The sum of all even numbers between 2 and 100
		int x = 2;

		while (x <= 100) {
			if (x % 2 == 0)
				sum = sum + x;
			x++;
		} //while
		// Output the result
		System.out.println ( "The sum is " + sum);
	}	//main
}// SumEvenNumbers