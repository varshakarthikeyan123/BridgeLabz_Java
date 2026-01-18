/*
 This program models a Vehicle Rental System.
 It uses abstraction for vehicles and interfaces for insurance.
*/

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {

    protected String vehicleNumber;
    protected double rentalRate;

    Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    abstract double calculateRentalCost(int days);
}

// Car class
class Car extends Vehicle implements Insurable {

    Car(String number, double rate) {
        super(number, rate);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car insurance applied";
    }
}
