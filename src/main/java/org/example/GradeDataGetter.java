package org.example;

// imports
import java.util.Scanner;

public class GradeDataGetter {
    // Variables
    public static int Achievements;
    public static int Assignments;
    public static int Engagement;
    public static boolean MidTermSelfAssessment;
    public static String iteration1OfFirstProject;
    public static String iteration2OfFirstProject;
    public static String iteration1OfFinalProject;
    public static String iteration2OfFinalProject;
    public static String iteration3OfFinalProject;
    public static boolean FinalExam;

    public static void dataGetter()
    {
        Scanner input = new Scanner(System.in);

        // Engagement Question
        System.out.println("How many classes did you/do you expect to go? (Out of 28)");
        Engagement = input.nextInt();

        // Assignments Question
        System.out.println("How many assignments did you complete? (Out of 7)");
        Assignments = input.nextInt();

        // Achievements Question
        System.out.println("How many achievements did you/do you expect to finish? (Out of 6)");
        Achievements = input.nextInt();

        // Mid-semester Self Assessment Question
        System.out.println("Did you complete the Mid-Semester Self Assessment? Please answer in true or false");
        MidTermSelfAssessment = input.nextBoolean();

        // Projects Question
        System.out.println("Which letter grade did you get for the first iteration of the first project?");
        iteration1OfFirstProject = input.next();
        System.out.println("Which letter grade did you get for the second iteration of the first project?");
        iteration2OfFirstProject = input.next();
        System.out.println("Which letter grade did you get for the first iteration of the final project?");
        iteration1OfFinalProject = input.next();
        System.out.println("Which letter grade did you get for the second iteration of the final project?");
        iteration2OfFinalProject = input.next();
        System.out.println("Which letter grade did you get for the third iteration of the final project?");
        iteration3OfFinalProject = input.next();

        // Final Exam Question
        System.out.println("Did you complete the final exam? Please answer in true or false");
        FinalExam = input.nextBoolean();
    }
}