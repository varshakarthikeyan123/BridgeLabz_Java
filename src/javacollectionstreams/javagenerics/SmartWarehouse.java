package javacollectionstreams.javagenerics;
import java.util.ArrayList;
import java.util.List;

/*
 * This program demonstrates a Smart Warehouse Management System using Java Generics.
 * A generic Storage class is used to store different types of warehouse items like
 * Electronics and Groceries safely.
 * Bounded generics ensure that only WarehouseItem types are allowed.
 * Wildcards are used to display items of any warehouse category.
 */

// Abstract parent class for all warehouse items
abstract class WarehouseItem {

    // Variable to store item name
    String name;

    // Constructor to initialize name
    WarehouseItem(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by child classes
    abstract void showDetails();
}

// Electronics item class
class Electronics extends WarehouseItem {

    // Constructor calling parent constructor
    Electronics(String name) {
        super(name);
    }

    // Method implementation
    public void showDetails() {
        System.out.println("Electronics Item: " + name);
    }
}

// Groceries item class
class Groceries extends WarehouseItem {

    // Constructor
    Groceries(String name) {
        super(name);
    }

    // Method implementation
    public void showDetails() {
        System.out.println("Grocery Item: " + name);
    }
}

// Generic storage class with bounded type
class Storage<T extends WarehouseItem> {

    // List to store items of type T
    List<T> items = new ArrayList<>();

    // Method to add item to storage
    void addItem(T item) {
        items.add(item);
    }

    // Method to return all items
    List<T> getItems() {
        return items;
    }
}

// Main class
public class SmartWarehouse {

    // Wildcard method to display any WarehouseItem type
    static void displayItems(List<? extends WarehouseItem> list) {

        // Loop through items
        for (WarehouseItem item : list) {
            item.showDetails();
        }
    }

    public static void main(String[] args) {

        // Creating storage for Electronics
        Storage<Electronics> electronicsStore = new Storage<>();

        // Adding electronics item
        electronicsStore.addItem(new Electronics("Laptop"));

        // Displaying electronics items
        displayItems(electronicsStore.getItems());
    }
}
