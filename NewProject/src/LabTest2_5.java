import java.util.Scanner;
import java.text.DecimalFormat;

public class LabTest2_5 {
	public static void main (String args[]) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner in = new Scanner(System.in);
		
		String name;
		double h,w,BMI;
		
		System.out.print("Please enter your name : ");
		name = in.next();
		
		System.out.print("Enter your Weight in Kilogram(KG) : ");
		w = in.nextDouble();
		
		System.out.print("Enter your Height in Meters(m) : ");
		h = in.nextDouble();
				
		
		BMI = w / (h * h);
		
		System.out.print("\nHello your name is " + name + " Meanwhile your BMI is " + df.format(BMI));
		
		in.close();
	}

}
