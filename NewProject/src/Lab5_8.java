//import java.util.Scanner;

public class Lab5_8 {
	public static void main (String args[]) {
	int y,x;
	
			System.out.println("-----------------------------------");
			//Pattern A
			for(x = 1; x < 7; x++) {
				
				for (y = 1; y <= x; y++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			
			System.out.println("-----------------------------------");
			//Pattern B
			for(x = 7; x > 0; x--) {
							
				for (y = 1; y <= x; y++) {
					System.out.print("*");
				}				
				System.out.println();
			}
			
			System.out.println("-----------------------------------");
			//Pattern C
			int n = 7;
			for(x = 1; x < n; x++) {
				
				for (y = 1; y <= n - x; y++) {
					System.out.print(" ");
				}
				for (y = 1; y <= x; y++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			
			System.out.println("-----------------------------------");
			//Pattern D
			int z = 7;
			for(x = z; x > 0; x--) {
				
				for (y = 1; y <= z - x; y++) {
					System.out.print(" ");
				}
				for (y = 1; y <= x; y++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			
	}
}
