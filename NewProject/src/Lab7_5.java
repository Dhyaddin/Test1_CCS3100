import java.util.Scanner;

public class Lab7_5 {
    public static void displayLoanDetails(String matricNumber, double loanAmount, double repaymentRate) {
        System.out.println("\nMatric Number: " + matricNumber);
        System.out.printf("Total Loan Amount: RM%.2f\n", loanAmount);
        System.out.printf("Monthly Repayment Rate: RM%.2f\n", repaymentRate);
    }
    
    public static double calculateLoanAmount(double tuitionFee, double dailyExpenses, int durationOfStudy, double parentIncome) {
        double totalTuitionFee = tuitionFee * durationOfStudy;
        double totalDailyExpenses = 0;
        double serviceCharge;

        if (parentIncome <= 10000) {
            totalDailyExpenses = dailyExpenses * 250 * durationOfStudy;
            serviceCharge = 0.01 * (totalTuitionFee + totalDailyExpenses);
        } else {
            serviceCharge = 0.01 * totalTuitionFee;
        }

        return totalTuitionFee + totalDailyExpenses + serviceCharge;
    }
    
    public static double calculateRepaymentRate(double loanAmount, int durationOfStudy, int repaymentYears) {
        return loanAmount / (durationOfStudy * 12 * repaymentYears);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("Enter your Matric Number: ");
            String matricNumber = in.nextLine();

            System.out.print("Enter your Parent's Monthly Income (RM): ");
            double parentIncome = in.nextDouble();

            System.out.print("Enter your Tuition Fee per Year (RM): ");
            double tuitionFee = in.nextDouble();

            System.out.print("Enter your Daily Expenses (RM): ");
            double dailyExpenses = in.nextDouble();

            System.out.print("Enter your Duration of Study (in years): ");
            int durationOfStudy = in.nextInt();

            // Calculate loan amount and repayment rate
            int repaymentYears;
            if (parentIncome <= 10000) {
                repaymentYears = 6; // Parent's income is RM10,000 or less
            } else {
                repaymentYears = 4; // Parent's income is more than RM10,000
            }
            double loanAmount = calculateLoanAmount(tuitionFee, dailyExpenses, durationOfStudy, parentIncome);
            double repaymentRate = calculateRepaymentRate(loanAmount, durationOfStudy, repaymentYears);

            // Display the loan details
            displayLoanDetails(matricNumber, loanAmount, repaymentRate);

            // Ask if the user wants to calculate for another customer
            System.out.print("\nDo you want to calculate for another customer? (yes/no): ");
            in.nextLine();
            String response = in.nextLine();
            if (response.equalsIgnoreCase("no")) {
                continueProgram = false;
            }
        }
        in.close();
    }
}
