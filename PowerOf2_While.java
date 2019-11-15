package EckertGpaConversion;

public class PowerOf2_While {
	public static void main(String[] args) {
		//The powers of 2 from 2n0 to 2^20
		int x = 0;
		while (x <= 20) {
			System. out.println ( "2^" + x + " = 2 to the " + x + " equals " + Math.pow(2.0, x));
			x++;
		} // while
	}// main
}// PowerOf2
