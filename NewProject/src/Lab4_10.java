import java.util.Scanner;

public class Lab4_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get room type
        System.out.println("1. Single room (RM185/day)");
        System.out.println("2. Double room (RM210/day)");
        System.out.println("3. Family room (RM285/day)");
        System.out.print("Select room type (1-3):");
        int roomType = in.nextInt();
        in.nextLine(); // Consume the newline character

        // Get customer information
        System.out.println("Are you a government servant? (yes/no)");
        String isGovernmentServant = in.nextLine();
        System.out.println("Enter your age:");
        int age = in.nextInt();
        
        in.close();

        // Calculate price
        double price = 0;
        switch (roomType) {
            case 1:
                price = 185;
                break;
            case 2:
                price = 210;
                break;
            case 3:
                price = 285;
                break;
            default:
                System.out.println("Invalid room type.");
                return;
        }

        // Apply discounts
        if (isGovernmentServant.equalsIgnoreCase("yes") && age > 60) {
            price *= 0.75; // 35% discount
        } else if (isGovernmentServant.equalsIgnoreCase("yes")) {
            price *= 0.90; // 10% discount
        } else if (age > 60) {
        	price *= 0.85; // 15% discount
        }

        // Display price
        System.out.println("The price of the room booking is RM" + price);
    }
}