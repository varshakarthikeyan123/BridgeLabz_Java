/*
 This program attempts to calculate the volume of the Earth
 using its radius in kilometers and miles.
 It demonstrates the use of constants, variables,
 arithmetic operations, and output statements in Java.
 Note: The standard formula for the volume of a sphere is
 (4/3) × π × r³.
*/

package coreprogramming.programmingelements.Level1;

public class VolumeOfEarth {

    public static void main(String[] args) { // main method where program execution starts

        final double PI = 3.14; // constant value of pi
        double radiusKm = 6378; // radius of Earth in kilometers
        double radiusMi = 6378 * 1.6; // converts radius from kilometers to miles

        double volumeKm = (4 / 3) * PI * radiusKm; // calculates volume in cubic kilometers
        double volumeMi = (4 / 3) * PI * radiusMi; // calculates volume in cubic miles

        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm + " km^3"
                        + " and cubic miles is " + volumeMi + " mi^3."
        ); // displays volume in both units
    }
}
