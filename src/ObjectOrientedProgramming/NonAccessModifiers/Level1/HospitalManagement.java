package ObjectOrientedProgramming.Level1;
import java.util.Scanner;
class Patient {
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    static void getTotalPatients() {
        System.out.println("\nTotal Patients Admitted: " + totalPatients);
    }
    static void displayPatient(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
        } else {
            System.out.println("Object is not an instance of Patient");
        }
    }
}
public class HospitalManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        Patient[] patients = new Patient[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Patient " + (i + 1));

            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Ailment: ");
            String ailment = sc.nextLine();

            patients[i] = new Patient(id, name, age, ailment);
        }
        Patient.getTotalPatients();
        for (Patient p : patients) {
            Patient.displayPatient(p);
        }
    }
}

