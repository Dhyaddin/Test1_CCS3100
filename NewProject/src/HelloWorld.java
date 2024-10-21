import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
		Scanner rd = new Scanner(System.in); //input
		System.out.println("Enter the string you want show :");
		String a = rd.nextLine();
		System.out.println("Your String Output : " + a);
		rd.close();
		//System.out.println("Hello World UPM !");
	}
}
