import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab4_8 {
    public static void main(String args[]) {
        int p1, p2, p3, total;
        double price = 0, price1 = 0, price2 = 0, price3 = 0;

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("How much adult: ");
        p1 = in.nextInt();

        System.out.print("How much kid (4y/o - 13 y/o): ");
        p2 = in.nextInt();

        System.out.print("How much senior (61 y/o above): ");
        p3 = in.nextInt();

        total = p1 + p2 + p3;

        if (total != 0) {
            if (p1 != 0) {
                price1 = 7 * p1;
                price += price1; // Add adult price to total price
            }
            if (p2 != 0) {
                price2 = 0.3 * 7 * p2; // 30% of adult price
                price += price2; // Add kid price to total price
            }
            if (p3 != 0) {
                price3 = 0.5 * 7 * p3; // 50% of adult price
                price += price3; // Add senior price to total price
            }
            System.out.print("Price need to be paid: RM" + df.format(price));
        } else {
            System.out.print("There's no input person watching movie");
        }

        in.close();
    }
}