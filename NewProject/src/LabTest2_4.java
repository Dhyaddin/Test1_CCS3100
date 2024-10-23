import java.text.DecimalFormat;

public class LabTest2_4 {
	public static void main(String args[]) {
		final double oriP = 14.00, disc = 0.50;
		double saleP = disc * oriP;
		int cDisc= (int) (disc * 100);
		int disc1 = cDisc;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("The original price of an item : RM" + df.format(oriP));
		System.out.println("\nThe discount price of an item : " + disc1 + "%");
		System.out.println("\nThe sale price of an item : RM" + df.format(saleP));
	}
}
