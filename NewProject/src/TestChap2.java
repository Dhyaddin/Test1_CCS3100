import java.util.Scanner;
public class TestChap2 {
	public static void main (String args[]) {
		int num1 = 1, num2= 2;
		double avg = (num1 + num2) / 2.0;
		System.out.print(avg);
		
		Scanner in = new Scanner(System.in);
		System.out.print("\n\nEnter an integer : ");
		int x = in.nextInt();
		
		System.out.print("This your entering value : " + x);
		in.close();
	}
}
