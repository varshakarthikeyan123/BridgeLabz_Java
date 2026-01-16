package CoreProgramming.ClassAndObjects.Level1;
import java.util.Scanner;
class Employee{
    String name;
    String id;
    double salary;
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setSalary(double salary){
        if (salary > 0) {     // validation
            this.salary = salary;
        }
    }
}
public class EmployeeDetails{
    public static void employeeDisplay(Employee employee){
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: " + employee.getSalary());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee name: ");
        String name = input.nextLine();
        System.out.print("Enter Employee ID: ");
        String id = input.nextLine();
        System.out.print("Enter Employee salary: ");
        double salary = input.nextDouble();
        Employee employee = new Employee(name,id,salary);
        employeeDisplay(employee);
    }
}
