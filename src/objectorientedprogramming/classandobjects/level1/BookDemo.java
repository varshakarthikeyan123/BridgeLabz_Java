/*
 This program demonstrates the use of classes and objects in Java.
 It defines a Book class with private data members, constructors,
 getter and setter methods, and a BookDemo class that creates a Book
 object using user input and displays its details.
*/
package CoreProgramming.ClassAndObjects.Level1; // Defines the package where this program belongs

import java.util.Scanner; // Imports Scanner class to take input from the user

class Book { // Defines the Book class

    private String title; // Stores the title of the book
    private String author; // Stores the author name of the book
    private double price; // Stores the price of the book

    public Book(String title, String author, double price) { // Constructor to initialize book details
        this.title = title; // Assigns title to the instance variable
        this.author = author; // Assigns author to the instance variable
        this.price = price; // Assigns price to the instance variable
    }

    public String getTitle() { // Getter method to access book title
        return this.title; // Returns the title
    }

    public String getAuthor() { // Getter method to access author name
        return this.author; // Returns the author name
    }

    public double getPrice() { // Getter method to access book price
        return this.price; // Returns the price
    }

    public void setTitle(String title) { // Setter method to update book title
        this.title = title; // Updates the title
    }

    public void setAuthor(String author) { // Setter method to update author name
        this.author = author; // Updates the author name
    }

    public void setPrice(double price) { // Setter method to update book price
        if (price > 0) { // Checks if the price is positive
            this.price = price; // Updates the price
        }
    }
}

public class BookDemo { // Defines the main demo class

    public void displayDetails(Book book) { // Method to display book details
        System.out.println("Title  : " + book.getTitle()); // Prints the book title
        System.out.println("Author : " + book.getAuthor()); // Prints the author name
        System.out.println("Price  : " + book.getPrice()); // Prints the book price
    }

    public static void main(String[] args) { // Main method where program execution starts
        Scanner input = new Scanner(System.in); // Creates Scanner object for user input

        System.out.print("Enter book title: "); // Prompts user to enter book title
        String title = input.nextLine(); // Reads the book title

        System.out.print("Enter author name: "); // Prompts user to enter author name
        String author = input.nextLine(); // Reads the author name

        System.out.print("Enter book price: "); // Prompts user to enter book price
        double price = input.nextDouble(); // Reads the book price

        Book book = new Book(title, author, price); // Creates a Book object using input values
        BookDemo demo = new BookDemo(); // Creates a BookDemo object
        demo.displayDetails(book); // Calls method to display book details
    }
}
