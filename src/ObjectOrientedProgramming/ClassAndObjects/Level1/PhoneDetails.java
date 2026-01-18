/*
 This program demonstrates the use of classes and objects in Java.
 It defines a MobilePhone class with private data members for brand,
 model, and price, along with constructors, getters, and setters.
 The PhoneDetails class collects user input, creates a MobilePhone
 object, and displays the phone details.
*/
package CoreProgramming.ClassAndObjects.Level1; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to read user input

class MobilePhone { // Defines the MobilePhone class

    private String brand; // Stores the mobile phone brand
    private String model; // Stores the mobile phone model
    private double price; // Stores the mobile phone price

    public MobilePhone(String brand, String model, double price) { // Constructor to initialize phone details
        this.brand = brand; // Assigns brand to the instance variable
        this.model = model; // Assigns model to the instance variable
        this.price = price; // Assigns price to the instance variable
    }

    public String getBrand() { // Getter method to access brand
        return brand; // Returns the phone brand
    }

    public String getModel() { // Getter method to access model
        return model; // Returns the phone model
    }

    public double getPrice() { // Getter method to access price
        return price; // Returns the phone price
    }

    public void setBrand(String brand) { // Setter method to update brand
        this.brand = brand; // Updates the phone brand
    }

    public void setModel(String model) { // Setter method to update model
        this.model = model; // Updates the phone model
    }

    public void setPrice(double price) { // Setter method to update price
        if (price > 0) { // Validates that price is positive
            this.price = price; // Updates the phone price
        }
    }
}

public class PhoneDetails { // Defines the main class

    public static void phoneDetails(MobilePhone mobilePhone) { // Method to display phone details
        System.out.println("Brand: " + mobilePhone.getBrand()); // Prints phone brand
        System.out.println("Model: " + mobilePhone.getModel()); // Prints phone model
        System.out.println("Price: " + mobilePhone.getPrice()); // Prints phone price
    }

    public static void main(String[] args) { // Main method where execution starts
        Scanner input = new Scanner(System.in); // Creates Scanner object for user input

        System.out.print("Enter your mobile phone brand: "); // Prompts user to enter phone brand
        String brand = input.nextLine(); // Reads phone brand

        System.out.print("Enter your mobile phone model: "); // Prompts user to enter phone model
        String model = input.nextLine(); // Reads phone model

        System.out.print("Enter your mobile phone price: "); // Prompts user to enter phone price
        double price = input.nextDouble(); // Reads phone price

        MobilePhone mobilePhone = new MobilePhone(brand, model, price); // Creates MobilePhone object
        phoneDetails(mobilePhone); // Calls method to display phone details

        input.close(); // Closes the Scanner object
    }
}
