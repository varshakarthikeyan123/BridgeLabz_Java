/*
 This program collects travel details from the user
 such as name, cities travelled, distance between cities,
 and total travel time.
 It then calculates the total distance travelled
 and the average speed of the journey.
 The program demonstrates string input, numeric input,
 arithmetic calculations, and output in Java.
*/

package coreprogramming.programmingelements.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class TravelDetails {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading user input

        System.out.print("Enter your name: "); // prompts user to enter name
        String name = input.nextLine(); // reads user's name

        System.out.print("Enter from city: "); // prompts user to enter starting city
        String fromCity = input.nextLine(); // reads starting city

        System.out.print("Enter via city: "); // prompts user to enter intermediate city
        String viaCity = input.nextLine(); // reads via city

        System.out.print("Enter to city: "); // prompts user to enter destination city
        String toCity = input.nextLine(); // reads destination city

        System.out.print(
                "Enter distance from " + fromCity + " to " + viaCity + " (in miles): "
        ); // prompts user for distance between first two cities
        float fromToVia = input.nextFloat(); // reads distance from start city to via city

        System.out.print(
                "Enter distance from " + viaCity + " to " + toCity + " (in miles): "
        ); // prompts user for distance between via city and destination
        float viaToFinalCity = input.nextFloat(); // reads distance from via city to final city

        System.out.print("Enter total time taken (in hours): "); // prompts user to enter travel time
        float time = input.nextFloat(); // reads total travel time

        float totalDistance = fromToVia + viaToFinalCity; // calculates total distance travelled
        float speed = totalDistance / time; // calculates average speed

        System.out.println("Total Distance: " + totalDistance + " miles"); // displays total distance
        System.out.println("Average Speed: " + speed + " miles/hour"); // displays average speed

        System.out.println(
                "The results of the calculations are "
                        + totalDistance + " miles and "
                        + speed + " miles/hour."
        ); // displays final summary
    }
}
