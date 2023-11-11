package org.example;

public class FinalExam
{
    public static String finalExamLetterGrade;

    public static void finalExamLetterGradeCalculator(boolean FinalExam)
    {
        if (FinalExam) {
            finalExamLetterGrade = "A";
            System.out.println("Your Final Exam Letter Grade is: " + finalExamLetterGrade);
        } else {
            finalExamLetterGrade = "D";
            System.out.println("Your Final Exam Letter Grade is: " + finalExamLetterGrade);
        }
    }
}