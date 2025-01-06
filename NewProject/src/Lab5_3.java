import java.util.Scanner;

public class Lab5_3 {
	public static void main (String args[]) {
		int number = (int)(Math.random() * 101),guess;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Guess the generated number between 1-100: ");
		guess = in.nextInt();
		
		while (guess != number) {
			if (guess > number) {
				System.out.println("\nThe number guess to big ");
				System.out.print("Lets try again !. Guess the generated number between 1-100: ");
				guess = in.nextInt();
			}
			else if (guess < number) {
				System.out.println("\nThe number guess to low ");
				System.out.print("Lets try again !. Guess the generated number between 1-100: ");
				guess = in.nextInt();
			}
		}
		
		System.out.println("\nWelldone you guess correctly !");
		
		in.close();
	}
}
