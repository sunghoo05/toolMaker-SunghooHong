package org.example;

import static org.example.Achievements.AchievementsLetterGrade;
import static org.example.Assignment.AssignmentsLetterGrade;
import static org.example.ClassroomEngagement.ClassroomEngagementLetterGrade;
import static org.example.FinalExam.finalExamLetterGrade;
import static org.example.GradeDataGetter.*;
import static org.example.MidSemesterSelfAssessmentReport.MidSemesterSelfAssessmentLetterGrade;
import static org.example.Projects.projectsLetterGrade;

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
        Projects ProjectsLetterGrade = new Projects();
        ProjectsLetterGrade.projectsLetterGradeCalculator(iteration1OfFirstProject, iteration2OfFirstProject, iteration1OfFinalProject, iteration2OfFinalProject, iteration3OfFinalProject);

        // Display Final Exam Letter Grade by running FinalExam Class
        FinalExam FinalExamLetterGrade = new FinalExam();
        FinalExamLetterGrade.finalExamLetterGradeCalculator(FinalExam);

        // Display the Final Course Letter Grade by running CourseGradeCalculator Class
        CourseGradeCalculator courseGrade = new CourseGradeCalculator();
        courseGrade.CourseLetterGradeCalculator(ClassroomEngagementLetterGrade, AssignmentsLetterGrade, AchievementsLetterGrade, MidSemesterSelfAssessmentLetterGrade, projectsLetterGrade, finalExamLetterGrade);
    }
}