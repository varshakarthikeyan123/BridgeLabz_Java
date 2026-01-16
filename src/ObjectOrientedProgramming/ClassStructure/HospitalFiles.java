package ClassSequenceDiagram;
import java.util.ArrayList;
import java.util.Scanner;
// Create a parent class
class Patient {

    private String name;
    private ArrayList<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }
    // Getting name
    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }
    // Method to show doctor details
    public void showDoctors() {
        System.out.println("\nDoctors consulted by " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
    }
}
// Creating doctor class
class Doctor {

    private String name;
    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }
    // Getting name
    public String getName() {
        return name;
    }
    public void consult(Patient patient) {
        System.out.println("\nDr. " + name + " (" + specialization +
                ") is consulting " + patient.getName());

        patients.add(patient);
        patient.addDoctor(this);
    }
    // Creating a method for displaying patient details
    public void showPatients() {
        System.out.println("\nPatients of Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
// Creating a hospital class
class Hospital {

    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }
    // Method to add doctors
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    // Method to add patients
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    // Method to display hospital details
    public void showHospitalData() {
        System.out.println("\nHospital: " + hospitalName);

        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }

        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
// Creating a main class called HospitalFiles
public class HospitalFiles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Getting user input for hospital name
        System.out.print("Enter Hospital Name: ");
        Hospital hospital = new Hospital(sc.nextLine());
        // Getting user input for number of doctors
        System.out.print("\nEnter number of doctors: ");
        int d = sc.nextInt();
        sc.nextLine();
        // Creating an array for doctors
        Doctor[] doctors = new Doctor[d];
        // Loop for getting doctor details
        for (int i = 0; i < d; i++) {
            System.out.println("\nEnter Doctor " + (i + 1) + " details:");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Specialization: ");
            String spec = sc.nextLine();

            doctors[i] = new Doctor(name, spec);
            hospital.addDoctor(doctors[i]);
        }
        // Getting input for number of patients
        System.out.print("\nEnter number of patients: ");
        int p = sc.nextInt();
        sc.nextLine();
        // Creating an object for patients
        Patient[] patients = new Patient[p];
        // Lopp to get patient details
        for (int i = 0; i < p; i++) {
            System.out.print("Enter Patient " + (i + 1) + " name: ");
            patients[i] = new Patient(sc.nextLine());
            hospital.addPatient(patients[i]);
        }
        // Loop to get consulting details
        for (int i = 0; i < d; i++) {
            System.out.println("\nConsultations for Dr. " + doctors[i].getName());
            for (int j = 0; j < p; j++) {
                System.out.print("Consult " + patients[j].getName() + "? (yes/no): ");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("yes")) {
                    doctors[i].consult(patients[j]);
                }
            }
        }
        // Calling method
        hospital.showHospitalData();
        // Calling method
        for (Doctor doc : doctors) {
            doc.showPatients();
        }

        for (Patient pat : patients) {
            pat.showDoctors();
        }
    }
}
