import java.text.DecimalFormat;

public class LabTest2_6 {
	public static void main (String args[]) {
		double area1,area2;
		DecimalFormat df = new DecimalFormat("0.00");
		
		area1 = (12-4) * 4;	
		area2 = 4*4;
		
		System.out.println("Area of cuboid P = " + df.format(area1));
		System.out.println("Area of cuboid P = " + df.format(area2));
	}
}
