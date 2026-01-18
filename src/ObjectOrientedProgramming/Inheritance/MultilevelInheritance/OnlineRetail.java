/*
 This program demonstrates multilevel inheritance in Java.
 It defines an Order base class, a ShippedOrder class that extends Order,
 and a DeliveredOrder class that extends ShippedOrder.
 The program takes user input, creates a DeliveredOrder object,
 and displays the final order status.
*/
package ObjectOrientedProgramming.Inheritance.MultilevelInheritance; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class Order { // Base class representing an order

    int orderId; // Stores order ID
    String orderDate; // Stores order date

    Order(int orderId, String orderDate) { // Constructor to initialize order details
        this.orderId = orderId; // Assigns order ID
        this.orderDate = orderDate; // Assigns order date
    }

    String getOrderStatus() { // Method to get order status
        return "Order Placed"; // Returns initial order status
    }
}

class ShippedOrder extends Order { // ShippedOrder inherits from Order

    String trackingNumber; // Stores tracking number

    ShippedOrder(int orderId, String orderDate, String trackingNumber) { // Constructor for ShippedOrder
        super(orderId, orderDate); // Calls parent class constructor
        this.trackingNumber = trackingNumber; // Assigns tracking number
    }

    String getOrderStatus() { // Overridden method to get shipped order status
        return "Order Shipped"; // Returns shipped status
    }
}

class DeliveredOrder extends ShippedOrder { // DeliveredOrder inherits from ShippedOrder

    String deliveryDate; // Stores delivery date

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) { // Constructor for DeliveredOrder
        super(orderId, orderDate, trackingNumber); // Calls parent class constructor
        this.deliveryDate = deliveryDate; // Assigns delivery date
    }

    String getOrderStatus() { // Overridden method to get delivered order status
        return "Order Delivered"; // Returns delivered status
    }
}

public class OnlineRetail { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter Order ID: "); // Prompts user to enter order ID
        int orderId = sc.nextInt(); // Reads order ID
        sc.nextLine(); // Consumes leftover newline

        System.out.print("Enter Order Date: "); // Prompts user to enter order date
        String orderDate = sc.nextLine(); // Reads order date

        System.out.print("Enter Tracking Number: "); // Prompts user to enter tracking number
        String trackingNumber = sc.nextLine(); // Reads tracking number

        System.out.print("Enter Delivery Date: "); // Prompts user to enter delivery date
        String deliveryDate = sc.nextLine(); // Reads delivery date

        DeliveredOrder order = new DeliveredOrder( // Creates DeliveredOrder object
                orderId, orderDate, trackingNumber, deliveryDate
        );

        System.out.println("Order Status: " + order.getOrderStatus()); // Displays final order status
    }
}
