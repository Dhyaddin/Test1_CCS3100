import java.util.Scanner;

public class Lab7_4 {
    public static int count(String str, char a) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.nextLine();
        
        System.out.print("Enter a character to check from the string you enter: ");
        char a = in.next().charAt(0);

        int occurrences = count(str, a);

        // Display the result
        System.out.println("The character '" + a + "' appears " + occurrences + " times in the string \"" + str + "\".");
        
        in.close();
    }
}
