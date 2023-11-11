package org.example;

public class CourseGradeCalculator
{
    public static char CourseLetterGrade;

    public static void CourseLetterGradeCalculator (String ClassroomEngagementLetterGrade, String AssignmentsLetterGrade, String AchievementsLetterGrade, String MidSemesterSelfAssessmentLetterGrade, String projectsLetterGrade, String finalExamLetterGrade)
    {
        // Convert Letter Grades into number grades to calculate better
        int totalNumberGrade = 0;

        // Classroom Engagement Letter Grade
        if (ClassroomEngagementLetterGrade.equals("A")) {
            totalNumberGrade += 5;
        } else if (ClassroomEngagementLetterGrade.equals("B")) {
            totalNumberGrade += 4;
        } else if (ClassroomEngagementLetterGrade.equals("C")) {
            totalNumberGrade += 3;
        } else if (ClassroomEngagementLetterGrade.equals("D")) {
            totalNumberGrade += 2;
        } else if (ClassroomEngagementLetterGrade.equals("F")) {
            totalNumberGrade += 1;
        }

        // Assignments Letter Grade
        if (AssignmentsLetterGrade.equals("A")) {
            totalNumberGrade += 5;
        } else if (AssignmentsLetterGrade.equals("B")) {
            totalNumberGrade += 4;
        } else if (AssignmentsLetterGrade.equals("C")) {
            totalNumberGrade += 3;
        } else if (AssignmentsLetterGrade.equals("D")) {
            totalNumberGrade += 2;
        } else if (AssignmentsLetterGrade.equals("F")) {
            totalNumberGrade += 1;
        }

        // Achievements Letter Grade
        if (AchievementsLetterGrade.equals("A")) {
            totalNumberGrade += 5;
        } else if (AchievementsLetterGrade.equals("B")) {
            totalNumberGrade += 4;
        } else if (AchievementsLetterGrade.equals("C")) {
            totalNumberGrade += 3;
        } else if (AchievementsLetterGrade.equals("D")) {
            totalNumberGrade += 2;
        } else if (AchievementsLetterGrade.equals("F")) {
            totalNumberGrade += 1;
        }

        // Mid Semester Self Assessment Letter Grade
        if (MidSemesterSelfAssessmentLetterGrade.equals("A")) {
            totalNumberGrade += 5;
        } else if (MidSemesterSelfAssessmentLetterGrade.equals("B")) {
            totalNumberGrade += 4;
        } else if (MidSemesterSelfAssessmentLetterGrade.equals("C")) {
            totalNumberGrade += 3;
        } else if (MidSemesterSelfAssessmentLetterGrade.equals("D")) {
            totalNumberGrade += 2;
        } else if (MidSemesterSelfAssessmentLetterGrade.equals("F")) {
            totalNumberGrade += 1;
        }

        // Projects Letter Grade
        if (projectsLetterGrade.equals("A")) {
            totalNumberGrade += 5;
        } else if (projectsLetterGrade.equals("B")) {
            totalNumberGrade += 4;
        } else if (projectsLetterGrade.equals("C")) {
            totalNumberGrade += 3;
        } else if (projectsLetterGrade.equals("D")) {
            totalNumberGrade += 2;
        } else if (projectsLetterGrade.equals("F")) {
            totalNumberGrade += 1;
        }

        // Final Exam Letter Grade
        if (finalExamLetterGrade.equals("A")) {
            totalNumberGrade += 5;
        } else if (finalExamLetterGrade.equals("B")) {
            totalNumberGrade += 4;
        } else if (finalExamLetterGrade.equals("C")) {
            totalNumberGrade += 3;
        } else if (finalExamLetterGrade.equals("D")) {
            totalNumberGrade += 2;
        } else if (finalExamLetterGrade.equals("F")) {
            totalNumberGrade += 1;
        }

        // Converting number grades back into the total letter grade
        if (totalNumberGrade == 30) {
            CourseLetterGrade = 'A';
            System.out.println("Your Final Letter Grade is: " + CourseLetterGrade);
        } else if (totalNumberGrade >= 24 && totalNumberGrade < 30) {
            CourseLetterGrade = 'B';
            System.out.println("Your Final Letter Grade is: " + CourseLetterGrade);
        } else if (totalNumberGrade >= 18 && totalNumberGrade < 24) {
            CourseLetterGrade = 'C';
            System.out.println("Your Final Letter Grade is: " + CourseLetterGrade);
        } else if (totalNumberGrade >= 12 && totalNumberGrade < 18) {
            CourseLetterGrade = 'D';
            System.out.println("Your Final Letter Grade is: " + CourseLetterGrade);
        } else {
            CourseLetterGrade = 'F';
            System.out.println("Your Final Letter Grade is: " + CourseLetterGrade);
        }
    }
}