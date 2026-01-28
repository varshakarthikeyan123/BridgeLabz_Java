package javacollectionstreams.collections;

import java.util.*;

/*
 * This program simulates a hospital triage system.
 * Patients with higher severity are treated first using PriorityQueue.
 */

class Patient {

    // Patient name
    String name;

    // Severity level
    int severity;

    // Constructor
    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriage {

    public static void main(String[] args) {

        // PriorityQueue based on severity
        PriorityQueue<Patient> queue = new PriorityQueue<>(
                (a, b) -> b.severity - a.severity
        );

        // Adding patients
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // Treating patients
        while (!queue.isEmpty()) {

            // Removing highest priority patient
            Patient p = queue.poll();
            System.out.println("Treating: " + p.name);
        }
    }
}

