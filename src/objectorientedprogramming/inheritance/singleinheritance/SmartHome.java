/*
 This program demonstrates single inheritance in Java.
 It defines a base Device class and a Thermostat class that extends Device.
 The program takes user input, creates a Thermostat object,
 and displays the current device status and temperature setting.
*/
package ObjectOrientedProgramming.inheritance.singleinheritance; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class Device { // Base class representing a device

    String deviceId; // Stores the device ID
    String status; // Stores the device status (ON/OFF)

    Device(String deviceId, String status) { // Constructor to initialize device details
        this.deviceId = deviceId; // Assigns device ID
        this.status = status; // Assigns device status
    }
}

class Thermostat extends Device { // Thermostat class inherits from Device

    double temperatureSetting; // Stores temperature setting in Celsius

    Thermostat(String deviceId, String status, double temperatureSetting) { // Constructor for Thermostat
        super(deviceId, status); // Calls parent class constructor
        this.temperatureSetting = temperatureSetting; // Assigns temperature setting
    }

    void displayStatus() { // Method to display thermostat status
        System.out.println("Device ID: " + deviceId); // Prints device ID
        System.out.println("Status: " + status); // Prints device status
        System.out.println("Temperature Setting: " + temperatureSetting + "°C"); // Prints temperature
    }
}

public class SmartHome { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter Device ID: "); // Prompts user to enter device ID
        String deviceId = sc.nextLine(); // Reads device ID

        System.out.print("Enter Device Status (ON/OFF): "); // Prompts user to enter status
        String status = sc.nextLine(); // Reads device status

        System.out.print("Enter Temperature Setting (°C): "); // Prompts user to enter temperature
        double temperature = sc.nextDouble(); // Reads temperature setting

        Thermostat thermostat = new Thermostat(deviceId, status, temperature); // Creates Thermostat object
        thermostat.displayStatus(); // Displays thermostat status
    }
}
