/* This program creates three classes: Student, Course, and School.
   Each class takes the required input.
   The main class, SchoolAdministration, creates the necessary objects
   to access each class and display the results. */

package ClassSequenceDiagram;
import java.util.ArrayList;
import java.util.Scanner;
// Created student class
class Student {

    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    // Method to get courses
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public String getName() {
        return name;
    }
    // Method to display courses
    public void showCourses() {
        System.out.println("Courses of " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
// Create a class named course
class Course {

    private String courseName;
    private ArrayList<Student> students;
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }
    // Created a method to display enrolled students
    public void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}
// Create a class names school
class School {

    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    // Method to display students
    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}
// Created a Main class names School Administration
public class SchoolAdministration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Getting input for name of school
        System.out.print("Enter School Name: ");
        School school = new School(sc.nextLine());
        // Getting input for number of students
        System.out.print("\nEnter number of students: ");
        int nStudents = sc.nextInt();
        sc.nextLine();
        // Creating a new object caleed students
        Student[] students = new Student[nStudents];
        // Looping to get student information 
        for (int i = 0; i < nStudents; i++) {
            System.out.print("Enter name of Student " + (i + 1) + ": ");
            students[i] = new Student(sc.nextLine());
            school.addStudent(students[i]);
        }
        // Getting input for number of courses
        System.out.print("\nEnter number of courses: ");
        int nCourses = sc.nextInt();
        sc.nextLine();
        // Creating a new object for courses
        Course[] courses = new Course[nCourses];
        // Looping to get course information
        for (int i = 0; i < nCourses; i++) {
            System.out.print("Enter name of Course " + (i + 1) + ": ");
            courses[i] = new Course(sc.nextLine());
        }
        // Looping to get student information
        for (int i = 0; i < nStudents; i++) {
            System.out.println("\nEnroll courses for " + students[i].getName());
            for (int j = 0; j < nCourses; j++) {
                System.out.print("Enroll in " + courses[j].getCourseName() + "? (yes/no): ");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("yes")) {
                    students[i].enrollCourse(courses[j]);
                }
            }
        }
        // Calling method
        school.showStudents();
        // Calling method
        for (Student s : students) {
            s.showCourses();
        }
        // Calling method
        for (Course c : courses) {
            c.showStudents();
        }
    }
}

