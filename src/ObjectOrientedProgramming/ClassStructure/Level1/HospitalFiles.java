package ClassSequenceDiagram;
import java.util.ArrayList;
import java.util.Scanner;
class Patient {

    private String name;
    private ArrayList<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println("\nDoctors consulted by " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
    }
}
class Doctor {

    private String name;
    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void consult(Patient patient) {
        System.out.println("\nDr. " + name + " (" + specialization +
                ") is consulting " + patient.getName());

        patients.add(patient);
        patient.addDoctor(this);
    }

    public void showPatients() {
        System.out.println("\nPatients of Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
class Hospital {

    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

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
public class HospitalFiles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hospital Name: ");
        Hospital hospital = new Hospital(sc.nextLine());

        System.out.print("\nEnter number of doctors: ");
        int d = sc.nextInt();
        sc.nextLine();

        Doctor[] doctors = new Doctor[d];

        for (int i = 0; i < d; i++) {
            System.out.println("\nEnter Doctor " + (i + 1) + " details:");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Specialization: ");
            String spec = sc.nextLine();

            doctors[i] = new Doctor(name, spec);
            hospital.addDoctor(doctors[i]);
        }

        System.out.print("\nEnter number of patients: ");
        int p = sc.nextInt();
        sc.nextLine();

        Patient[] patients = new Patient[p];

        for (int i = 0; i < p; i++) {
            System.out.print("Enter Patient " + (i + 1) + " name: ");
            patients[i] = new Patient(sc.nextLine());
            hospital.addPatient(patients[i]);
        }

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
        hospital.showHospitalData();

        for (Doctor doc : doctors) {
            doc.showPatients();
        }

        for (Patient pat : patients) {
            pat.showDoctors();
        }
    }
}
