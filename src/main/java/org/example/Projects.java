package org.example;

public class Projects {
    public static char projectsLetterGrade;

    public static void projectsLetterGradeCalculator(String iteration1OfFirstProject, String iteration2OfFirstProject, String iteration1OfFinalProject, String iteration2OfFinalProject, String iteration3OfFinalProject) {
        // Convert Letter Grades into number grades to calculate better
        int totalNumberGrade = 0;
        // First Iteration of First Project
        if (iteration1OfFirstProject.equals("A")) {
            totalNumberGrade += 5;
        } else if (iteration1OfFirstProject.equals("B")) {
            totalNumberGrade += 4;
        } else if (iteration1OfFirstProject.equals("C")) {
            totalNumberGrade += 3;
        } else if (iteration1OfFirstProject.equals("D")) {
            totalNumberGrade += 2;
        } else if (iteration1OfFirstProject.equals("F")) {
            totalNumberGrade += 1;
        }

        // Second Iteration of First Project
        if (iteration2OfFirstProject.equals("A")) {
            totalNumberGrade += 5;
        } else if (iteration2OfFirstProject.equals("B")) {
            totalNumberGrade += 4;
        } else if (iteration2OfFirstProject.equals("C")) {
            totalNumberGrade += 3;
        } else if (iteration2OfFirstProject.equals("D")) {
            totalNumberGrade += 2;
        } else if (iteration2OfFirstProject.equals("F")) {
            totalNumberGrade += 1;
        }

        // First Iteration of Final Project
        if (iteration1OfFinalProject.equals("A")) {
            totalNumberGrade += 5;
        } else if (iteration1OfFinalProject.equals("B")) {
            totalNumberGrade += 4;
        } else if (iteration1OfFinalProject.equals("C")) {
            totalNumberGrade += 3;
        } else if (iteration1OfFinalProject.equals("D")) {
            totalNumberGrade += 2;
        } else if (iteration1OfFinalProject.equals("F")) {
            totalNumberGrade += 1;
        }

        // Second Iteration of Final Project
        if (iteration2OfFinalProject.equals("A")) {
            totalNumberGrade += 5;
        } else if (iteration2OfFinalProject.equals("B")) {
            totalNumberGrade += 4;
        } else if (iteration2OfFinalProject.equals("C")) {
            totalNumberGrade += 3;
        } else if (iteration2OfFinalProject.equals("D")) {
            totalNumberGrade += 2;
        } else if (iteration2OfFinalProject.equals("F")) {
            totalNumberGrade += 1;
        }

        // Converting number grades back into the total letter grade
        if (iteration3OfFinalProject.equals("A") && totalNumberGrade >= 10) {
            projectsLetterGrade = 'A';
            System.out.println("Your Projects Letter Grade is: " + projectsLetterGrade);
        } else if (iteration3OfFinalProject.equals("B") && totalNumberGrade >= 5) {
            projectsLetterGrade = 'B';
            System.out.println("Your Projects Letter Grade is: " + projectsLetterGrade);
        } else if (iteration3OfFinalProject.equals("C") && totalNumberGrade >= 5) {
            projectsLetterGrade = 'C';
            System.out.println("Your Projects Letter Grade is: " + projectsLetterGrade);
        } else if (iteration3OfFinalProject.equals('D') && totalNumberGrade >= 5) {
            projectsLetterGrade = 'D';
            System.out.println("Your Projects Letter Grade is: " + projectsLetterGrade);
        } else {
            projectsLetterGrade = 'F';
            System.out.println("Your Projects Letter Grade is: " + projectsLetterGrade);
        }
    }
}