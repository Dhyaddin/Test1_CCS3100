import java.util.Scanner;
import java.text.DecimalFormat;

public class TestLab2_3 {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
//		double Exc;
//		final double RateUK = 0.18;
//		
//		System.out.print("How much Ringgit Malaysia(RM) you need convert to UK Pound(£) = RM");
//		double Rm = in.nextDouble();
//		
//		Exc = Rm * RateUK;
//		System.out.print("\nThis is your UK Pound you will get from RM" + df.format(Rm) + " to £" + df.format(Exc));
//		
////		for(int x=0; x!= 10; x++) {
////			if((x%2) != 0) {
////				System.out.print(x + " ");
////			}	
////		}
//		
//		for (int i = 1; i <= 9; i++) {
//			    System.out.print("\n" + i);
//			    for (int j = 1; j <= 9; j++) {
//			       System.out.print ("\t" + (i*j));
//			 	}
//			 }
		
		boolean T = true;
		int total = 0, mark;
		double avg;
		do {
			
			for(int x=1; x <= 4; x++) {
				System.out.println("Enter mark student " + x +"(0-100%):");	
				mark = in.nextInt();
				total += mark;
			}
			
			avg = (total/400.0) * 100;
			
			if(avg >= 40)
				System.out.println("\nTotal average mark: " + avg + ". The student: PASS ");
			else
				System.out.println("\nTotal average mark: " + avg + ". The student: FAIL ");
			
			System.out.println("\nIs it	you want to proceed again ? (true/false):");
			T = in.nextBoolean();
			
		}while(T = false);
		
//		double sum = 0, avg = 0;
//		int i=0, num;
//		
////		for(i=0; <10; i+=2) {
////			     num = in.nextInt();
////			    sum = sum + num;
////			 } 
//		
//		while(i < 10) {
//			num = in.nextInt();
//			sum += num;
//			
//			i +=2;
//		}
//		
//		avg = sum/i;
//		System.out.println("Sum : " + isum + ", Average: " + avg);
		
		in.close();
	}
}
