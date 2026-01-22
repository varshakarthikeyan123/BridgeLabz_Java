/*
 This program demonstrates an Employee Management System.
 It uses abstraction through the Employee class, inheritance via
 FullTimeEmployee and PartTimeEmployee, encapsulation using private
 variables with getters/setters, and polymorphism using Employee reference.
*/


package ObjectOrientedProgramming.encapsulation;


// Interface for department details
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract Employee class
abstract class Employee {

    // Encapsulated fields
    private int employeeId;
    private String name;
    protected double baseSalary;

    // Constructor
    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter methods
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }

    // Abstract salary calculation
    abstract double calculateSalary();

    // Concrete method
    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Full-time employee class
class FullTimeEmployee extends Employee implements Department {

    private String department;

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    double calculateSalary() {
        return baseSalary;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee implements Department {

    private int hoursWorked;
    private String department;

    PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return baseSalary * hoursWorked;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

