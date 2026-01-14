package Core_Programming.Programming_Elements_01.Level_02;

import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        String fromCity = input.next();
        String viaCity = input.next();
        String toCity = input.next();

        double fromToVia = input.nextDouble();
        double viaToFinalCity = input.nextDouble();
        double timeTaken = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;

        System.out.println("The distance travelled by " + name +
                " from " + fromCity + " via " + viaCity +
                " to " + toCity + " is " + totalDistance +
                " miles and time taken is " + timeTaken + " hours");
    }
}

