//import java.util.Scanner;
//import java.text.DecimalFormat;
//
//public class Lab5_1 {
//    public static void main(String args[]) {
//        int fTest, tFtest = 0, markFtest,
//        		sTest, tStest = 0, markStest,
//        		assg1, tAssg1 = 0, assg2, tAssg2 = 0, assg3, tAssg3 = 0,
//        		fExam, tFexam = 0, markFexam,
//        		numStudents, total = 0;
//        double tAssg, markAssg;
//        String grade = "";
//        
//        Scanner in = new Scanner(System.in);
//        DecimalFormat df = new DecimalFormat("0.0");
//        DecimalFormat df1 = new DecimalFormat("0.00");
//
//        System.out.print("Number of students you want to calculate: ");
//        numStudents = in.nextInt();
//        
//        // Loop through each student
//        for (int i = 0; i < numStudents; i++) {	
//        	
//            System.out.print("Enter 1st Test student " + (i + 1) + ") : ");
//            fTest = in.nextInt();
//            tFtest += fTest;
//            //markFtest = (int) ((tFtest / 40.0) * 15);
//            //TmarkFtest += markFtest;
//
//            System.out.print("Enter 2nd Test student " + (i + 1) + ") : ");
//            sTest = in.nextInt();
//            tStest += sTest;
////            markStest = (int) ((tStest / 40.0) * 20);
////            TmarkStest += markStest;
//
//            System.out.print("Enter Assignment 1 student " + (i + 1) + ") : ");
//            assg1 = in.nextInt();
//            tAssg1 += assg1;
//            System.out.print("Enter Assignment 2 student " + (i + 1) + ") : ");
//            assg2 = in.nextInt();
//            tAssg2 += assg2;
//            System.out.print("Enter Assignment 3 student " + (i + 1) + ") : ");
//            assg3 = in.nextInt();
//            tAssg3 += assg3;
//
////            tAssg = (double) ((tAssg1 + tAssg2 + tAssg3) / 3.0);
////            TotalAssg += tAssg;
////            markAssg = (int) (((tAssg1 + tAssg2 + tAssg3) / 150.0) * 35.0);
////            TmarkAssg += markAssg;
//
//            System.out.print("Enter Final Exam mark student " + (i + 1) + ") : ");
//            fExam = in.nextInt();
//            tFexam += fExam;
////            markFexam = (int) ((tFexam / 80.0) * 30);
////            TmarkFexam += markFexam;
// 
//        }
//        
//        markFtest = (int) ((tFtest / (40.0 * numStudents )) * (15 * numStudents));
//        
//        markStest = (int) ((tStest / (40.0 * numStudents)) * (20 * numStudents));
//        
//        tAssg = (double) ((tAssg1 + tAssg2 + tAssg3) / (3.0 * numStudents));
//        markAssg = (int) (((tAssg1 + tAssg2 + tAssg3) / (150.0 * numStudents)) * (35.0 * numStudents));	
//        
//        markFexam = (int) ((tFexam / (80.0 * numStudents)) * (30 * numStudents));
//        total += (int) (markFtest + markStest + markAssg + markFexam);
//        
//        if (total >= 0 && total < 40) {
//			grade = "F";
//		}
//		else if (total >= 40 && total < 45) {
//			grade = "D";
//		}
//		else if (total >= 45 && total < 50) {
//			grade = "D+";
//		}
//		else if (total >= 50 && total < 55) {
//			grade = "C";
//		}
//		else if (total >= 55 && total < 60) {
//			grade = "C+";
//		}
//		else if (total >= 60 && total < 65) {
//			grade = "B-";
//		}
//		else if (total >= 65 && total < 70) {
//			grade = "B";
//		}
//		else if (total >= 70 && total < 75) {
//			grade = "B+";
//		}
//		else if (total >= 75 && total < 85) {
//			grade = "A-";
//		}
//		else if (total >= 85 && total <= 100) {
//			grade = "A";
//		}
//
//            // Display results for the current student
//		System.out.println("\n \t\t\t\tCALCULATED MARKS");
//		System.out.println("\n FIRST TEST | SECOND TEST |  A1   A2    A3    ASSIGNMENET |    FINAL    |  TOTAL  | GRADE ");
//		System.out.println("------------------------------------------------------------------------------------------------------");
//		System.out.println(" " + df.format(tFtest) + "(" + df1.format(markFtest) + "%)" + "| " 
//                + df.format(tStest) + "(" + df1.format(markStest) + "%)" + "|" + df.format(tAssg1) + "  " + df.format(tAssg2) + "  " 
//                + df.format(tAssg3) + "  " + df1.format(tAssg) + "(" + df1.format(markAssg) + "%)" + "| " + df.format(tFexam) 
//                + "(" + df1.format(markFexam) + "%)" + "|   " + total + "%" + "  |" + grade);
//
//        in.close();
//    }
//}

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab5_1 {
    public static void main(String args[]) {
        int numStudents;
        Scanner in = new Scanner(System.in);
        //DecimalFormat df = new DecimalFormat("0.0");
        DecimalFormat df1 = new DecimalFormat("0.00");

        // Initialize total marks for each component
        int totalFtest = 0, totalStest = 0, totalAssg = 0, totalFexam = 0, totalM = 0;

        System.out.print("Number of students you want to calculate: ");
        numStudents = in.nextInt();

        // Loop through each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEntering details for student " + (i + 1) + ":");

            System.out.print("Enter 1st Test (0-40): ");
            int fTest = in.nextInt();
            int markFtest = (int) ((fTest / 40.0) * 15);
            totalFtest += markFtest;

            System.out.print("Enter 2nd Test (0-40): ");
            int sTest = in.nextInt();
            int markStest = (int) ((sTest / 40.0) * 20);
            totalStest += markStest;

            System.out.print("Enter Assignment 1 (0-50): ");
            int assg1 = in.nextInt();
            System.out.print("Enter Assignment 2 (0-50): ");
            int assg2 = in.nextInt();
            System.out.print("Enter Assignment 3 (0-50): ");
            int assg3 = in.nextInt();
            double avgAssg = (assg1 + assg2 + assg3) / 3.0;
            int markAssg = (int) (((assg1 + assg2 + assg3) / 150.0) * 35.0);
            totalAssg += markAssg;

            System.out.print("Enter Final Exam mark (0-80): ");
            int fExam = in.nextInt();
            int markFexam = (int) ((fExam / 80.0) * 30);
            totalFexam += markFexam;

            // Calculate total marks for the current student
            int total = markFtest + markStest + markAssg + markFexam;

            // Determine grade
            String grade;
            if (total < 40) {
                grade = "F";
            } else if (total < 45) {
                grade = "D";
            } else if (total < 50) {
                grade = "D+";
            } else if (total < 55) {
                grade = "C";
            } else if (total < 60) {
                grade = "C+";
            } else if (total < 65) {
                grade = "B-";
            } else if (total < 70) {
                grade = "B";
            } else if (total < 75) {
                grade = "B+";
            } else if (total < 85) {
                grade = "A-";
            } else {
                grade = "A";
            }

            // Display results for the current student
            System.out.println("\nStudent " + (i + 1) + " Results:");
            System.out.println("First Test: " + fTest + " (" + df1.format(markFtest) + "%)");
            System.out.println("Second Test: " + sTest + " (" + df1.format(markStest) + "%)");
            System.out.println("Assignments: " + assg1 + ", " + assg2 + ", " + assg3 + " (Avg: " + df1.format(avgAssg) + ", " + df1.format(markAssg) + "%)");
            System.out.println("Final Exam: " + fExam + " (" + df1.format(markFexam) + "%)");
            System.out.println("Total Marks: " + total + "%");
            System.out.println("Grade: " + grade);
        }
        
        totalM = totalFtest + totalStest + totalAssg + totalFexam;

        // Display summary of total marks for all students
        System.out.println("\n\t\t\t\tSUMMARY OF MARKS");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Total First Test Marks: " + totalFtest + "%");
        System.out.println("Total Second Test Marks: " + totalStest + "%");
        System.out.println("Total Assignment Marks: " + totalAssg + "%");
        System.out.println("Total Final Exam Marks: " + totalFexam + "%");
        System.out.println("Total Marks: " + totalM + "%");
        
        in.close();
    }
}