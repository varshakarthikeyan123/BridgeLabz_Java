/*
 This program demonstrates a simple shopping cart system using Java.
 It defines a CartItem class to add, remove, and calculate the total
 cost of an item in the cart. The ShoppingCart class takes user input
 and performs cart operations.
*/
package CoreProgramming.ClassAndObjects.Level2; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class CartItem { // Defines the CartItem class

    private String itemName; // Stores the item name
    private double price; // Stores the item price
    private int quantity; // Stores the quantity of the item

    public void addItem(String itemName, double price, int quantity) { // Method to add item to cart
        this.itemName = itemName; // Assigns item name
        this.price = price; // Assigns item price
        this.quantity = quantity; // Assigns item quantity
        System.out.println("Item added to cart successfully!"); // Confirms item addition
    }

    public void removeItem() { // Method to remove item from cart
        itemName = null; // Clears item name
        price = 0; // Resets price to zero
        quantity = 0; // Resets quantity to zero
        System.out.println("Item removed from cart."); // Confirms item removal
    }

    public void displayTotalCost() { // Method to display total cost
        double totalCost = price * quantity; // Calculates total cost
        System.out.println("Total Cost: ₹" + totalCost); // Prints total cost
    }
}

public class ShoppingCart { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts
        Scanner input = new Scanner(System.in); // Creates Scanner object for user input
        CartItem cart = new CartItem(); // Creates CartItem object

        System.out.print("Enter item name: "); // Prompts user to enter item name
        String name = input.nextLine(); // Reads item name

        System.out.print("Enter item price: "); // Prompts user to enter item price
        double price = input.nextDouble(); // Reads item price

        System.out.print("Enter quantity: "); // Prompts user to enter quantity
        int quantity = input.nextInt(); // Reads item quantity

        cart.addItem(name, price, quantity); // Adds item to the cart
        cart.displayTotalCost(); // Displays total cost

        System.out.print("Do you want to remove the item? (yes/no): "); // Asks user for removal choice
        input.nextLine(); // Consumes leftover newline
        String choice = input.nextLine(); // Reads user choice

        if (choice.equalsIgnoreCase("yes")) { // Checks if user wants to remove item
            cart.removeItem(); // Removes item from cart
            cart.displayTotalCost(); // Displays total cost after removal
        }
    }
}
