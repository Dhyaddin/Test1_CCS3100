import java.util.Scanner;
import java.text.DecimalFormat;

public class TestLab2_3 {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double Exc;
		final double RateUK = 0.18;
		
		System.out.print("How much Ringgit Malaysia(RM) you need convert to UK Pound(£) = RM");
		double Rm = in.nextDouble();
		
		Exc = Rm * RateUK;
		System.out.print("\nThis is your UK Pound you will get from RM" + df.format(Rm) + " to £" + df.format(Exc));
		
		in.close();
	}
}
