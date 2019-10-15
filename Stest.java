
public class Stest {

	public static void main(String[] args) {
		String stickerHybrid = "Make:Toyota,Model:Prius,Cost:31000,MPG:30";
		String stickerRegular= "Make:Toyota,Model:Corolla,Cost:28000,MPG:20";
		String [] stuff = stickerHybrid.split(",");
		System.out.println(stuff[0]);
		System.out.println(stuff[1]);
		System.out.println(stuff[2]);
		int costH = 31000; 
		double ppg = 2.50;
		/double TC = (double)Integer.parseInt(cost[1])+(Integer.parseInt(miles[1])/Integer.parseInt(mpg[1])*ppg);
		
		System.out.println(TC);

	}

}
