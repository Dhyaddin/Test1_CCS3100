import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab3_1 {
	public static void main (String args[]) {
		String item1,item2;
		double p1,p2,t1,t2,subT,total,gTax,sCharge;
		int q1,q2;
		
		Scanner in = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		//first item
		System.out.print("Name of first type food : ");
		item1 = in.nextLine();
		System.out.print("How much quantity for first type of food : ");
		q1 = in.nextInt();
		System.out.print("How much the per unit price for first type of food : RM");
		p1 = in.nextDouble();
		
		t1 = q1 * p1;
		in.nextLine();
		//Second Item
		System.out.print("\nName of second type food : ");
		item2 = in.nextLine();
		System.out.print("How much quantity for second type of food : ");
		q2 = in.nextInt();
		System.out.print("How much the per unit price for second type of food :RM");
		p2 = in.nextDouble();
		
		t2 = q2 * p2;
		
		subT = t1 + t2;
		gTax = 0.06 * subT;
		sCharge = 0.08 * subT;
		
		total = gTax + sCharge + subT;
		
		System.out.println("\n---------------------------------");
		System.out.println("Item 1: "  + item1);
		System.out.println("Quantity: "  + q1);
		System.out.println("Unit Price: RM"  + df.format(p1));
		System.out.println("Amount: RM"  + df.format(t1));
		System.out.println("---------------------------------");
		
		System.out.println("Item 2: "  + item2);
		System.out.println("Quantity: "  + q2);
		System.out.println("Unit Price: RM"  + df.format(p2));
		System.out.println("Amount: RM"  + df.format(t2));
		System.out.println("---------------------------------");
		
		System.out.println("Subtotal: RM" + df.format(subT));
		System.out.println("Goverment Tax (6%): RM" + df.format(gTax));
		System.out.println("Service Charge (8%): RM" + df.format(sCharge));
		
		System.out.println("\nTotal: RM" + df.format(total));
		
		
		in.close();
	}
}
