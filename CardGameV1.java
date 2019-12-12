import java.util.Random;

public class CardGameV1 {
	
	public static void main(String[] args) {
		
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		
		String mySuit = "";
		String yourSuit = "";
		
		Random generator = new Random();
		
		int card = 0;
		//step 2
		
		for (int i = 0; i<5; i++) {
			card = 1 + generator.nextInt(52);
			myHand[i] = card;
			
			card = 1 + generator.nextInt(52);
			yourHand[i] = card;
			
		}// for
		// step3 
		for(int j = 0; j<5; j++) {
			
		}

	}// main

}// class
