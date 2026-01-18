/*
 This program represents a simple E-Commerce platform.
 It demonstrates abstraction using abstract classes,
 interfaces for tax calculation, encapsulation using
 private/protected variables, and polymorphism through
 method overriding for different product categories.
*/

// Interface defining tax-related behavior
interface Taxable {

    double calculateTax(); // Method to calculate tax on a product

    String getTaxDetails(); // Method to return tax description
}

// Abstract class representing a generic product
abstract class Product {

    private int productId; // Stores product ID (encapsulated)
    private String name; // Stores product name (encapsulated)
    protected double price; // Stores product price (accessible to subclasses)

    Product(int id, String name, double price) { // Constructor to initialize product details
        this.productId = id; // Assigns product ID
        this.name = name; // Assigns product name
        this.price = price; // Assigns product price
    }

    abstract double calculateDiscount(); // Abstract method to calculate discount

    double getFinalPrice() { // Method to calculate final price after discount
        return price - calculateDiscount(); // Returns price after subtracting discount
    }
}

// Electronics product class
class Electronics extends Product implements Taxable { // Inherits Product and implements Taxable

    Electronics(int id, String name, double price) { // Constructor for Electronics product
        super(id, name, price); // Calls parent class constructor
    }

    double calculateDiscount() { // Implements discount calculation
        return price * 0.10; // Applies 10% discount
    }

    public double calculateTax() { // Implements tax calculation
        return price * 0.18; // Applies 18% GST
    }

    public String getTaxDetails() { // Returns tax description
        return "18% GST applied"; // Displays tax information
    }
}
