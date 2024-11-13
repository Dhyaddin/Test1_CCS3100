import java.util.Scanner;

public class Lab4_7 {
	public static void main (String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		String resultM,resultS,resultE;
		int Score;
		
		System.out.print("How much A did you get : ");
		Score = in.nextInt();
		
		System.out.print("Did you get A in Science (Y/N): ");
		resultS = in.nextLine();
		in.nextLine();
		
		System.out.print("Did you get A in Mathemathic (Y/N): ");
		resultM = in.nextLine();
		
		
		System.out.print("Did you get A in English (Y/N): ");
		resultE = in.nextLine();
		
		
		if (Score >= 5) {
			if (resultS.equals("Y") || resultS.equals("y") && resultM.equals("Y") || resultM.equals("y")) {
				System.out.println("You been accepted Form 4 science stream");
			}
			else if (resultE.equals("Y") || resultE.equals("y")  && resultM.equals("Y") || resultM.equals("y")) {
				System.out.println("You been accepted Form 4 science stream");
			}
			else
				System.out.println("You been rejeccted Form 4 science stream");
		}
		else
			System.out.println("You been rejeccted Form 4 science stream");
		in.close();
	}
}
