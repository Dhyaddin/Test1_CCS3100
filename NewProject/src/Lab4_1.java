import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab4_1 {
	public static void main (String args[]) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner in = new Scanner(System.in);
		
		String name,typeBMI = "";
		double h,w,BMI;
		
		System.out.print("Enter your name : ");
		name = in.nextLine();
		
		System.out.print("Enter your Height in Meters(m) : ");
		h = in.nextDouble();
		
		System.out.print("Enter your Weight in Kilogram(KG) : ");
		w = in.nextDouble();
		
		
		BMI = w / (h * h);
		
			if (BMI < 18.5) {
				typeBMI = "Underweight";
			}
			else if (BMI >= 18.5 && BMI < 25) {
				typeBMI = "Normal";
			}
			else if (BMI >= 25 && BMI < 30) {
				typeBMI = "Overweight";
			}
			else if (BMI >= 30 && BMI < 35) {
				typeBMI = "Obese (Class I)";
			}
			else if (BMI >= 35 && BMI < 40) {
				typeBMI = "Obese (Class II)";
			}
			else if (BMI >= 40) {
				typeBMI = "Obese (Class III)";
			}

		System.out.print("\n" +  name + ", your height is " + df.format(h) + " meters and your weight is " + df.format(w) 
		+ " kg."+ "\nYour BMI is " + df.format(BMI) + ", you are " + typeBMI);
		
		in.close();
	}

}