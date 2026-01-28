package javacollectionstreams.javagenerics;

import java.util.ArrayList;
import java.util.List;

/*
 * This program manages university courses using Java Generics.
 * Different evaluation types are handled using a generic Course class.
 * Wildcards allow evaluation of any course type.
 */

// Abstract course type
abstract class CourseType {

    // Abstract evaluation method
    abstract void evaluate();
}

// Exam-based course
class ExamCourse extends CourseType {

    // Evaluation implementation
    public void evaluate() {
        System.out.println("Evaluation through exams");
    }
}

// Generic Course class
class Course<T extends CourseType> {

    // List to store courses
    List<T> courses = new ArrayList<>();

    // Method to add course
    void addCourse(T course) {
        courses.add(course);
    }

    // Method to return courses
    List<T> getCourses() {
        return courses;
    }
}

public class UniversitySystem {

    // Wildcard method to evaluate any course type
    static void evaluateCourses(List<? extends CourseType> list) {

        // Loop through courses
        for (CourseType course : list) {
            course.evaluate();
        }
    }

    public static void main(String[] args) {

        // Creating exam course list
        Course<ExamCourse> examCourses = new Course<>();

        // Adding exam course
        examCourses.addCourse(new ExamCourse());

        // Evaluating courses
        evaluateCourses(examCourses.getCourses());
    }
}

