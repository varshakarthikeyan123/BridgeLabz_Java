/*
 This program demonstrates the use of static variables, static methods,
 final variables, constructors, and the instanceof operator in Java.
 It defines a Book class with shared library information and displays
 book details entered by the user.
*/
package ObjectOrientedProgramming.Level1; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class Book { // Defines the Book class

    String title; // Stores the book title
    String author; // Stores the book author
    final int isbn; // Final variable for ISBN number
    static String libraryName = "Owl House"; // Static variable shared by all books

    static void displayLibraryName() { // Static method to display library name
        System.out.println("Library Name: " + libraryName); // Prints library name
    }

    Book(String title, String author, int isbn) { // Constructor to initialize book details
        this.title = title; // Assigns book title
        this.author = author; // Assigns book author
        this.isbn = isbn; // Assigns ISBN number
    }

    void displayBookDetails() { // Method to display book details
        System.out.println("Title: " + title); // Prints book title
        System.out.println("Author: " + author); // Prints book author
        System.out.println("ISBN: " + isbn); // Prints ISBN number
    }
}

public class Library { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter Book Title: "); // Prompts user to enter book title
        String title = input.nextLine(); // Reads book title

        System.out.print("Enter Book Author: "); // Prompts user to enter book author
        String author = input.nextLine(); // Reads book author

        System.out.print("Enter Book ISBN: "); // Prompts user to enter ISBN
        int isbn = input.nextInt(); // Reads ISBN number

        Book book = new Book(title, author, isbn); // Creates Book object

        if (book instanceof Book) { // Checks if object is an instance of Book
            Book.displayLibraryName(); // Displays library name
            book.displayBookDetails(); // Displays book details
        }
    }
}
