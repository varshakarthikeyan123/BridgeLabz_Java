/*
 This program models a Hotel Booking system.
 It uses default, parameterized, and copy constructors
 to initialize booking details.
*/
package CoreProgramming.JavaConstructors.Level1;

public class Hotel {

    // Variable to store guest name
    String guestName;

    // Variable to store room type
    String roomType;

    // Variable to store number of nights
    int nights;

    // Default constructor
    Hotel() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    Hotel(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    Hotel(Hotel booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Method to display booking details
    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}
