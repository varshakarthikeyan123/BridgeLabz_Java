package ClassSequenceDiagram;
import java.util.ArrayList;
import java.util.Scanner;
// Creating a product class
class Product {
    
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // Getting name for the product class
    public String getName() {
        return name;
    }
    // Getting price for the product class
    public double getPrice() {
        return price;
    }
}
// Creating the order class
class Order {

    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    // Creating method to display order details
    public void showOrderDetails() {
        double total = 0;
        System.out.println("\nOrder ID: " + orderId);
        for (Product p : products) {
            System.out.println(p.getName() + " - ₹" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total Amount: ₹" + total);
    }
}
// Creating coustomer class
class Customer {

    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }
    public void placeOrder(Order order) {
        orders.add(order);
    }
    // Method to display orders
    public void showOrders() {
        System.out.println("\nOrders of " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}
// Creating a main class named ECommersSystem
public class ECommersSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Getting user input for name
        System.out.print("Enter Customer Name: ");
        Customer customer = new Customer(sc.nextLine());
        // Geting user input for number of orders
        System.out.print("Enter number of orders: ");
        int o = sc.nextInt();
        // Loop for number of products
        for (int i = 1; i <= o; i++) {

            Order order = new Order(i);

            System.out.print("\nEnter number of products for Order " + i + ": ");
            int p = sc.nextInt();
            sc.nextLine();
            // Loop for entering project details
            for (int j = 1; j <= p; j++) {
                System.out.println("\nEnter Product " + j + " details:");
                System.out.print("Name: ");
                String pname = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                // Creating object
                Product product = new Product(pname, price);
                order.addProduct(product);
            }
            // Calling method
            customer.placeOrder(order);
        }
        // Calling method
        customer.showOrders();
    }
}

