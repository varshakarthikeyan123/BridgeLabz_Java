package ClassSequenceDiagram;
import java.util.ArrayList;
import java.util.Scanner;
// Created a class called Faculty
class Faculty {

    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    // Method to display specilization
    public void display() {
        System.out.println(name + " (" + specialization + ")");
    }

    public String getName() {
        return name;
    }
}
// Created a class called department
class Department {

    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
// Created a class called university
class University {

    private String universityName;

    private ArrayList<Department> departments;

    private ArrayList<Faculty> facultyMembers;

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        facultyMembers = new ArrayList<>();
    }
    // Method to add department
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }
    // Method to add faculty
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }
    // Method to display university details
    public void showUniversityData() {
        System.out.println("\nUniversity: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.getDeptName());
        }

        System.out.println("Faculty:");
        for (Faculty f : facultyMembers) {
            f.display();
        }
    }
    public void deleteUniversity() {
        departments.clear();
        System.out.println("\nUniversity deleted. All departments removed.");
    }
}
// Created a Main class called UniversityDetails
public class UniversityDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Getting user input for university names
        System.out.print("Enter University Name: ");
        University uni = new University(sc.nextLine());
        // Getting user input for number of departments
        System.out.print("\nEnter number of departments: ");
        int d = sc.nextInt();
        sc.nextLine();
        // Looping to get department details
        for (int i = 0; i < d; i++) {
            System.out.print("Enter Department " + (i + 1) + " name: ");
            uni.addDepartment(sc.nextLine());
        }
        // Getting input for number of faculites
        System.out.print("\nEnter number of faculty members: ");
        int f = sc.nextInt();
        sc.nextLine();
        // Creating a new object for faculty
        Faculty[] faculty = new Faculty[f];
        // Looping to get faculty information
        for (int i = 0; i < f; i++) {
            System.out.println("\nEnter Faculty " + (i + 1) + " details");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Specialization: ");
            String spec = sc.nextLine();

            faculty[i] = new Faculty(name, spec);
            uni.addFaculty(faculty[i]);
        }
        // Calling method
        uni.showUniversityData();
        // Getting user input for choice of deleation
        System.out.print("\nDo you want to delete the University? (yes/no): ");
        String choice = sc.nextLine();
        // Calling method
        if (choice.equalsIgnoreCase("yes")) {
            uni.deleteUniversity();
        }
        // Calling method
        System.out.println("\nFaculty still exist independently:");
        for (Faculty fac : faculty) {
            fac.display();
        }
    }
}

