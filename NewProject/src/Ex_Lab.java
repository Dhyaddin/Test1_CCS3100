import java.util.Scanner;
public class Ex_Lab {
	public static void main(String args[]) {
		int x = 3;
		divisibleBy3(x);
		double Foot = 3.00;
		System.out.println("The meter of foot to meter is " + footToMeter(Foot));
		double Depth = readDepth();
		double Celc = calcC(Depth);
		double Fahn = calcF(Celc);
		printCF(Celc,Fahn);
		System.out.println("Sum for 1 to 10 is " + repSum(1,10));
		System.out.println("Sum for 20 to 30 is " + repSum(20,30));
		System.out.println("Sum for 35 to 45 is " + repSum(35,45));
		
		int i = 1;
		 while (i <= 3) {
		 method1(i, 2);
		 i++;
		 }
	}
	 public static void method1(int i, int num) {
		 for (int j = 1; j <= i; j++) {
		 System.out.println(num);
		 num += 2;
		 }
	}
	public static double readDepth() {
		double depth;
		Scanner in = new Scanner (System.in);
		System.out.printf("Enter the depth: ");
		depth = in.nextDouble();
		in.close();
		return depth;
	}
	public static double calcC(double D) {
		double celsius = 10 * D + 20;
		return celsius;
	}
	public static double calcF(double C) {
		double Fahn = 10 * C + 20;
		return Fahn;
	}
	public static void printCF(double Cx, double Fx) {
		System.out.println("Therefore Celcius is " + Cx + " and Fahnrenheit is " + Fx);
	}
	public static int repSum(int x1, int x2) {
		int sum = 0;
		for(int i = x1; i <= x2; i++) {
			sum += i;
		}
		return sum;
	}
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}
	public static boolean divisibleBy3(int x) {
		return x % 3 == 0;
	}
}
