/*
 This program demonstrates a school administration system using Java.
 It shows the relationship between School, Student, and Course classes.
 Students can enroll in multiple courses, courses can have multiple students,
 and the school maintains a list of all students.
*/
package ClassSequenceDiagram; // Defines the package for this program

import java.util.ArrayList; // Imports ArrayList to store dynamic lists
import java.util.Scanner; // Imports Scanner to take user input

class Student { // Defines the Student class

    private String name; // Stores student name
    private ArrayList<Course> courses; // Stores courses enrolled by the student

    public Student(String name) { // Constructor to initialize student
        this.name = name; // Assigns student name
        this.courses = new ArrayList<>(); // Initializes course list
    }

    public void enrollCourse(Course course) { // Method to enroll student in a course
        courses.add(course); // Adds course to student's list
        course.addStudent(this); // Adds student to course's list
    }

    public String getName() { // Getter method to access student name
        return name; // Returns student name
    }

    public void showCourses() { // Displays courses enrolled by the student
        System.out.println("Courses of " + name + ":"); // Prints header
        for (Course c : courses) { // Loops through courses
            System.out.println("- " + c.getCourseName()); // Prints course name
        }
    }
}

class Course { // Defines the Course class

    private String courseName; // Stores course name
    private ArrayList<Student> students; // Stores students enrolled in the course

    public Course(String courseName) { // Constructor to initialize course
        this.courseName = courseName; // Assigns course name
        this.students = new ArrayList<>(); // Initializes student list
    }

    public void addStudent(Student student) { // Adds a student to the course
        students.add(student); // Adds student to list
    }

    public String getCourseName() { // Getter method to access course name
        return courseName; // Returns course name
    }

    public void showStudents() { // Displays students enrolled in the course
        System.out.println("Students in " + courseName + ":"); // Prints header
        for (Student s : students) { // Loops through students
            System.out.println("- " + s.getName()); // Prints student name
        }
    }
}

class School { // Defines the School class

    private String schoolName; // Stores school name
    private ArrayList<Student> students; // Stores students in the school

    public School(String schoolName) { // Constructor to initialize school
        this.schoolName = schoolName; // Assigns school name
        this.students = new ArrayList<>(); // Initializes student list
    }

    public void addStudent(Student student) { // Adds student to the school
        students.add(student); // Adds student to list
    }

    public void showStudents() { // Displays all students in the school
        System.out.println("Students in " + schoolName + ":"); // Prints header
        for (Student s : students) { // Loops through students
            System.out.println("- " + s.getName()); // Prints student name
        }
    }
}

public class SchoolAdministration { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter School Name: "); // Prompts user for school name
        School school = new School(sc.nextLine()); // Creates School object

        System.out.print("\nEnter number of students: "); // Prompts number of students
        int nStudents = sc.nextInt(); // Reads number of students
        sc.nextLine(); // Consumes leftover newline

        Student[] students = new Student[nStudents]; // Creates array to store students

        for (int i = 0; i < nStudents; i++) { // Loop to read student details
            System.out.print("Enter name of Student " + (i + 1) + ": "); // Prompts student name
            students[i] = new Student(sc.nextLine()); // Creates Student object
            school.addStudent(students[i]); // Adds student to school
        }

        System.out.print("\nEnter number of courses: "); // Prompts number of courses
        int nCourses = sc.nextInt(); // Reads number of courses
        sc.nextLine(); // Consumes leftover newline

        Course[] courses = new Course[nCourses]; // Creates array to store courses

        for (int i = 0; i < nCourses; i++) { // Loop to read course details
            System.out.print("Enter name of Course " + (i + 1) + ": "); // Prompts course name
            courses[i] = new Course(sc.nextLine()); // Creates Course object
        }

        for (int i = 0; i < nStudents; i++) { // Loop for each student
            System.out.println("\nEnroll courses for " + students[i].getName()); // Displays student name
            for (int j = 0; j < nCourses; j++) { // Loop through courses
                System.out.print("Enroll in " + courses[j].getCourseName() + "? (yes/no): "); // Asks enrollment choice
                String choice = sc.nextLine(); // Reads user choice

                if (choice.equalsIgnoreCase("yes")) { // Checks if choice is yes
                    students[i].enrollCourse(courses[j]); // Enrolls student in course
                }
            }
        }

        school.showStudents(); // Displays all students in the school

        for (Student s : students) { // Loop through students
            s.showCourses(); // Displays courses of each student
        }

        for (Course c : courses) { // Loop through courses
            c.showStudents(); // Displays students in each course
        }
    }
}
