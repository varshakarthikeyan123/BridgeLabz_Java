package ObjectOrientedProgramming.Inheritance.HierarchicalInheritance;
import java.util.Scanner;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("\nSelect Role:");
        System.out.println("1. Teacher");
        System.out.println("2. Student");
        System.out.println("3. Staff");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Subject: ");
                String subject = sc.nextLine();
                Teacher teacher = new Teacher(name, age, subject);
                teacher.displayRole();
                break;

            case 2:
                System.out.print("Enter Grade: ");
                String grade = sc.nextLine();
                Student student = new Student(name, age, grade);
                student.displayRole();
                break;

            case 3:
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                Staff staff = new Staff(name, age, dept);
                staff.displayRole();
                break;

            default:
                System.out.println("Invalid choice");
        }

    }
}
