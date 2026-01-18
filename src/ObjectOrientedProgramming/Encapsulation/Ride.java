/*
 This program demonstrates a Ride-Hailing Application.
 It uses abstraction, interfaces, encapsulation,
 and polymorphism to calculate ride fares dynamically
 for different vehicle types.
*/

// Interface for GPS-related functionality
interface GPS {

    String getCurrentLocation(); // Method to get the current vehicle location

    void updateLocation(String location); // Method to update the vehicle location
}

// Abstract class representing a generic ride vehicle
abstract class RideVehicle {

    protected int vehicleId; // Stores unique vehicle ID
    protected String driverName; // Stores driver name
    protected double ratePerKm; // Stores fare rate per kilometer

    RideVehicle(int id, String driver, double rate) { // Constructor to initialize ride vehicle details
        this.vehicleId = id; // Assigns vehicle ID
        this.driverName = driver; // Assigns driver name
        this.ratePerKm = rate; // Assigns rate per kilometer
    }

    abstract double calculateFare(double distance); // Abstract method to calculate fare based on distance
}

// Auto class representing an auto-rickshaw
class Auto extends RideVehicle implements GPS { // Inherits RideVehicle and implements GPS

    private String location; // Stores current location of the auto (encapsulated)

    Auto(int id, String driver, double rate) { // Constructor for Auto
        super(id, driver, rate); // Calls parent class constructor
    }

    double calculateFare(double distance) { // Implements fare calculation
        return distance * ratePerKm; // Calculates fare using distance and rate
    }

    public String getCurrentLocation() { // Implements GPS method to get location
        return location; // Returns current location
    }

    public void updateLocation(String location) { // Implements GPS method to update location
        this.location = location; // Updates the location value
    }
}
