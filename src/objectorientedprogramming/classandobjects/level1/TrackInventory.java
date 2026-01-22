/*
 This program demonstrates inventory tracking using classes and objects in Java.
 It defines an Item class to store item details such as item code, item name,
 and price. The TrackInventory class takes user input, displays item details,
 asks for quantity, and calculates the total price of the item.
*/
package CoreProgramming.ClassAndObjects.Level1; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class Item { // Defines the Item class

    int itemCode; // Stores the item code
    String itemName; // Stores the item name
    double price; // Stores the item price

    public Item(int itemCode, String itemName, double price) { // Constructor to initialize item details
        this.itemCode = itemCode; // Assigns item code to instance variable
        this.itemName = itemName; // Assigns item name to instance variable
        this.price = price; // Assigns price to instance variable
    }

    public int getItemCode() { // Getter method to access item code
        return this.itemCode; // Returns the item code
    }

    public String getItemName() { // Getter method to access item name
        return this.itemName; // Returns the item name
    }

    public double getPrice() { // Getter method to access item price
        return this.price; // Returns the item price
    }

    public int setItemCode(int itemCode) { // Method intended to set item code
        return this.itemCode; // Returns existing item code (no update performed)
    }

    public String setItemName(String itemName) { // Method intended to set item name
        return this.itemName; // Returns existing item name (no update performed)
    }

    public double setPrice(double price) { // Setter method to update item price
        if (price > 0) { // Validates that price is positive
            this.price = price; // Updates the item price
        }
        return price; // Returns the given price
    }
}

public class TrackInventory { // Defines the main class

    public static double itemPice(Item item) { // Method to calculate total price based on quantity
        System.out.print("Enter quantity: "); // Prompts user to enter quantity
        int quantity = new Scanner(System.in).nextInt(); // Reads quantity from user
        double totalPrice = item.getPrice() * quantity; // Calculates total price
        return totalPrice; // Returns the total price
    }

    public static void itemDisplay(Item item) { // Method to display item details
        System.out.println("Item Name: " + item.getItemName()); // Prints item name
        System.out.println("Item Code: " + item.getItemCode()); // Prints item code
        System.out.println("Item Price: " + item.getPrice()); // Prints item price
    }

    public static void main(String[] args) { // Main method where execution starts
        Scanner input = new Scanner(System.in); // Creates Scanner object for user input

        System.out.print("Enter item name: "); // Prompts user to enter item name
        String name = input.nextLine(); // Reads item name

        System.out.print("Enter item code: "); // Prompts user to enter item code
        int code = input.nextInt(); // Reads item code

        System.out.print("Enter item price: "); // Prompts user to enter item price
        double price = input.nextDouble(); // Reads item price

        Item item = new Item(code, name, price); // Creates Item object using input values
        itemDisplay(item); // Displays item details

        double result = itemPice(item); // Calculates total price for given quantity
        System.out.println("The total price of the item is: " + result); // Prints total price
    }
}
