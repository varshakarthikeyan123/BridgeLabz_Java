/*
 This program demonstrates multilevel inheritance in Java.
 It defines a base Course class, an OnlineCourse class that extends Course,
 and a PaidOnlineCourse class that extends OnlineCourse.
 The program takes user input, creates a PaidOnlineCourse object,
 and displays course details along with the final fee after discount.
*/
package ObjectOrientedProgramming.inheritance.multilevelinheritance; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class Course { // Base class representing a course

    String courseName; // Stores the course name
    int duration; // Stores course duration in hours

    Course(String courseName, int duration) { // Constructor to initialize course details
        this.courseName = courseName; // Assigns course name
        this.duration = duration; // Assigns course duration
    }
}

class OnlineCourse extends Course { // OnlineCourse inherits from Course

    String platform; // Stores the learning platform name
    boolean isRecorded; // Indicates whether the course is recorded

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) { // Constructor for OnlineCourse
        super(courseName, duration); // Calls parent class constructor
        this.platform = platform; // Assigns platform name
        this.isRecorded = isRecorded; // Assigns recorded status
    }
}

class PaidOnlineCourse extends OnlineCourse { // PaidOnlineCourse inherits from OnlineCourse

    double fee; // Stores course fee
    double discount; // Stores discount percentage

    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, double fee, double discount) { // Constructor for PaidOnlineCourse
        super(courseName, duration, platform, isRecorded); // Calls OnlineCourse constructor
        this.fee = fee; // Assigns course fee
        this.discount = discount; // Assigns discount percentage
    }

    double getFinalFee() { // Method to calculate final fee after discount
        return fee - (fee * discount / 100); // Returns discounted fee
    }
}

public class EducationalCourse { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter Course Name: "); // Prompts user for course name
        String courseName = sc.nextLine(); // Reads course name

        System.out.print("Enter Course Duration (hours): "); // Prompts user for duration
        int duration = sc.nextInt(); // Reads course duration
        sc.nextLine(); // Consumes leftover newline

        System.out.print("Enter Platform: "); // Prompts user for platform
        String platform = sc.nextLine(); // Reads platform name

        System.out.print("Is the course recorded? (true/false): "); // Prompts recorded status
        boolean isRecorded = sc.nextBoolean(); // Reads recorded status

        System.out.print("Enter Course Fee: "); // Prompts user for course fee
        double fee = sc.nextDouble(); // Reads course fee

        System.out.print("Enter Discount (%): "); // Prompts discount percentage
        double discount = sc.nextDouble(); // Reads discount value

        PaidOnlineCourse course = new PaidOnlineCourse( // Creates PaidOnlineCourse object
                courseName, duration, platform, isRecorded, fee, discount
        );

        System.out.println("Course Name: " + course.courseName); // Displays course name
        System.out.println("Duration: " + course.duration + " hours"); // Displays duration
        System.out.println("Platform: " + course.platform); // Displays platform
        System.out.println("Recorded: " + course.isRecorded); // Displays recorded status
        System.out.println("Final Fee: ₹" + course.getFinalFee()); // Displays final fee after discount
    }
}
