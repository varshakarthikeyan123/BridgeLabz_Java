/*
 This program models a Library Management System.
 It handles different library items using polymorphism,
 abstraction, interfaces, and encapsulation.
*/

// Interface for reservable library items
interface Reservable {

    void reserveItem(); // Method to reserve an item

    boolean checkAvailability(); // Method to check item availability
}

// Abstract class representing a generic library item
abstract class LibraryItem {

    protected int itemId; // Stores unique item ID
    protected String title; // Stores item title
    protected String author; // Stores item author

    LibraryItem(int id, String title, String author) { // Constructor to initialize item details
        this.itemId = id; // Assigns item ID
        this.title = title; // Assigns item title
        this.author = author; // Assigns item author
    }

    abstract int getLoanDuration(); // Abstract method to return loan duration in days

    void getItemDetails() { // Method to display item details
        System.out.println(title + " by " + author); // Prints title and author
    }
}

// Book item class
class Book extends LibraryItem implements Reservable { // Book inherits LibraryItem and implements Reservable

    private boolean available = true; // Tracks availability status of the book

    Book(int id, String title, String author) { // Constructor for Book
        super(id, title, author); // Calls parent class constructor
    }

    int getLoanDuration() { // Implements loan duration for book
        return 14; // Books can be borrowed for 14 days
    }

    public void reserveItem() { // Implements reserveItem method
        available = false; // Marks book as reserved
    }

    public boolean checkAvailability() { // Implements availability check
        return available; // Returns current availability status
    }
}
