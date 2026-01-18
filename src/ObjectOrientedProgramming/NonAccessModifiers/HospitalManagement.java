/*
 This program demonstrates the use of static variables, static methods,
 final variables, arrays of objects, and the instanceof operator in Java.
 It defines a Patient class to store patient details and track the total
 number of patients admitted. The main class collects patient data and
 displays their details.
*/
package ObjectOrientedProgramming.Level1; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class Patient { // Defines the Patient class

    static String hospitalName = "City Care Hospital"; // Static variable shared by all patients
    static int totalPatients = 0; // Static variable to count total patients
    final int patientID; // Final variable for patient ID
    String name; // Stores patient name
    int age; // Stores patient age
    String ailment; // Stores patient ailment

    Patient(int patientID, String name, int age, String ailment) { // Constructor to initialize patient details
        this.patientID = patientID; // Assigns patient ID
        this.name = name; // Assigns patient name
        this.age = age; // Assigns patient age
        this.ailment = ailment; // Assigns patient ailment
        totalPatients++; // Increments total patient count
    }

    static void getTotalPatients() { // Static method to display total patients
        System.out.println("\nTotal Patients Admitted: " + totalPatients); // Prints total patients
    }

    static void displayPatient(Object obj) { // Static method to display patient details
        if (obj instanceof Patient) { // Checks if object is of type Patient
            Patient p = (Patient) obj; // Typecasts object to Patient
            System.out.println("Hospital Name: " + hospitalName); // Prints hospital name
            System.out.println("Patient ID: " + p.patientID); // Prints patient ID
            System.out.println("Name: " + p.name); // Prints patient name
            System.out.println("Age: " + p.age); // Prints patient age
            System.out.println("Ailment: " + p.ailment); // Prints patient ailment
        } else {
            System.out.println("Object is not an instance of Patient"); // Handles invalid object
        }
    }
}

public class HospitalManagement { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter number of patients: "); // Prompts user for number of patients
        int n = sc.nextInt(); // Reads number of patients

        Patient[] patients = new Patient[n]; // Creates array to store Patient objects

        for (int i = 0; i < n; i++) { // Loop to read patient details

            System.out.println("\nEnter details for Patient " + (i + 1)); // Displays patient number

            System.out.print("Enter Patient ID: "); // Prompts patient ID
            int id = sc.nextInt(); // Reads patient ID
            sc.nextLine(); // Consumes leftover newline

            System.out.print("Enter Name: "); // Prompts patient name
            String name = sc.nextLine(); // Reads patient name

            System.out.print("Enter Age: "); // Prompts patient age
            int age = sc.nextInt(); // Reads patient age
            sc.nextLine(); // Consumes leftover newline

            System.out.print("Enter Ailment: "); // Prompts patient ailment
            String ailment = sc.nextLine(); // Reads patient ailment

            patients[i] = new Patient(id, name, age, ailment); // Creates Patient object
        }

        Patient.getTotalPatients(); // Displays total number of patients admitted

        for (Patient p : patients) { // Loops through patient array
            Patient.displayPatient(p); // Displays each patient's details
        }
    }
}
