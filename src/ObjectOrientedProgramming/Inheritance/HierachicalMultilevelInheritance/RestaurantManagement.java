/*
 This program demonstrates hierarchical inheritance and interface implementation in Java.
 It uses a Worker interface, a base Person class, and two derived classes Chef and Waiter.
 Based on user input, either a Chef or Waiter object is created and their duties are performed.
*/
package ObjectOrientedProgramming.inheritance.hierachicalmultilevelinheritance; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

interface Worker { // Defines an interface for worker roles
    void performDuties(); // Abstract method to be implemented by classes
}

class Person { // Base class representing a person

    String name; // Stores the person's name
    int id; // Stores the person's ID

    Person(String name, int id) { // Constructor to initialize person details
        this.name = name; // Assigns name to instance variable
        this.id = id; // Assigns id to instance variable
    }
}

class Chef extends Person implements Worker { // Chef class extends Person and implements Worker

    String specialty; // Stores chef's specialty

    Chef(String name, int id, String specialty) { // Constructor to initialize chef details
        super(name, id); // Calls parent class constructor
        this.specialty = specialty; // Assigns specialty
    }

    public void performDuties() { // Implements performDuties method for Chef
        System.out.println(name + " (ID: " + id + ") is cooking " + specialty + " dishes."); // Displays chef duties
    }
}

class Waiter extends Person implements Worker { // Waiter class extends Person and implements Worker

    int tablesAssigned; // Stores number of tables assigned

    Waiter(String name, int id, int tablesAssigned) { // Constructor to initialize waiter details
        super(name, id); // Calls parent class constructor
        this.tablesAssigned = tablesAssigned; // Assigns number of tables
    }

    public void performDuties() { // Implements performDuties method for Waiter
        System.out.println(name + " (ID: " + id + ") is serving " + tablesAssigned + " tables."); // Displays waiter duties
    }
}

public class RestaurantManagement { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.println("Select Role to Add:"); // Displays role options
        System.out.println("1. Chef"); // Option for Chef
        System.out.println("2. Waiter"); // Option for Waiter
        System.out.print("Enter choice: "); // Prompts user choice
        int choice = sc.nextInt(); // Reads user choice
        sc.nextLine(); // Consumes leftover newline

        System.out.print("Enter Name: "); // Prompts for name
        String name = sc.nextLine(); // Reads name

        System.out.print("Enter ID: "); // Prompts for ID
        int id = sc.nextInt(); // Reads ID
        sc.nextLine(); // Consumes leftover newline

        Worker worker; // Declares Worker interface reference

        switch (choice) { // Switch case to create appropriate object
            case 1:
                System.out.print("Enter Specialty: "); // Prompts chef specialty
                String specialty = sc.nextLine(); // Reads specialty
                worker = new Chef(name, id, specialty); // Creates Chef object
                worker.performDuties(); // Calls performDuties using polymorphism
                break;

            case 2:
                System.out.print("Enter Number of Tables Assigned: "); // Prompts number of tables
                int tables = sc.nextInt(); // Reads number of tables
                worker = new Waiter(name, id, tables); // Creates Waiter object
                worker.performDuties(); // Calls performDuties using polymorphism
                break;

            default:
                System.out.println("Invalid choice."); // Handles invalid input
        }
    }
}
