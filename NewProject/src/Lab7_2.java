import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab7_2 {

    public static void readInput(Scanner in) {
        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter your Height in Meters (m): ");
        double height = in.nextDouble();

        System.out.print("Enter your Weight in Kilograms (kg): ");
        double weight = in.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(height, weight);

        // Classify the BMI
        String bmiStatus = classifyBMI(bmi);

        // Display the output
        displayOutput(name, height, weight, bmi, bmiStatus);
    }

    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    // Method to classify BMI
    public static String classifyBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else if (bmi >= 30 && bmi < 35) {
            return "Obese (Class I)";
        } else if (bmi >= 35 && bmi < 40) {
            return "Obese (Class II)";
        } else {
            return "Obese (Class III)";
        }
    }

    public static void displayOutput(String name, double height, double weight, double bmi, String bmiStatus) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("\n" + name + ", your height is " + df.format(height) + " meters and your weight is " + df.format(weight)
                + " kg." + "\nYour BMI is " + df.format(bmi) + ", you are " + bmiStatus);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        char continueInput;
        do {
            readInput(in);

            System.out.print("\nDo you want to enter details for another user? (Y/N): ");
            continueInput = in.next().charAt(0);
            in.nextLine();

        } while (continueInput == 'Y' || continueInput == 'y');
        
        in.close();
    }
}
