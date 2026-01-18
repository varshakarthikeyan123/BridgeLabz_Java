/*
 This program simulates a Car Rental System.
 It initializes rental details using constructors
 and calculates the total rental cost.
*/
package CoreProgramming.JavaConstructors.Level1;

public class RentalSystem {

    // Variable to store customer name
    String customerName;

    // Variable to store car model
    String carModel;

    // Variable to store rental days
    int rentalDays;

    // Cost per day
    double costPerDay = 1500;

    // Default constructor
    RentalSystem() {
        customerName = "Customer";
        carModel = "Basic";
        rentalDays = 1;
    }

    // Parameterized constructor
    RentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }
}
