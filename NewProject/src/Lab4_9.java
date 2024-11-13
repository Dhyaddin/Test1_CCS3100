import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab4_9 {
	public static void main (String args[]) {
		int unit;
		double total = 0, disc = 0, price;
		
		Scanner in = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Number of total units bought : ");
		unit = in.nextInt();
		
		System.out.print("Price of each unit : ");
		price = in.nextDouble();
		
		if (unit > 0 && unit <=9) {
			if (price > 0 && price <=10) {
				disc = unit * price * 1;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 0% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
			else if (price > 10 && price <=100) {
				disc = unit * price * 2/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 2% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
			else if (price > 100) {
				disc = unit * price * 5/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 5% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
		}
			
		else if (unit > 9 && unit <= 99) {
			if (price > 0 && price <=10) {
				disc = unit * price * 5/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(unit*price) + ". Discount given 5% : RM" 
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
			else if (price > 10 && price <=100) {
				disc = unit * price * 7/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 7% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
			else if (price > 100) {
				disc = unit * price * 9/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 9% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
		}
			
		else if (unit > 99 && unit <= 499) {
			if (price > 0 && price <=10) {
				disc = unit * price * 9/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 9% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
			else if (price > 10 && price <=100) {
				disc = unit * price * 15/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 15% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
			else if (price > 100) {
				disc = unit * price * 21/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 21 : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
		}
		
		else if (unit > 499 && unit <= 999) {
			if (price > 0 && price <=10) {
				disc = unit * price * 14/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 14% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
			else if (price > 10 && price <=100) {
				disc = unit * price * 23/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 23% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
			else if (price > 100) {
				disc = unit * price * 32/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 32% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
		}
		
		else if (unit > 999) {
			if (price > 0 && price <=10) {
				disc = unit * price * 21/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 21% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
			else if (price > 10 && price <=100) {
				disc = unit * price * 32/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 32% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
			else if (price > 100) {
				disc = unit * price * 43/100;
				total = unit * price - disc;
				System.out.print("\nPrice of total unit : RM" + df.format(total) + ". Discount given 43% : RM"
				+ df.format(disc) + ". Total after discount = RM" + df.format(total));
			}
		}
		else
			System.out.println("\nNo unit enter !");
		
		in.close();
	}
}
