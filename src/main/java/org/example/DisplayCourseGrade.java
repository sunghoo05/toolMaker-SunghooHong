package org.example;

import static org.example.GradeDataGetter.*;

public class DisplayCourseGrade {
    public static void main(String[] args) {
        // Run GradeDataGetter Class
        GradeDataGetter student1 = new GradeDataGetter();
        student1.dataGetter();

        // Display Classroom Engagement Letter Grade by running ClassroomEngagement Class
        ClassroomEngagement classroomEngagementLetterGrade = new ClassroomEngagement();
        classroomEngagementLetterGrade.ClassroomEngagementLetterGradeCalculator(Engagement);

        // Display Assignments Letter Grade by running Assignment Class
        Assignment assignmentsLetterGrade = new Assignment();
        assignmentsLetterGrade.AssignmentsLetterGradeCalculator(Assignments);

        // Display Achievements Letter Grade by running Achievements Class
        Achievements achievementsLetterGrade = new Achievements();
        achievementsLetterGrade.AchievementsLetterGradeCalculator(Achievements);

        // Display Mid-Semester Self Assessment Letter Grade by running MidSemesterSelfAssessmentReport Class
        MidSemesterSelfAssessmentReport midSemesterSelfAssessmentLetterGrade = new MidSemesterSelfAssessmentReport();
        midSemesterSelfAssessmentLetterGrade.MidSemesterSelfAssessmentLetterGradeCalculator(MidTermSelfAssessment);

        // Display Projects Letter Grade by running Projects Class
        Projects projectsLetterGrade = new Projects();
        projectsLetterGrade.projectsLetterGradeCalculator(iteration1OfFirstProject, iteration2OfFirstProject, iteration1OfFinalProject, iteration2OfFinalProject, iteration3OfFinalProject);

        // Display Final Exam Letter Grade by running FinalExam Class
        FinalExam finalExamLetterGrade = new FinalExam();
        finalExamLetterGrade.finalExamLetterGradeCalculator(FinalExam);
    }
}