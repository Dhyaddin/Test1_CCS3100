import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab3_2 {
	public static void main (String args[]) {
		int fTest,sTest,assg1,assg2,assg3,fExam;
		int numMatric;
		
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		DecimalFormat df1 = new DecimalFormat("0.00");
		
		System.out.print("Matric: ");
		numMatric = in.nextInt();
		
		System.out.print("Enter 1st Test: ");
		fTest = in.nextInt();
		int markFtest = (int) ((fTest/40.0) * 15);
		
		
		System.out.print("Enter 2nd Test: ");
		sTest = in.nextInt();
		int markStest = (int) ((sTest/40.0)* 20);
		
		System.out.print("Enter Assignment 1: ");
		assg1 = in.nextInt();
		System.out.print("Enter Assignment 2: ");
		assg2 = in.nextInt();
		System.out.print("Enter Assignment 3: ");
		assg3 = in.nextInt();
		double tAssg = (double) ((assg1 + assg2 + assg3) / 3.0);
		int markAssg = (int) (((assg1 + assg2 + assg3) / 150.0) * 35.0);
		
		System.out.print("Enter your Final Exam mark: : ");
		fExam = in.nextInt();
		int markFexam = (int) ((fExam/80.0) *30);
		
		int total = markFtest + markStest + markAssg + markFexam;
		
		System.out.println("\n \t\t\t\tCALCULATED MARKS");
		System.out.println("\n MATRIC | FIRST TEST | SECOND TEST |  A1   A2    A3    ASSIGNMENET |    FINAL    |  TOTAL ");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println(" " + numMatric + "\t|" + df.format(fTest) + "(" + df1.format(markFtest) + "%)" + "| " 
		+ df.format(sTest) + "(" + df1.format(markStest) + "%)" + "|" + df.format(assg1) + "  " + df.format(assg2) + "  " 
		+ df.format(assg3) + "  " + df1.format(tAssg) + "(" + df1.format(markAssg) + "%)" + "| " + df.format(fExam) 
		+ "(" + df1.format(markFexam) + "%)" + "|  " + total + "%");
		
		
		in.close();
	}
}
