package ObjectOrientedProgramming.Level1;
import java.util.Scanner;
// Created a student class
class Student {
    static String universityName = "Standford University";

    static int totalStudents = 0;

    final int rollNumber;

    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    // Method to display total students
    static void displayTotalStudents() {
        System.out.println("\nTotal Students Enrolled: " +totalStudents);
    }

    static void processStudent(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("University: " +universityName);
            System.out.println("Name: " +s.name);
            System.out.println("Roll Number: " +s.rollNumber);
            System.out.println("Grade: " +s.grade);
        } else {
            System.out.println("Object is not an instance of Student");
        }
    }
}
// Created a main class name university student
public class UniversityStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];
        // Looping to get information
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Student " + (i + 1));
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            System.out.print("Enter Grade (A/B/C): ");
            char grade = sc.next().charAt(0);

            students[i] = new Student(name, roll, grade);
        }
        // Calling method
        Student.displayTotalStudents();
        for (Student s : students) {
            Student.processStudent(s);
        }

    }
}


