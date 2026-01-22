/*
 This program demonstrates inheritance and method overriding in Java.
 It defines a base Animal class and derived classes Dog, Cat, and Bird.
 Based on user choice, the appropriate animal object is created and
 the overridden makeSound() method is called.
*/
package ObjectOrientedProgramming.inheritance.assignedproblems; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

// Created an Animal class
class Animal {

    String name; // Stores the animal name
    int age; // Stores the animal age

    Animal(String name, int age) { // Constructor to initialize animal details
        this.name = name; // Assigns name to instance variable
        this.age = age; // Assigns age to instance variable
    }

    void makeSound() { // Method to make sound (to be overridden)
        System.out.println("Animal makes a sound"); // Default animal sound
    }
}

// Extending the Dog class
class Dog extends Animal { // Dog inherits from Animal

    Dog(String name, int age) { // Constructor for Dog class
        super(name, age); // Calls parent class constructor
    }

    void makeSound() { // Overridden method for Dog sound
        System.out.println(name + " says: Woof Woof"); // Prints dog sound
    }
}

// Extending the Cat class
class Cat extends Animal { // Cat inherits from Animal

    Cat(String name, int age) { // Constructor for Cat class
        super(name, age); // Calls parent class constructor
    }

    void makeSound() { // Overridden method for Cat sound
        System.out.println(name + " says: Meow Meow"); // Prints cat sound
    }
}

// Extending the Bird class
class Bird extends Animal { // Bird inherits from Animal

    Bird(String name, int age) { // Constructor for Bird class
        super(name, age); // Calls parent class constructor
    }

    void makeSound() { // Overridden method for Bird sound
        System.out.println(name + " says: Chirp Chirp"); // Prints bird sound
    }
}

// Creating a main class named AnimalHierarchy
public class AnimalHierarchy { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        // Getting user input
        System.out.println("Choose Animal Type:"); // Displays menu
        System.out.println("1. Dog"); // Option for Dog
        System.out.println("2. Cat"); // Option for Cat
        System.out.println("3. Bird"); // Option for Bird
        System.out.print("Enter choice: "); // Prompts user choice
        int choice = sc.nextInt(); // Reads user choice
        sc.nextLine(); // Consumes leftover newline

        System.out.print("Enter Animal Name: "); // Prompts animal name
        String name = sc.nextLine(); // Reads animal name

        System.out.print("Enter Animal Age: "); // Prompts animal age
        int age = sc.nextInt(); // Reads animal age

        Animal animal; // Declares Animal reference variable

        // Using switch case to get choice
        switch (choice) {
            case 1:
                animal = new Dog(name, age); // Creates Dog object
                break;
            case 2:
                animal = new Cat(name, age); // Creates Cat object
                break;
            case 3:
                animal = new Bird(name, age); // Creates Bird object
                break;
            default:
                System.out.println("Invalid choice"); // Handles invalid choice
                sc.close(); // Closes Scanner
                return; // Exits program
        }

        // Calling method
        animal.makeSound(); // Calls overridden makeSound() using runtime polymorphism
    }
}
