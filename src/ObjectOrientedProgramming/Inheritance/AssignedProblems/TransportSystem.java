package ObjectOrientedProgramming.Inheritance.AssignedProblems;
import java.util.Scanner;
class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed : " + maxSpeed + " km/h");
        System.out.println("Fuel Type : " + fuelType);
    }
}
class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    void displayInfo() {
        System.out.println("\nVehicle Type: Car");
        super.displayInfo();
        System.out.println("Seat Capacity : " + seatCapacity);
    }
}
class Truck extends Vehicle {
    double loadCapacity;

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("\nVehicle Type: Truck");
        super.displayInfo();
        System.out.println("Load Capacity : " + loadCapacity + " tons");
    }
}
class Motorcycle extends Vehicle {
    int engineCapacity;

    Motorcycle(int maxSpeed, String fuelType, int engineCapacity) {
        super(maxSpeed, fuelType);
        this.engineCapacity = engineCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("\nVehicle Type: Motorcycle");
        super.displayInfo();
        System.out.println("Engine Capacity : " + engineCapacity + " cc");
    }
}
public class TransportSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nSelect Vehicle Type:");
            System.out.println("1. Car");
            System.out.println("2. Truck");
            System.out.println("3. Motorcycle");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter Max Speed: ");
            int speed = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Fuel Type: ");
            String fuel = sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Seat Capacity: ");
                    int seats = sc.nextInt();
                    vehicles[i] = new Car(speed, fuel, seats);
                    break;

                case 2:
                    System.out.print("Enter Load Capacity (tons): ");
                    double load = sc.nextDouble();
                    vehicles[i] = new Truck(speed, fuel, load);
                    break;

                case 3:
                    System.out.print("Enter Engine Capacity (cc): ");
                    int cc = sc.nextInt();
                    vehicles[i] = new Motorcycle(speed, fuel, cc);
                    break;

                default:
                    System.out.println("Invalid choice");
                    i--;
            }
        }

        System.out.println("\n--- Vehicle Details ---");
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
