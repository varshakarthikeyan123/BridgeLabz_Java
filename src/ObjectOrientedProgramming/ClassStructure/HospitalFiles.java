/*
 This program demonstrates a hospital management system using multiple classes.
 It shows the relationship between Hospital, Doctor, and Patient classes.
 Doctors can consult patients, patients can have multiple doctors,
 and the hospital maintains records of all doctors and patients.
*/
package ClassSequenceDiagram; // Defines the package for this program

import java.util.ArrayList; // Imports ArrayList to store dynamic lists
import java.util.Scanner; // Imports Scanner to take user input

class Patient { // Defines the Patient class

    private String name; // Stores patient name
    private ArrayList<Doctor> doctors; // Stores doctors consulted by the patient

    public Patient(String name) { // Constructor to initialize patient
        this.name = name; // Assigns patient name
        this.doctors = new ArrayList<>(); // Initializes doctor list
    }

    public String getName() { // Getter method to access patient name
        return name; // Returns patient name
    }

    public void addDoctor(Doctor doctor) { // Adds a doctor to patient's list
        if (!doctors.contains(doctor)) { // Checks to avoid duplicate doctors
            doctors.add(doctor); // Adds doctor to list
        }
    }

    public void showDoctors() { // Displays doctors consulted by patient
        System.out.println("\nDoctors consulted by " + name + ":"); // Prints header
        for (Doctor d : doctors) { // Loops through doctors
            System.out.println("- " + d.getName()); // Prints doctor name
        }
    }
}

class Doctor { // Defines the Doctor class

    private String name; // Stores doctor name
    private String specialization; // Stores doctor specialization
    private ArrayList<Patient> patients; // Stores patients consulted by doctor

    public Doctor(String name, String specialization) { // Constructor to initialize doctor
        this.name = name; // Assigns doctor name
        this.specialization = specialization; // Assigns specialization
        this.patients = new ArrayList<>(); // Initializes patient list
    }

    public String getName() { // Getter method to access doctor name
        return name; // Returns doctor name
    }

    public void consult(Patient patient) { // Method for doctor consultation
        System.out.println("\nDr. " + name + " (" + specialization +
                ") is consulting " + patient.getName()); // Displays consultation message

        patients.add(patient); // Adds patient to doctor's list
        patient.addDoctor(this); // Adds doctor to patient's list
    }

    public void showPatients() { // Displays patients consulted by doctor
        System.out.println("\nPatients of Dr. " + name + ":"); // Prints header
        for (Patient p : patients) { // Loops through patients
            System.out.println("- " + p.getName()); // Prints patient name
        }
    }
}

class Hospital { // Defines the Hospital class

    private String hospitalName; // Stores hospital name
    private ArrayList<Doctor> doctors; // Stores list of doctors
    private ArrayList<Patient> patients; // Stores list of patients

    public Hospital(String hospitalName) { // Constructor to initialize hospital
        this.hospitalName = hospitalName; // Assigns hospital name
        doctors = new ArrayList<>(); // Initializes doctor list
        patients = new ArrayList<>(); // Initializes patient list
    }

    public void addDoctor(Doctor doctor) { // Adds doctor to hospital
        doctors.add(doctor); // Adds doctor to list
    }

    public void addPatient(Patient patient) { // Adds patient to hospital
        patients.add(patient); // Adds patient to list
    }

    public void showHospitalData() { // Displays hospital data
        System.out.println("\nHospital: " + hospitalName); // Prints hospital name

        System.out.println("Doctors:"); // Prints doctors header
        for (Doctor d : doctors) { // Loops through doctors
            System.out.println("- " + d.getName()); // Prints doctor name
        }

        System.out.println("Patients:"); // Prints patients header
        for (Patient p : patients) { // Loops through patients
            System.out.println("- " + p.getName()); // Prints patient name
        }
    }
}

public class HospitalFiles { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter Hospital Name: "); // Prompts for hospital name
        Hospital hospital = new Hospital(sc.nextLine()); // Creates Hospital object

        System.out.print("\nEnter number of doctors: "); // Prompts number of doctors
        int d = sc.nextInt(); // Reads number of doctors
        sc.nextLine(); // Consumes leftover newline

        Doctor[] doctors = new Doctor[d]; // Creates array to store doctors

        for (int i = 0; i < d; i++) { // Loop to read doctor details
            System.out.println("\nEnter Doctor " + (i + 1) + " details:"); // Displays doctor header
            System.out.print("Name: "); // Prompts doctor name
            String name = sc.nextLine(); // Reads doctor name
            System.out.print("Specialization: "); // Prompts specialization
            String spec = sc.nextLine(); // Reads specialization

            doctors[i] = new Doctor(name, spec); // Creates Doctor object
            hospital.addDoctor(doctors[i]); // Adds doctor to hospital
        }

        System.out.print("\nEnter number of patients: "); // Prompts number of patients
        int p = sc.nextInt(); // Reads number of patients
        sc.nextLine(); // Consumes leftover newline

        Patient[] patients = new Patient[p]; // Creates array to store patients

        for (int i = 0; i < p; i++) { // Loop to read patient details
            System.out.print("Enter Patient " + (i + 1) + " name: "); // Prompts patient name
            patients[i] = new Patient(sc.nextLine()); // Creates Patient object
            hospital.addPatient(patients[i]); // Adds patient to hospital
        }

        for (int i = 0; i < d; i++) { // Loop for each doctor
            System.out.println("\nConsultations for Dr. " + doctors[i].getName()); // Displays doctor name
            for (int j = 0; j < p; j++) { // Loop for each patient
                System.out.print("Consult " + patients[j].getName() + "? (yes/no): "); // Asks consultation choice
                String choice = sc.nextLine(); // Reads user choice

                if (choice.equalsIgnoreCase("yes")) { // Checks if consultation is yes
                    doctors[i].consult(patients[j]); // Performs consultation
                }
            }
        }

        hospital.showHospitalData(); // Displays hospital summary

        for (Doctor doc : doctors) { // Loop through doctors
            doc.showPatients(); // Displays patients of each doctor
        }

        for (Patient pat : patients) { // Loop through patients
            pat.showDoctors(); // Displays doctors of each patient
        }
    }
}
