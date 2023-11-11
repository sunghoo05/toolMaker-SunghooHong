package org.example;

public class Achievements
{
    public static String AchievementsLetterGrade;

    public static void AchievementsLetterGradeCalculator(int Achievements)
    {
        if (Achievements == 6) {
            AchievementsLetterGrade = "A";
            System.out.println("Your Achievements Letter Grade is: " + AchievementsLetterGrade);
        } else if (Achievements >= 4 && Achievements < 6) {
            AchievementsLetterGrade = "B";
            System.out.println("Your Achievements Letter Grade is: " + AchievementsLetterGrade);
        } else if (Achievements >= 2 && Achievements < 4) {
            AchievementsLetterGrade = "C";
            System.out.println("Your Achievements Letter Grade is: " + AchievementsLetterGrade);
        } else if (Achievements >= 0 && Achievements < 2) {
            AchievementsLetterGrade = "D";
            System.out.println("Your Achievements Letter Grade is: " + AchievementsLetterGrade);
        } else {
            AchievementsLetterGrade = "F";
            System.out.println("Your Achievements Letter Grade is: " + AchievementsLetterGrade);
        }
    }
}