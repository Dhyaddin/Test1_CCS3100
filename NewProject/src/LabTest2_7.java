import java.util.Scanner;
import java.text.DecimalFormat;

public class LabTest2_7 {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double hx,wy,p,a,d;
		
		System.out.print("Height rectangle : ");
		hx = in.nextDouble();
		
		System.out.print("Weight rectangle : ");
		wy = in.nextDouble();
		
		 p = 2 * (hx + wy);
		 a = hx * wy;
		 d = Math.sqrt((wy * wy) + (hx * hx));
		
		
		System.out.println("\nPerimeter of rectangle = " + df.format(p));
		System.out.println("Area of rectangle = " + df.format(a));
		System.out.println("Diagonal of rectangle = " + df.format(d));
		
		in.close();
	}

}
