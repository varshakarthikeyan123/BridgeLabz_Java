package ObjectOrientedProgramming.Encapsulation;
import java.util.Scanner;
import java.util.*;
// Creating an interface
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}
// Creating an abstract class
abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;
    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("\nEmployee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : ₹" + calculateSalary());
    }
}
// Extending a class
class FullTimeEmployee extends Employee implements Department {

    private String department;

    FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
// Extending a class
class PartTimeEmployee extends Employee implements Department {

    private int hoursWorked;
    private double hourlyRate;
    private String department;

    PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
// Creating a main class called Employee System
public class EmployeeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        // Created a new object
        List<Employee> employees = new ArrayList<>();
        // Looping to get choice
        for (int i = 0; i < n; i++) {

            System.out.println("\nSelect Employee Type:");
            System.out.println("1. Full-Time Employee");
            System.out.println("2. Part-Time Employee");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            Employee emp;
            // Looping to provide value to the choice
            if (choice == 1) {
                System.out.print("Enter Base Salary: ");
                double salary = sc.nextDouble();

                FullTimeEmployee ft = new FullTimeEmployee(id, name, salary);
                ft.assignDepartment(dept);
                emp = ft;

            } else {
                System.out.print("Enter Hourly Rate: ");
                double rate = sc.nextDouble();

                System.out.print("Enter Hours Worked: ");
                int hours = sc.nextInt();

                PartTimeEmployee pt = new PartTimeEmployee(id, name, rate, hours);
                pt.assignDepartment(dept);
                emp = pt;
            }

            employees.add(emp);
        }
        // Calling the method
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Department : " +
                    ((Department) e).getDepartmentDetails());
        }
    }
}
