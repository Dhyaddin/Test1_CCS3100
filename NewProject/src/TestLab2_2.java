import java.util.Scanner;

public class TestLab2_2 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int num1,num2,num3,sum, avg;
		
		System.out.print("Please enter value number 1 = ");
		num1 = in.nextInt();
		
		System.out.print("Please enter value number 2 = ");
		num2 = in.nextInt();
		
		System.out.print("Please enter value number 3 = ");
		num3 = in.nextInt();
		
		sum = num1+num2+num3;
		avg = sum/3;
		
		double sum1 = sum;
		double avg1 = sum/3.0;
		
		System.out.print("\nSum of all value in integer = " + sum);
		System.out.print("\nAverage of all value in integer = " + avg);
		
		System.out.print("\nSum of all value in double = " + sum1);
		System.out.print("\nAverage of all value in double = " + avg1);
		
		in.close();
	}
}
