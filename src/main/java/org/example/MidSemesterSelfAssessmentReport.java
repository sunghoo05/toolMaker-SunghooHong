package org.example;

public class MidSemesterSelfAssessmentReport
{
    public static String MidSemesterSelfAssessmentLetterGrade;

    public static void MidSemesterSelfAssessmentLetterGradeCalculator(boolean MidTermSelfAssessment)
    {
        if (MidTermSelfAssessment)
        {
            MidSemesterSelfAssessmentLetterGrade = "A";
            System.out.println("Your Mid Semester Self Assessment Letter Grade is: " + MidSemesterSelfAssessmentLetterGrade);
        } else
        {
            MidSemesterSelfAssessmentLetterGrade = "D";
            System.out.println("Your Mid Semester Self Assessment Letter Grade is: " + MidSemesterSelfAssessmentLetterGrade);
        }
    }
}