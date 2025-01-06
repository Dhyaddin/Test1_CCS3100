import java.util.Scanner;
public class Lab5_7 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int a=0,b=1,n;
		
		System.out.print("Insert your 'n' number: ");
		n=  in.nextInt();
		
		for(int x=1; x <= n; x++) {
			System.out.print(a + " ");
			
			int next = a + b;
			a = b;
			b = next;
		}
		in.close();
	}
}
