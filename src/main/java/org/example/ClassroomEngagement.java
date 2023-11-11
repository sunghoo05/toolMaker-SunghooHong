package org.example;

public class ClassroomEngagement {
    public static String ClassroomEngagementLetterGrade;

    public static void ClassroomEngagementLetterGradeCalculator(int Engagement) {
        if (Engagement >= 24) {
            ClassroomEngagementLetterGrade = "A";
            System.out.println("Your Classroom Engagement Letter Grade is: " + ClassroomEngagementLetterGrade);
        } else if (Engagement >= 22 && Engagement < 24) {
            ClassroomEngagementLetterGrade = "B";
            System.out.println("Your Classroom Engagement Letter Grade is: " + ClassroomEngagementLetterGrade);
        } else if (Engagement >= 20 && Engagement < 22) {
            ClassroomEngagementLetterGrade = "C";
            System.out.println("Your Classroom Engagement Letter Grade is: " + ClassroomEngagementLetterGrade);
        } else if (Engagement >= 18 && Engagement < 20) {
            ClassroomEngagementLetterGrade = "D";
            System.out.println("Your Classroom Engagement Letter Grade is: " + ClassroomEngagementLetterGrade);
        } else {
            ClassroomEngagementLetterGrade = "F";
            System.out.println("Your Classroom Engagement Letter Grade is: " + ClassroomEngagementLetterGrade);
        }
    }
}