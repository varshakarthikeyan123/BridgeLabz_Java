package ObjectOrientedProgramming.Encapsulation;
import java.util.Scanner;
// Creating an interface called medical record
interface MedicalRecord {
    void addRecord(String diagnosis, String history);
    void viewRecords();
}
// Creating an abstract class
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private String medicalHistory;
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected void setMedicalDetails(String diagnosis, String history) {
        this.diagnosis = diagnosis;
        this.medicalHistory = history;
    }
    // Creating a method to display details
    public void getPatientDetails() {
        System.out.println("\nPatient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    // Creating a protected method
    protected void showMedicalDetails() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Medical History: " + medicalHistory);
    }
    public abstract double calculateBill();
}
// Extending a class
class InPatient extends Patient implements MedicalRecord {
    private int numberOfDays;

    public InPatient(String id, String name, int age, int days) {
        super(id, name, age);
        this.numberOfDays = days;
    }

    public double calculateBill() {
        return (numberOfDays * 2000) + 500;
    }

    public void addRecord(String diagnosis, String history) {
        setMedicalDetails(diagnosis, history);
    }

    public void viewRecords() {
        System.out.println("In-Patient Medical Records:");
        showMedicalDetails();
    }
}
// Extending a class
class OutPatient extends Patient implements MedicalRecord {

    public OutPatient(String id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 500;
    }

    public void addRecord(String diagnosis, String history) {
        setMedicalDetails(diagnosis, history);
    }

    public void viewRecords() {
        System.out.println("Out-Patient Medical Records:");
        showMedicalDetails();
    }
}
// Creating a main class named Hospital Management
public class HospitalManagement {

    public static void processPatient(Patient patient, Scanner sc) {
        patient.getPatientDetails();
        // Getting user input
        System.out.print("Enter Diagnosis: ");
        sc.nextLine();
        String diagnosis = sc.nextLine();

        System.out.print("Enter Medical History: ");
        String history = sc.nextLine();
        // Looping to get patient details
        if (patient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) patient;
            record.addRecord(diagnosis, history);
            record.viewRecords();
        }

        System.out.println("Total Bill Amount: ₹" + patient.calculateBill());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Getting user input choice
        System.out.println("Choose Patient Type:");
        System.out.println("1. In-Patient");
        System.out.println("2. Out-Patient");
        int choice = sc.nextInt();

        System.out.print("Enter Patient ID: ");
        sc.nextLine();
        String id = sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        Patient patient;
        // Looping to diaplay the details of the choice
        if (choice == 1) {
            System.out.print("Enter Number of Days Admitted: ");
            int days = sc.nextInt();
            patient = new InPatient(id, name, age, days);
        } else {
            patient = new OutPatient(id, name, age);
        }
        processPatient(patient, sc);
    }
}
