import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab4_2 {
	public static void main (String args[]) {
		int fTest,sTest,assg1,assg2,assg3,fExam;
		int numMatric;
		String grade = "";
		
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		DecimalFormat df1 = new DecimalFormat("0.00");
		
		System.out.print("Matric: ");
		numMatric = in.nextInt();
		
		System.out.print("Enter 1st Test (0-40): ");
		fTest = in.nextInt();
		int markFtest = (int) ((fTest/40.0) * 15);
		
		
		System.out.print("Enter 2nd Test (0-40): ");
		sTest = in.nextInt();
		int markStest = (int) ((sTest/40.0)* 20);
		
		System.out.print("Enter Assignment 1 (0-50): ");
		assg1 = in.nextInt();
		System.out.print("Enter Assignment 2 (0-50): ");
		assg2 = in.nextInt();
		System.out.print("Enter Assignment 3 (0-50): ");
		assg3 = in.nextInt();
		double tAssg = (double) ((assg1 + assg2 + assg3) / 3.0);
		int markAssg = (int) (((assg1 + assg2 + assg3) / 150.0) * 35.0);
		
		System.out.print("Enter your Final Exam mark (0-80): ");
		fExam = in.nextInt();
		int markFexam = (int) ((fExam/80.0) *30);
		
		int total = markFtest + markStest + markAssg + markFexam;
		
		if (total >= 0 && total < 40) {
			grade = "F";
		}
		else if (total >= 40 && total < 45) {
			grade = "D";
		}
		else if (total >= 45 && total < 50) {
			grade = "D+";
		}
		else if (total >= 50 && total < 55) {
			grade = "C";
		}
		else if (total >= 55 && total < 60) {
			grade = "C+";
		}
		else if (total >= 60 && total < 65) {
			grade = "B-";
		}
		else if (total >= 65 && total < 70) {
			grade = "B";
		}
		else if (total >= 70 && total < 75) {
			grade = "B+";
		}
		else if (total >= 75 && total < 85) {
			grade = "A-";
		}
		else if (total >= 85 && total <= 100) {
			grade = "A";
		}
		
		System.out.println("\n \t\t\t\tCALCULATED MARKS");
		System.out.println("\n MATRIC | FIRST TEST | SECOND TEST |  A1   A2    A3    ASSIGNMENET |    FINAL    |  TOTAL  | GRADE ");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println(" " + numMatric + "\t|" + df.format(fTest) + "(" + df1.format(markFtest) + "%)" + "| " 
		+ df.format(sTest) + "(" + df1.format(markStest) + "%)" + "|" + df.format(assg1) + "  " + df.format(assg2) + "  " 
		+ df.format(assg3) + "  " + df1.format(tAssg) + "(" + df1.format(markAssg) + "%)" + "| " + df.format(fExam) 
		+ "(" + df1.format(markFexam) + "%)" + "|   " + total + "%" + "   |  " + grade);
		
		
		in.close();
	}
}
