package ObjectOrientedProgramming.Encapsulation;
import java.util.Scanner;

interface Insurable {
    double calculateInsurance(int days);
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }
    public abstract double calculateRentalCost(int days);
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Rental Rate per day: ₹" + rentalRate);
    }
}
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNo;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance(int days) {
        return calculateRentalCost(days) * 0.05;
    }

    public String getInsuranceDetails() {
        return "Car Insurance | Policy No: " + insurancePolicyNumber;
    }
}
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = policyNo;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance(int days) {
        return calculateRentalCost(days) * 0.02;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance | Policy No: " + insurancePolicyNumber;
    }
}
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNo;
    }

    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + (500 * days);
    }

    public double calculateInsurance(int days) {
        return calculateRentalCost(days) * 0.08;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance | Policy No: " + insurancePolicyNumber;
    }
}
public class TransportRent {
    public static void calculateTotal(Vehicle vehicle, int days) {
        double rentalCost = vehicle.calculateRentalCost(days);
        double insuranceCost = 0;
        vehicle.displayDetails();
        System.out.println("Rental Days: " + days);
        System.out.println("Rental Cost: ₹" + rentalCost);

        if (vehicle instanceof Insurable) {
            Insurable ins = (Insurable) vehicle;
            insuranceCost = ins.calculateInsurance(days);
            System.out.println(ins.getInsuranceDetails());
            System.out.println("Insurance Cost: ₹" + insuranceCost);
        }

        System.out.println("Total Cost: ₹" + (rentalCost + insuranceCost));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nChoose Vehicle Type:");
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Truck");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Vehicle Number: ");
            String number = sc.nextLine();

            System.out.print("Enter Rental Rate per day: ");
            double rate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Insurance Policy Number: ");
            String policy = sc.nextLine();

            switch (choice) {
                case 1:
                    vehicles[i] = new Car(number, rate, policy);
                    break;
                case 2:
                    vehicles[i] = new Bike(number, rate, policy);
                    break;
                case 3:
                    vehicles[i] = new Truck(number, rate, policy);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    i--;
            }
        }

        System.out.print("\nEnter number of rental days: ");
        int days = sc.nextInt();

        for (Vehicle v : vehicles) {
            calculateTotal(v, days);
        }
    }
}
