/*
 This program represents a Library Book System.
 It stores book details and tracks availability.
 The borrowBook method checks availability before borrowing.
*/

package CoreProgramming.JavaConstructors.Level1;

public class BookSystem {
    // Variable to store book title
    String title;

    // Variable to store author name
    String author;

    // Variable to store price
    double price;

    // Variable to track availability
    boolean available;

    // Parameterized constructor
    BookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // Book is available initially
    }

    // Method to borrow the book
    void borrowBook() {
        if (available) {
            available = false; // Mark book as borrowed
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }
}
