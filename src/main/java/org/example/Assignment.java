package org.example;

public class Assignment {
    public static String AssignmentsLetterGrade;

    public static void AssignmentsLetterGradeCalculator(int Assignments)
    {
        if (Assignments == 7) {
            AssignmentsLetterGrade = "A";
            System.out.println("Your Assignment Letter Grade is: " + AssignmentsLetterGrade);
        } else if (Assignments == 6) {
            AssignmentsLetterGrade = "B";
            System.out.println("Your Assignment Letter Grade is: " + AssignmentsLetterGrade);
        } else if (Assignments == 5) {
            AssignmentsLetterGrade = "C";
            System.out.println("Your Assignment Letter Grade is: " + AssignmentsLetterGrade);
        } else if (Assignments == 4) {
            AssignmentsLetterGrade = "D";
            System.out.println("Your Assignment Letter Grade is: " + AssignmentsLetterGrade);
        } else {
            AssignmentsLetterGrade = "F";
            System.out.println("Your Assignment Letter Grade is: " + AssignmentsLetterGrade);
        }
    }
}