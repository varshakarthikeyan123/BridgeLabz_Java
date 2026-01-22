/*
 This program demonstrates a simple movie ticket booking system using Java.
 It defines a MovieTicket class to store movie details and handle ticket
 booking. The BookingSystem class takes user input, books a ticket, and
 displays the ticket details.
*/
package CoreProgramming.ClassAndObjects.Level2; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to read user input

class MovieTicket { // Defines the MovieTicket class

    private String movieName; // Stores the movie name
    private int seatNumber; // Stores the seat number
    private double price; // Stores the ticket price

    public MovieTicket(String movieName) { // Constructor to initialize movie name
        this.movieName = movieName; // Assigns movie name to instance variable
    }

    public void bookTicket(int seatNumber, double price) { // Method to book a movie ticket
        this.seatNumber = seatNumber; // Assigns seat number
        this.price = price; // Assigns ticket price
        System.out.println("Ticket booked successfully!"); // Confirms ticket booking
    }

    public void displayTicketDetails() { // Method to display ticket details
        System.out.println("Movie Name : " + movieName); // Prints movie name
        System.out.println("Seat Number: " + seatNumber); // Prints seat number
        System.out.println("Price      : " + price); // Prints ticket price
    }
}

public class BookingSystem { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts
        Scanner input = new Scanner(System.in); // Creates Scanner object for user input

        System.out.print("Enter movie name: "); // Prompts user to enter movie name
        String movieName = input.nextLine(); // Reads movie name

        System.out.print("Enter seat number: "); // Prompts user to enter seat number
        int seatNumber = input.nextInt(); // Reads seat number

        System.out.print("Enter ticket price: "); // Prompts user to enter ticket price
        double price = input.nextDouble(); // Reads ticket price

        MovieTicket ticket = new MovieTicket(movieName); // Creates MovieTicket object
        ticket.bookTicket(seatNumber, price); // Books the ticket
        ticket.displayTicketDetails(); // Displays ticket details
    }
}
