import java.util.Arrays;

public class BasicArraySort {
	public static void main(String[] args) {
		int lowest;
		String numberPrint;
		
		double[] numb = {88,47,90,50,77,83,92,96,62,79};
		double [] numbSort = new double [10];
		
		for(int x = 0; x < numb.length; x++) {
			for(int y = x; y < numb.length; y++) {
				if(numb[x]> numb[y]) {
					
				lowest = (int) numb[x];
				numb[x] = numb[y];
				numb[y] = lowest;
			}
			
		}
	}
	numberPrint = Arrays.toString(numb);
	System.out.println(numberPrint);
	
}

}