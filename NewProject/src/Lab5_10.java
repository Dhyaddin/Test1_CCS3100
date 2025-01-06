import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab5_10 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int month;
		double saving,total = 0;
		
		System.out.print("You want to see after which month (1-12) ?: ");
		month = in.nextInt();
		
		System.out.print("Enter the monthly saving amount: ");
		saving = in.nextDouble();
		
		in.close();
		
		for(int x=1; x<=month; x++) {
			total = (total + saving) * (1+0.00417);
		}
		
		System.out.print("\nAfter the " + month + " month, The account value is RM" + df.format(total));
	}
}
