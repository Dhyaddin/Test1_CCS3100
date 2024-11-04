import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab4_3 {
	public static void main (String args[]) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner in = new Scanner(System.in);
		
		int pCode,mVcall;
		double total = 0;
		
		System.out.print("Enter package code: ");
		pCode = in.nextInt();
		
		System.out.print("Enter minute voice call: ");
		mVcall = in.nextInt();
		
		in.close();
		
		if (pCode == 1) {
			total = mVcall * 0.2 + 89;
			System.out.println("\nThe total month bill: RM"  + df.format(total));
			return;
		}
		if (pCode == 2) {
			total = ((mVcall - 200) * 0.2) + 129;
			System.out.println("\nThe total month bill: RM"  + df.format(total));
			return;
		}
		if (pCode == 3) {
			total = mVcall * 0.1 + 199;
			System.out.println("\nThe total month bill: RM"  + df.format(total));
			return;
		}
		else
			System.out.println ("\nPlease insert package code between 1-3 only");
	}
}