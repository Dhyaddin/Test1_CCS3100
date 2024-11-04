import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab4_5 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		final double p1 = 2.98, p2 = 4.50, p3 = 9.98, p4 = 4.49, p5 = 6.87;
		double total;
		int qty,p;
		
		 System.out.print("Enter the product number you want between 1-5 : ");
	     p = in.nextInt();
	     
	     System.out.print("Enter the quantity of product you bought : ");
	     qty = in.nextInt();
	     
	     in.close();
	     
	     switch(p) {
	     
	     case 1:
	    	 total = p1 * qty;
	    	 break;
	    	 
	     case 2:
	    	 total = p2 * qty;
	    	 break;
	    	 
	     case 3:
	    	 total = p3 * qty;
	    	 break;
	    	 
	     case 4:
	    	 total = p4 * qty;
	    	 break;
	    	 
	     case 5:
	    	 total = p5 * qty;
	    	 break;
	    	 
	     default:
	    	System.out.println("Invalid product number");
	    	return;
	     }
	     
	     System.out.println("\nThe total retail value of the product sold = RM" + df.format(total));
		
	}
}
