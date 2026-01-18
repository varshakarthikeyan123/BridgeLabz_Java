/*
 This program demonstrates inheritance and method overriding in Java.
 It defines a base Vehicle class and derived classes Car, Truck, and Motorcycle.
 Based on user input, different vehicle objects are created and their
 details are displayed using polymorphism.
*/
package ObjectOrientedProgramming.Inheritance.AssignedProblems; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

// Created a Vehicle class
class Vehicle {

    int maxSpeed; // Stores maximum speed of the vehicle
    String fuelType; // Stores fuel type of the vehicle

    Vehicle(int maxSpeed, String fuelType) { // Constructor to initialize vehicle details
        this.maxSpeed = maxSpeed; // Assigns max speed
        this.fuelType = fuelType; // Assigns fuel type
    }

    // Method to display details
    void displayInfo() { // Displays basic vehicle information
        System.out.println("Max Speed : " + maxSpeed + " km/h"); // Prints max speed
        System.out.println("Fuel Type : " + fuelType); // Prints fuel type
    }
}

// Extended Car class
class Car extends Vehicle { // Car inherits from Vehicle

    int seatCapacity; // Stores seat capacity of the car

    Car(int maxSpeed, String fuelType, int seatCapacity) { // Constructor for Car
        super(maxSpeed, fuelType); // Calls parent class constructor
        this.seatCapacity = seatCapacity; // Assigns seat capacity
    }

    void displayInfo() { // Overridden method to display car details
        System.out.println("\nVehicle Type: Car"); // Prints vehicle type
        super.displayInfo(); // Calls base class displayInfo()
        System.out.println("Seat Capacity : " + seatCapacity); // Prints seat capacity
    }
}

// Extended Truck class
class Truck extends Vehicle { // Truck inherits from Vehicle

    double loadCapacity; // Stores load capacity in tons

    Truck(int maxSpeed, String fuelType, double loadCapacity) { // Constructor for Truck
        super(maxSpeed, fuelType); // Calls parent class constructor
        this.loadCapacity = loadCapacity; // Assigns load capacity
    }

    @Override
    void displayInfo() { // Overridden method to display truck details
        System.out.println("\nVehicle Type: Truck"); // Prints vehicle type
        super.displayInfo(); // Calls base class displayInfo()
        System.out.println("Load Capacity : " + loadCapacity + " tons"); // Prints load capacity
    }
}

// Extended Motorcycle class
class Motorcycle extends Vehicle { // Motorcycle inherits from Vehicle

    int engineCapacity; // Stores engine capacity in cc

    Motorcycle(int maxSpeed, String fuelType, int engineCapacity) { // Constructor for Motorcycle
        super(maxSpeed, fuelType); // Calls parent class constructor
        this.engineCapacity = engineCapacity; // Assigns engine capacity
    }

    @Override
    void displayInfo() { // Overridden method to display motorcycle details
        System.out.println("\nVehicle Type: Motorcycle"); // Prints vehicle type
        super.displayInfo(); // Calls base class displayInfo()
        System.out.println("Engine Capacity : " + engineCapacity + " cc"); // Prints engine capacity
    }
}

// Created a main class called TransportSystem
public class TransportSystem { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter number of vehicles: "); // Prompts number of vehicles
        int n = sc.nextInt(); // Reads number of vehicles

        Vehicle[] vehicles = new Vehicle[n]; // Creates array to store vehicle objects

        // Looping to get information
        for (int i = 0; i < n; i++) { // Loop for each vehicle
            System.out.println("\nSelect Vehicle Type:"); // Displays menu
            System.out.println("1. Car"); // Option for Car
            System.out.println("2. Truck"); // Option for Truck
            System.out.println("3. Motorcycle"); // Option for Motorcycle
            System.out.print("Enter choice: "); // Prompts user choice
            int choice = sc.nextInt(); // Reads vehicle choice

            System.out.print("Enter Max Speed: "); // Prompts max speed
            int speed = sc.nextInt(); // Reads max speed
            sc.nextLine(); // Consumes leftover newline

            System.out.print("Enter Fuel Type: "); // Prompts fuel type
            String fuel = sc.nextLine(); // Reads fuel type

            switch (choice) { // Switch to create specific vehicle
                case 1:
                    System.out.print("Enter Seat Capacity: "); // Prompts seat capacity
                    int seats = sc.nextInt(); // Reads seat capacity
                    vehicles[i] = new Car(speed, fuel, seats); // Creates Car object
                    break;

                case 2:
                    System.out.print("Enter Load Capacity (tons): "); // Prompts load capacity
                    double load = sc.nextDouble(); // Reads load capacity
                    vehicles[i] = new Truck(speed, fuel, load); // Creates Truck object
                    break;

                case 3:
                    System.out.print("Enter Engine Capacity (cc): "); // Prompts engine capacity
                    int cc = sc.nextInt(); // Reads engine capacity
                    vehicles[i] = new Motorcycle(speed, fuel, cc); // Creates Motorcycle object
                    break;

                default:
                    System.out.println("Invalid choice"); // Handles invalid input
                    i--; // Repeats the current iteration
            }
        }

        // Calling method
        System.out.println("\n--- Vehicle Details ---"); // Prints header
        for (Vehicle v : vehicles) { // Loop through vehicle array
            v.displayInfo(); // Calls overridden displayInfo() using polymorphism
        }
    }
}
