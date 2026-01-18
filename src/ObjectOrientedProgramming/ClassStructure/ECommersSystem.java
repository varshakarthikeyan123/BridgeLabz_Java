/*
 This program demonstrates an E-Commerce system using multiple classes.
 It shows the relationship between Customer, Order, and Product classes.
 A customer can place multiple orders, each order can have multiple products,
 and the system calculates and displays order details and total amount.
*/
package ClassSequenceDiagram; // Defines the package for this program

import java.util.ArrayList; // Imports ArrayList to store collections of objects
import java.util.Scanner; // Imports Scanner to take user input

class Product { // Defines the Product class

    private String name; // Stores product name
    private double price; // Stores product price

    public Product(String name, double price) { // Constructor to initialize product details
        this.name = name; // Assigns product name
        this.price = price; // Assigns product price
    }

    public String getName() { // Getter method to access product name
        return name; // Returns product name
    }

    public double getPrice() { // Getter method to access product price
        return price; // Returns product price
    }
}

class Order { // Defines the Order class

    private int orderId; // Stores order ID
    private ArrayList<Product> products; // Stores list of products in an order

    public Order(int orderId) { // Constructor to initialize order
        this.orderId = orderId; // Assigns order ID
        products = new ArrayList<>(); // Initializes product list
    }

    public void addProduct(Product product) { // Method to add product to order
        products.add(product); // Adds product to product list
    }

    public void showOrderDetails() { // Method to display order details
        double total = 0; // Initializes total amount
        System.out.println("\nOrder ID: " + orderId); // Prints order ID

        for (Product p : products) { // Loops through all products
            System.out.println(p.getName() + " - ₹" + p.getPrice()); // Prints product details
            total += p.getPrice(); // Adds product price to total
        }

        System.out.println("Total Amount: ₹" + total); // Prints total order amount
    }
}

class Customer { // Defines the Customer class

    private String name; // Stores customer name
    private ArrayList<Order> orders; // Stores list of customer orders

    public Customer(String name) { // Constructor to initialize customer
        this.name = name; // Assigns customer name
        orders = new ArrayList<>(); // Initializes order list
    }

    public void placeOrder(Order order) { // Method to place an order
        orders.add(order); // Adds order to order list
    }

    public void showOrders() { // Method to display all orders of customer
        System.out.println("\nOrders of " + name + ":"); // Prints customer name

        for (Order o : orders) { // Loops through all orders
            o.showOrderDetails(); // Displays each order details
        }
    }
}

public class ECommersSystem { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter Customer Name: "); // Prompts user for customer name
        Customer customer = new Customer(sc.nextLine()); // Creates Customer object

        System.out.print("Enter number of orders: "); // Prompts user for number of orders
        int o = sc.nextInt(); // Reads number of orders

        for (int i = 1; i <= o; i++) { // Loop for each order

            Order order = new Order(i); // Creates Order object with order ID

            System.out.print("\nEnter number of products for Order " + i + ": "); // Prompts product count
            int p = sc.nextInt(); // Reads number of products
            sc.nextLine(); // Consumes leftover newline

            for (int j = 1; j <= p; j++) { // Loop for each product
                System.out.println("\nEnter Product " + j + " details:"); // Displays product header

                System.out.print("Name: "); // Prompts product name
                String pname = sc.nextLine(); // Reads product name

                System.out.print("Price: "); // Prompts product price
                double price = sc.nextDouble(); // Reads product price
                sc.nextLine(); // Consumes leftover newline

                Product product = new Product(pname, price); // Creates Product object
                order.addProduct(product); // Adds product to order
            }

            customer.placeOrder(order); // Adds order to customer
        }

        customer.showOrders(); // Displays all orders of the customer
    }
}
