package ObjectOrientedProgramming.Encapsulation;
import java.util.Scanner;
interface LocationTracker {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    private String currentLocation = "Not Updated";

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    protected void setLocation(String location) {
        this.currentLocation = location;
    }

    protected String getLocation() {
        return currentLocation;
    }

    public void getVehicleDetails() {
        System.out.println("\nVehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    public abstract double calculateFare(double distance);
}
class SedanRide extends RideVehicle implements LocationTracker {

    public SedanRide(String id, String driver) {
        super(id, driver, 15);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    public String getCurrentLocation() {
        return getLocation();
    }

    public void updateLocation(String location) {
        setLocation(location);
    }
}
class TwoWheelerRide extends RideVehicle implements LocationTracker {

    public TwoWheelerRide(String id, String driver) {
        super(id, driver, 8);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    public String getCurrentLocation() {
        return getLocation();
    }

    public void updateLocation(String location) {
        setLocation(location);
    }
}
class AutoRickshawRide extends RideVehicle implements LocationTracker {

    public AutoRickshawRide(String id, String driver) {
        super(id, driver, 12);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    public String getCurrentLocation() {
        return getLocation();
    }

    public void updateLocation(String location) {
        setLocation(location);
    }
}

public class RideApplication {

    // Polymorphism demonstration
    public static void processRide(RideVehicle vehicle, double distance, Scanner sc) {
        System.out.print("Enter Current Location: ");
        sc.nextLine();
        String location = sc.nextLine();

        if (vehicle instanceof LocationTracker) {
            LocationTracker tracker = (LocationTracker) vehicle;
            tracker.updateLocation(location);
        }

        vehicle.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + vehicle.calculateFare(distance));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Vehicle Type:");
        System.out.println("1. Sedan");
        System.out.println("2. Two Wheeler");
        System.out.println("3. Auto Rickshaw");
        int choice = sc.nextInt();

        System.out.print("Enter Vehicle ID: ");
        sc.nextLine();
        String id = sc.nextLine();

        System.out.print("Enter Driver Name: ");
        String driver = sc.nextLine();

        System.out.print("Enter Ride Distance (km): ");
        double distance = sc.nextDouble();

        RideVehicle vehicle;

        switch (choice) {
            case 1:
                vehicle = new SedanRide(id, driver);
                break;
            case 2:
                vehicle = new TwoWheelerRide(id, driver);
                break;
            case 3:
                vehicle = new AutoRickshawRide(id, driver);
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }
        processRide(vehicle, distance, sc);
    }
}
