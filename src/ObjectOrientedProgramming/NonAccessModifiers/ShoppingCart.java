/*
 This program demonstrates the use of static variables, static methods,
 final variables, constructors, and the instanceof operator in Java.
 It defines a Product class that applies a shared discount to products,
 calculates the total cost after discount, and displays product details.
*/
package ObjectOrientedProgramming.Level1; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class Product { // Defines the Product class

    static double discount = 0.0; // Static variable to store discount percentage shared by all products

    final int productID; // Final variable for product ID

    String productName; // Stores product name
    double price; // Stores price per item
    int quantity; // Stores quantity purchased

    Product(int productID, String productName, double price, int quantity) { // Constructor to initialize product details
        this.productID = productID; // Assigns product ID
        this.productName = productName; // Assigns product name
        this.price = price; // Assigns product price
        this.quantity = quantity; // Assigns product quantity
    }

    static void updateDiscount(double newDiscount) { // Static method to update discount percentage
        if (newDiscount >= 0 && newDiscount <= 100) { // Validates discount range
            discount = newDiscount; // Updates discount
        } else {
            System.out.println("Invalid discount percentage"); // Displays error message
        }
    }

    static void processProduct(Object obj) { // Static method to process product details
        if (obj instanceof Product) { // Checks if object is of type Product
            Product p = (Product) obj; // Typecasts object to Product

            double discountedPrice = p.price - (p.price * discount / 100); // Calculates discounted price per item
            double totalCost = discountedPrice * p.quantity; // Calculates total cost after discount

            System.out.println("Product ID: " + p.productID); // Prints product ID
            System.out.println("Product Name: " + p.productName); // Prints product name
            System.out.println("Price per item: " + p.price); // Prints original price
            System.out.println("Quantity: " + p.quantity); // Prints quantity
            System.out.println("Discount: " + discount + "%"); // Prints discount applied
            System.out.println("Total Cost after discount: " + totalCost); // Prints final total cost
        } else {
            System.out.println("Object is not an instance of Product"); // Handles invalid object
        }
    }
}

public class ShoppingCart { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter discount percentage: "); // Prompts user for discount
        double dis = sc.nextDouble(); // Reads discount value
        Product.updateDiscount(dis); // Updates static discount value

        System.out.print("Enter Product ID: "); // Prompts user for product ID
        int id = sc.nextInt(); // Reads product ID
        sc.nextLine(); // Consumes leftover newline

        System.out.print("Enter Product Name: "); // Prompts user for product name
        String name = sc.nextLine(); // Reads product name

        System.out.print("Enter Price: "); // Prompts user for price
        double price = sc.nextDouble(); // Reads price

        System.out.print("Enter Quantity: "); // Prompts user for quantity
        int qty = sc.nextInt(); // Reads quantity

        Product p1 = new Product(id, name, price, qty); // Creates Product object

        Product.processProduct(p1); // Processes and displays product details
    }
}
