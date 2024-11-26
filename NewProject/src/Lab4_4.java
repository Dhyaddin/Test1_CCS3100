import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab4_4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int usageKwh;
        double total = 0, t1, t2, t3, t4, t5;
        final double Kwh1 = 21.80, Kwh2 = 33.40, Kwh3 = 51.50, Kwh4 = 54.60, Kwh5 = 57.10;

        System.out.print("Enter your usage per month (kWh) : ");
        usageKwh = in.nextInt();
        in.close();

        System.out.println("Your usage per month is " + usageKwh + "kWh.");

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
            return;
        }

        if (total > 3.00) {
            System.out.println("\nYour electricity bill is RM" + df.format(total) + ", for a usage of " + usageKwh + " kWh.");
        } else {
            System.out.println("\nYour bill is below RM3.00 at RM so you need to pay RM3.00");
        }
    }
}
