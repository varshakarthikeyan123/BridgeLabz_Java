/*
 This program demonstrates single inheritance in Java.
 It defines a base Book class and an Author class that extends Book.
 The program takes user input for book and author details,
 creates an Author object, and displays the complete information.
*/
package ObjectOrientedProgramming.Inheritance.SingleInheritance; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class Book { // Base class representing a book

    String title; // Stores the book title
    int publicationYear; // Stores the year of publication

    Book(String title, int publicationYear) { // Constructor to initialize book details
        this.title = title; // Assigns book title
        this.publicationYear = publicationYear; // Assigns publication year
    }
}

class Author extends Book { // Author class inherits from Book

    String name; // Stores author name
    String bio; // Stores author biography

    Author(String title, int publicationYear, String name, String bio) { // Constructor for Author
        super(title, publicationYear); // Calls parent class constructor
        this.name = name; // Assigns author name
        this.bio = bio; // Assigns author bio
    }

    void displayInfo() { // Method to display book and author details
        System.out.println("Book Title: " + title); // Prints book title
        System.out.println("Publication Year: " + publicationYear); // Prints publication year
        System.out.println("Author Name: " + name); // Prints author name
        System.out.println("Author Bio: " + bio); // Prints author bio
    }
}

public class LibraryManagement { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter Book Title: "); // Prompts user to enter book title
        String title = sc.nextLine(); // Reads book title

        System.out.print("Enter Publication Year: "); // Prompts user to enter publication year
        int year = sc.nextInt(); // Reads publication year
        sc.nextLine(); // Consumes leftover newline

        System.out.print("Enter Author Name: "); // Prompts user to enter author name
        String name = sc.nextLine(); // Reads author name

        System.out.print("Enter Author Bio: "); // Prompts user to enter author bio
        String bio = sc.nextLine(); // Reads author bio

        Author author = new Author(title, year, name, bio); // Creates Author object
        author.displayInfo(); // Displays book and author details
    }
}
