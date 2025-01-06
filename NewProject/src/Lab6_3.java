import java.util.Scanner;

public class Lab6_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to input their name and MyKad number
        System.out.print("Enter name: ");
        String name = in.nextLine();

        System.out.print("Enter MyKad number without the \"-\" sign: ");
        String myKad = in.nextLine();
        
        in.close();

        // Validate the MyKad length
        if (myKad.length() != 12) {
            System.out.println("Invalid MyKad number. It must contain exactly 12 digits.");
            return;
        }

        // Extract year of birth and calculate age
        String yearOfBirthStr = myKad.substring(0, 2);
        int yearOfBirth = Integer.parseInt(yearOfBirthStr) > 24 ? 1900 + Integer.parseInt(yearOfBirthStr)
                                                               : 2000 + Integer.parseInt(yearOfBirthStr);
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - yearOfBirth;

        // Extract gender
        char genderDigit = myKad.charAt(11);
        String gender;
        if ((genderDigit % 2) == 0) {
        	gender = "Female";
        }
        else
        	gender = "Male";
        

        // Display the details
        System.out.println("\n" + name);
        System.out.println("Year birth is " + yearOfBirth + " Age is " + age);
        System.out.println("Gender is " + gender);
        // Extract state of birth
        String stateCode = myKad.substring(6, 8);
        switch (stateCode) {
        case "01": case "21": case "22": case "23": case "24":System.out.println("State birth is JOHOR");break;
        case "02": case "25": case "26": case "27":System.out.println("State birth is KEDAH");break;
        case "03": case "28": case "29":System.out.println("State birth is KELANTAN");break;
        case "04":System.out.println("State birth is MELAKA");break;
        case "05": case "30": System.out.println("State birth is NEGERI SEMBILAN");break;
        case "06": case "31": case "32":System.out.println("State birth is PAHANG");break;
        case "07":System.out.println("State birth is PENANG");break;
        case "08": case "33":System.out.println("State birth is PERAK");break;
        case "09": case "34":System.out.println("State birth is PERLIS");break;
        case "10": case "35":System.out.println("State birth is SELANGOR");break;
        case "11": case "36": case "37": case "38": case "39":System.out.println("State birth is TERENGGANU");break;
        case "12":System.out.println("State birth is SABAH");break;
        case "13":System.out.println("State birth is SARAWAK");break;
        case "14":System.out.println("State birth is KUALA LUMPUR");break;
        case "15":System.out.println("State birth is LABUAN");break;
        case "16":System.out.println("State birth is PUTRAJAYA");break;
        default:System.out.println("Unknown State");break;
    }
    }
}