import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a password
        System.out.print("Enter a password: ");
        String password = in.nextLine();
        System.out.print("\n");

        // Initialize counters
        int digitCount = 0;
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        boolean hasInvalidCharacter = false;

        // Check each character of the password
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            } 
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            }
            if (Character.isLowerCase(ch)) {
            	lowercaseCount++;
            }
            if (!Character.isLetterOrDigit(ch)) {
                hasInvalidCharacter = true;
            }
        }

        // Check and display specific messages for not fulfill requirements
        boolean isValid = true;

        // a) Check if the password has at least 8 characters
        if (password.length() < 8) {
            System.out.println("Password must have at least 8 characters.");
            isValid = false;
        }

        // b) Check if the password contains invalid characters
        if (hasInvalidCharacter) {
            System.out.println("Password must consist of only lowercase, uppercase letters, and digits.");
            isValid = false;
        }

        // c) Check if the password has at least 2 digits
        if (digitCount < 2) {
            System.out.println("Password must contain at least 2 digits.");
            isValid = false;
        }

        // d) Check if the password has at least 1 uppercase letter
        if (uppercaseCount < 1) {
            System.out.println("Password must contain at least 1 uppercase letter.");
            isValid = false;
        }
        // e) Check if the password has at least 1 lowercase letter
        if (lowercaseCount < 1) {
            System.out.println("Password must contain at least 1 lowercase letter.");
            isValid = false;
        }
        System.out.println(password.length());
        // If the password is valid
        if (isValid) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password. Please fix the above issues.");
        }
        
        in.close();
    }
}