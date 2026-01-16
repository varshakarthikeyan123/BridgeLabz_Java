package ObjectOrientedProgramming.Inheritance.HierachicalMultilevelInheritance;
import java.util.Scanner;
interface Refuelable {
    void refuel();
}
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}
class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable {
    int tankCapacity;

    PetrolVehicle(String model, int maxSpeed, int tankCapacity) {
        super(model, maxSpeed);
        this.tankCapacity = tankCapacity;
    }

    public void refuel() {
        System.out.println(model + " is refueling. Tank capacity: " + tankCapacity + " liters");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Vehicle Type:");
        System.out.println("1. Electric Vehicle");
        System.out.println("2. Petrol Vehicle");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Max Speed: ");
        int maxSpeed = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Battery Capacity (kWh): ");
                int battery = sc.nextInt();
                ElectricVehicle ev = new ElectricVehicle(model, maxSpeed, battery);
                ev.charge();
                break;

            case 2:
                System.out.print("Enter Tank Capacity (liters): ");
                int tank = sc.nextInt();
                PetrolVehicle pv = new PetrolVehicle(model, maxSpeed, tank);
                pv.refuel();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

