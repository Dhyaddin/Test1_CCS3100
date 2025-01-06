import java.util.Scanner;

public class Lab7_1 {
    public static int rdNum(Scanner in) {
        System.out.print("Insert your number: ");
        return in.nextInt();
    }

    public static int highValue(int num, int biggest) {
        if (num > biggest) {
            biggest = num;
        }
        return biggest;
    }

    public static int calcAvg(int total, int count) {
        return total / count;
    }

    public static void displayResults(int total, int avg, int biggest) {
        System.out.println("\nTotal: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Largest Number: " + biggest);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = 1, total = 0, num = 0, count = 0, biggest = Integer.MIN_VALUE;
        
        while(x != 0) {
            // Read number
            num = rdNum(in);
            
            // Define the biggest value
            biggest = highValue(num, biggest);
            
            // Update total and count
            total += num;
            count++;
            
            // Ask the user if they want to exit
            System.out.print("You want exit? If YES press '0' if NO press any other number: ");
            x = in.nextInt();
        }
        
        // Calculate average
        int avg = calcAvg(total, count);
        
        // Display results
        displayResults(total, avg, biggest);
        
        in.close();
    }
}
