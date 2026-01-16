package ClassSequenceDiagram;
import java.util.ArrayList;
import java.util.Scanner;
class Student {

    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public String getName() {
        return name;
    }
    public void showCourses() {
        System.out.println("Courses of " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
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
    public void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}
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

    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}
public class SchoolAdministration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter School Name: ");
        School school = new School(sc.nextLine());

        System.out.print("\nEnter number of students: ");
        int nStudents = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[nStudents];

        for (int i = 0; i < nStudents; i++) {
            System.out.print("Enter name of Student " + (i + 1) + ": ");
            students[i] = new Student(sc.nextLine());
            school.addStudent(students[i]);
        }

        System.out.print("\nEnter number of courses: ");
        int nCourses = sc.nextInt();
        sc.nextLine();

        Course[] courses = new Course[nCourses];

        for (int i = 0; i < nCourses; i++) {
            System.out.print("Enter name of Course " + (i + 1) + ": ");
            courses[i] = new Course(sc.nextLine());
        }
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
        school.showStudents();

        for (Student s : students) {
            s.showCourses();
        }

        for (Course c : courses) {
            c.showStudents();
        }
    }
}

