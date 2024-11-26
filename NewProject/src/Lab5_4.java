import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab5_4 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int trip, x;
		double total;
		
		for(x=1; x!=20; x++) {
			System.out.print("Please enter the mileage for staff " + x + ": ");
			trip = in.nextInt();
			
			if (trip > 500) {
				total = (500 * 0.75) + ((trip - 500) * 0.50);
			} else {
				total = trip * 0.75;
			}
			
			System.out.println("\n----------- STAFF " + x + "--------------------");
			System.out.println("The mileage staff " + x + ": " + trip + "km");
			System.out.println("total mileage claim staff " + x + ": RM" + df.format(total));
			System.out.println("-------------------------------------------------\n");
		}
	}
}
