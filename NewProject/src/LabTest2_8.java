import java.util.Scanner;

public class LabTest2_8 {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		
		int a,a1,b,b1,c,c1,d,d1,e1,rm;
		
		System.out.print("Enter Malaysia Ringgit amount : RM");
		rm = in.nextInt();
		
		a1 = rm/50;
		a = rm - (a1 * 50);
		
		b1 = a/20;
		b = a - (b1 * 20);
		
		c1 = b/10;
		c = b - (c1 * 10);
		
		d1 = c/5;
		d = c - (d1 * 5);
		
		e1 = d/1;
		
		System.out.println("Number of RM50 bills :" + a1);
		System.out.println("Number of RM20 bills :" + b1);
		System.out.println("Number of RM10 bills :" + c1);
		System.out.println("Number of RM5 bills :" + d1);
		System.out.println("Number of RM1 bills :" + e1);
		
		in.close();
	}

}
