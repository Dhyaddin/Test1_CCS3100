public class Lab5_9 {
    public static void main(String[] args) {
        // Define the number of rows
        int n = 8;

        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Print spaces for alignment
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("    "); // Four spaces for proper alignment
            }

            // Print left side of the pyramid (including the middle number)
            int value = 1; // Start with 1
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", value); // Print with width 4
                value *= 3; // Multiply by 3 for the next number
            }

            // Print right side of the pyramid (excluding the middle number)
            value /= 3; // Start with the last value from the left part
            for (int j = i - 1; j >= 0; j--) {
                value /= 3; // Divide by 3 for the previous number
                System.out.printf("%4d", value); // Print with width 4
            }

            // Move to the next line
            System.out.println();
        }
    }
}