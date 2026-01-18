/*
 This program demonstrates a university management system.
 It shows how University, Department, and Faculty classes are related.
 A university can have multiple departments and faculty members,
 and faculty can exist independently even if the university is deleted.
*/
package ClassSequenceDiagram; // Defines the package for this program

import java.util.ArrayList; // Imports ArrayList to store dynamic lists
import java.util.Scanner; // Imports Scanner to take user input

class Faculty { // Defines the Faculty class

    private String name; // Stores faculty name
    private String specialization; // Stores faculty specialization

    public Faculty(String name, String specialization) { // Constructor to initialize faculty details
        this.name = name; // Assigns faculty name
        this.specialization = specialization; // Assigns specialization
    }

    public void display() { // Method to display faculty details
        System.out.println(name + " (" + specialization + ")"); // Prints name and specialization
    }

    public String getName() { // Getter method to access faculty name
        return name; // Returns faculty name
    }
}

class Department { // Defines the Department class

    private String deptName; // Stores department name

    public Department(String deptName) { // Constructor to initialize department
        this.deptName = deptName; // Assigns department name
    }

    public String getDeptName() { // Getter method to access department name
        return deptName; // Returns department name
    }
}

class University { // Defines the University class

    private String universityName; // Stores university name
    private ArrayList<Department> departments; // Stores list of departments
    private ArrayList<Faculty> facultyMembers; // Stores list of faculty members

    public University(String universityName) { // Constructor to initialize university
        this.universityName = universityName; // Assigns university name
        departments = new ArrayList<>(); // Initializes department list
        facultyMembers = new ArrayList<>(); // Initializes faculty list
    }

    public void addDepartment(String deptName) { // Method to add a department
        departments.add(new Department(deptName)); // Creates and adds department object
    }

    public void addFaculty(Faculty faculty) { // Method to add faculty member
        facultyMembers.add(faculty); // Adds faculty to list
    }

    public void showUniversityData() { // Method to display university details
        System.out.println("\nUniversity: " + universityName); // Prints university name

        System.out.println("Departments:"); // Prints departments header
        for (Department d : departments) { // Loops through departments
            System.out.println("- " + d.getDeptName()); // Prints department name
        }

        System.out.println("Faculty:"); // Prints faculty header
        for (Faculty f : facultyMembers) { // Loops through faculty members
            f.display(); // Displays faculty details
        }
    }

    public void deleteUniversity() { // Method to delete university data
        departments.clear(); // Removes all departments
        System.out.println("\nUniversity deleted. All departments removed."); // Prints delete message
    }
}

public class UniversityDetails { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter University Name: "); // Prompts for university name
        University uni = new University(sc.nextLine()); // Creates University object

        System.out.print("\nEnter number of departments: "); // Prompts number of departments
        int d = sc.nextInt(); // Reads number of departments
        sc.nextLine(); // Consumes leftover newline

        for (int i = 0; i < d; i++) { // Loop to read department details
            System.out.print("Enter Department " + (i + 1) + " name: "); // Prompts department name
            uni.addDepartment(sc.nextLine()); // Adds department to university
        }

        System.out.print("\nEnter number of faculty members: "); // Prompts number of faculty
        int f = sc.nextInt(); // Reads number of faculty members
        sc.nextLine(); // Consumes leftover newline

        Faculty[] faculty = new Faculty[f]; // Creates array to store faculty

        for (int i = 0; i < f; i++) { // Loop to read faculty details
            System.out.println("\nEnter Faculty " + (i + 1) + " details"); // Displays faculty header
            System.out.print("Name: "); // Prompts faculty name
            String name = sc.nextLine(); // Reads faculty name
            System.out.print("Specialization: "); // Prompts specialization
            String spec = sc.nextLine(); // Reads specialization

            faculty[i] = new Faculty(name, spec); // Creates Faculty object
            uni.addFaculty(faculty[i]); // Adds faculty to university
        }

        uni.showUniversityData(); // Displays university details

        System.out.print("\nDo you want to delete the University? (yes/no): "); // Asks delete confirmation
        String choice = sc.nextLine(); // Reads user choice

        if (choice.equalsIgnoreCase("yes")) { // Checks if user chose yes
            uni.deleteUniversity(); // Deletes university departments
        }

        System.out.println("\nFaculty still exist independently:"); // Prints message
        for (Faculty fac : faculty) { // Loops through faculty array
            fac.display(); // Displays faculty details
        }
    }
}
