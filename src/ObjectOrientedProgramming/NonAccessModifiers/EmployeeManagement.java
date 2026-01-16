package ObjectOrientedProgramming.Level1;
import  java.util.Scanner;
// Created a class called Employee
class Employee{
    static String companyName = "HiAnime";
    String name;
    final int id;
    String designation;
    private static int totalEmployees = 0;
    Employee(String name, String designation, int id){
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }
    // Created a method 
    static void displayTotalEmployees(){
        System.out.println("Total Employees: " +totalEmployees);
    }
    // Created a method to display methods
    public void display(){
        System.out.println("Company Name: " +companyName);
        System.out.println("Name: " +name);
        System.out.println("Designation: " +designation);
        System.out.println("ID: " +id);
    }
}
// Created a main class called employee management
public class EmployeeManagement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();
        Employee employee = new Employee(name, designation, 12345);
        // Calling method
        if (employee instanceof Employee){
            employee.display();
            Employee.displayTotalEmployees();
        }
    }
}
