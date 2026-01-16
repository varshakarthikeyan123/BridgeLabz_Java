package ClassSequenceDiagram;
import java.util.ArrayList;
import java.util.Scanner;
class Faculty {

    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void display() {
        System.out.println(name + " (" + specialization + ")");
    }

    public String getName() {
        return name;
    }
}
class Department {

    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
class University {

    private String universityName;

    private ArrayList<Department> departments;

    private ArrayList<Faculty> facultyMembers;

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        facultyMembers = new ArrayList<>();
    }
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

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
public class UniversityDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter University Name: ");
        University uni = new University(sc.nextLine());
        System.out.print("\nEnter number of departments: ");
        int d = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < d; i++) {
            System.out.print("Enter Department " + (i + 1) + " name: ");
            uni.addDepartment(sc.nextLine());
        }
        System.out.print("\nEnter number of faculty members: ");
        int f = sc.nextInt();
        sc.nextLine();

        Faculty[] faculty = new Faculty[f];

        for (int i = 0; i < f; i++) {
            System.out.println("\nEnter Faculty " + (i + 1) + " details");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Specialization: ");
            String spec = sc.nextLine();

            faculty[i] = new Faculty(name, spec);
            uni.addFaculty(faculty[i]);
        }
        uni.showUniversityData();
        System.out.print("\nDo you want to delete the University? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            uni.deleteUniversity();
        }

        System.out.println("\nFaculty still exist independently:");
        for (Faculty fac : faculty) {
            fac.display();
        }
    }
}

