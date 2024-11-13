import java.util.Scanner;
//import java.text.DecimalFormat;

public class Lab4_6 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		//DecimalFormat df = new DecimalFormat("0.00");
		
		String gender;
		int age;
		
		System.out.print("What is your gender (M/F): ");
		gender = in.nextLine();
		
		System.out.print("What is your age : ");
		age = in.nextInt();
		
		if (gender.equals("M")) {
			if(age > 17 && age <= 30) {
				System.out.println("You been accepted by poster");
			}
			else
				System.out.println("Your age below the requirement");
		}
		else
			System.out.println("You're been rejected by poster");
		
		in.close();
	}
}
