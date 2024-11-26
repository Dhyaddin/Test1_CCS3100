import java.util.Scanner;

public class Lab5_2 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int x = 1,total = 0, num = -99999999, count = 0,avg;
		
		
		while(x != 0) {
			System.out.print("Insert your number: ");
			num = in.nextInt();
			
			if (num > num) {
				num = num;
			}
			
			total += num;
			count++;
			System.out.print("You want exit ? if YES press '0' if NO then press any number: ");
			x = in.nextInt();
		}
		
		avg = total/count;
		System.out.println("\nTotal:" + total + "\nAverage: " + avg + "\nLargest Number: " + num);
		
		in.close();
	}
}
