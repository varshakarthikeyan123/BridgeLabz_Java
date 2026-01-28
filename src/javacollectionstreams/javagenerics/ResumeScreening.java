package javacollectionstreams.javagenerics;

import java.util.ArrayList;
import java.util.List;

/*
 * This program simulates an AI-driven Resume Screening System.
 * Generic Resume class processes resumes of different job roles.
 * Wildcards allow screening resumes of multiple roles.
 */

// Abstract JobRole class
abstract class JobRole {

    // Abstract method for role details
    abstract void roleDetails();
}

// Software Engineer role
class SoftwareEngineer extends JobRole {

    // Role implementation
    public void roleDetails() {
        System.out.println("Software Engineer Resume");
    }
}

// Generic Resume class
class Resume<T extends JobRole> {

    // List to store resumes
    List<T> resumes = new ArrayList<>();

    // Method to add resume
    void addResume(T resume) {
        resumes.add(resume);
    }

    // Method to get resumes
    List<T> getResumes() {
        return resumes;
    }
}

public class ResumeScreening {

    // Wildcard method to screen resumes
    static void screenResumes(List<? extends JobRole> list) {

        // Loop through resumes
        for (JobRole role : list) {
            role.roleDetails();
        }
    }

    public static void main(String[] args) {

        // Creating resume list
        Resume<SoftwareEngineer> resumeList = new Resume<>();

        // Adding software engineer resume
        resumeList.addResume(new SoftwareEngineer());

        // Screening resumes
        screenResumes(resumeList.getResumes());
    }
}

