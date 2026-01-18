/*
 This program defines a BookStore class.
 It demonstrates the use of default and parameterized constructors.
 The class stores book details such as title, author, and price
 and displays them using a display method.
*/
package CoreProgramming.JavaConstructors.Level1;

public class BookStore {
    // Variable to store book title
    String title;

    // Variable to store author name
    String author;

    // Variable to store book price
    double price;

    // Default constructor
    BookStore() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    BookStore(String title, String author, double price) {
        this.title = title;     // Assign title
        this.author = author;   // Assign author
        this.price = price;     // Assign price
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}
