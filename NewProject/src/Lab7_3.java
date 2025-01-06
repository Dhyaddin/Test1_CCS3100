import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab7_3 {
    public static int readInput(Scanner in) {
        System.out.print("Enter your usage per month (kWh): ");
        return in.nextInt();
    }

    public static double calculateBill(int usageKwh) {
        double total = 0, t1, t2, t3, t4, t5;
        final double Kwh1 = 21.80, Kwh2 = 33.40, Kwh3 = 51.50, Kwh4 = 54.60, Kwh5 = 57.10;

        if (usageKwh > 0 && usageKwh <= 200) {
            t1 = (usageKwh * Kwh1) / 100;
            total = t1;
        } else if (usageKwh > 200 && usageKwh <= 300) {
            t1 = (200 * Kwh1) / 100;
            t2 = ((usageKwh - 200) * Kwh2) / 100;
            total = t1 + t2;
        } else if (usageKwh > 300 && usageKwh <= 600) {
            t1 = (200 * Kwh1) / 100;
            t2 = (100 * Kwh2) / 100;
            t3 = ((usageKwh - 300) * Kwh3) / 100;
            total = t1 + t2 + t3;
        } else if (usageKwh > 600 && usageKwh <= 900) {
            t1 = (200 * Kwh1) / 100;
            t2 = (100 * Kwh2) / 100;
            t3 = (300 * Kwh3) / 100;
            t4 = ((usageKwh - 600) * Kwh4) / 100;
            total = t1 + t2 + t3 + t4;
        } else if (usageKwh > 900) {
            t1 = (200 * Kwh1) / 100;
            t2 = (100 * Kwh2) / 100;
            t3 = (300 * Kwh3) / 100;
            t4 = (300 * Kwh4) / 100;
            t5 = ((usageKwh - 900) * Kwh5) / 100;
            total = t1 + t2 + t3 + t4 + t5;
        } else {
            System.out.println("\nYou did not enter a valid usage amount.");
            return -1; 
        }

        return total;
    }

    // Method to display the output
    public static void displayOutput(int usageKwh, double total) {
        DecimalFormat df = new DecimalFormat("0.00");

        if (total > 3.00) {
            System.out.println("\nYour electricity bill is RM" + df.format(total) + ", for a usage of " + usageKwh + " kWh.");
        } else {
            System.out.println("\nYour bill is below RM3.00, so you only need to pay RM3.00.");
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char continueInput;

        do {
            int usageKwh = readInput(in);

            double total = calculateBill(usageKwh);
            
            if (total != -1) {
                displayOutput(usageKwh, total);
            }
            
            System.out.print("\nDo you want to calculate for another customer? (Y/N): ");
            continueInput = in.next().charAt(0);
            in.nextLine(); // Consume the newline character left by next()

        } while (continueInput == 'Y' || continueInput == 'y');

        in.close();
    }
}
