package ObjectOrientedProgramming.Inheritance.HierachicalMultilevelInheritance;
import java.util.Scanner;
interface Worker {
    void performDuties();
}
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }
    public void performDuties() {
        System.out.println(name + " (ID: " + id + ") is cooking " + specialty + " dishes.");
    }
}
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        System.out.println(name + " (ID: " + id + ") is serving " + tablesAssigned + " tables.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Role to Add:");
        System.out.println("1. Chef");
        System.out.println("2. Waiter");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Worker worker;

        switch (choice) {
            case 1:
                System.out.print("Enter Specialty: ");
                String specialty = sc.nextLine();
                worker = new Chef(name, id, specialty);
                worker.performDuties();
                break;

            case 2:
                System.out.print("Enter Number of Tables Assigned: ");
                int tables = sc.nextInt();
                worker = new Waiter(name, id, tables);
                worker.performDuties();
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
