/*
 This program represents a Hospital Patient Management System.
 It demonstrates abstraction, interfaces, encapsulation,
 and polymorphism to manage patient details and billing.
*/

// Interface for handling medical records
interface MedicalRecord {

    void addRecord(String record); // Method to add a medical record

    void viewRecords(); // Method to view stored medical records
}

// Abstract class representing a generic patient
abstract class Patient {

    protected int patientId; // Stores patient ID (accessible to subclasses)
    protected String name; // Stores patient name
    protected int age; // Stores patient age

    Patient(int id, String name, int age) { // Constructor to initialize patient details
        this.patientId = id; // Assigns patient ID
        this.name = name; // Assigns patient name
        this.age = age; // Assigns patient age
    }

    abstract double calculateBill(); // Abstract method to calculate patient bill

    void getPatientDetails() { // Method to display basic patient details
        System.out.println(name + " (" + age + ")"); // Prints name and age
    }
}

// In-Patient class
class InPatient extends Patient implements MedicalRecord { // Inherits Patient and implements MedicalRecord

    private String record; // Stores medical record details (encapsulated)

    InPatient(int id, String name, int age) { // Constructor for InPatient
        super(id, name, age); // Calls parent class constructor
    }

    double calculateBill() { // Implements bill calculation
        return 5000; // Returns fixed bill amount for in-patient
    }

    public void addRecord(String record) { // Implements addRecord method
        this.record = record; // Saves medical record
    }

    public void viewRecords() { // Implements viewRecords method
        System.out.println(record); // Displays medical record
    }
}
