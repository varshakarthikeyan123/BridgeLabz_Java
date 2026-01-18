/*
 This program demonstrates a copy constructor.
 The CopyConstructor class creates a new object
 by copying values from another object.
*/

package CoreProgramming.JavaConstructors.Level1;

public class CopyConstructor {

    // Variable to store name
    String name;

    // Variable to store age
    int age;

    // Parameterized constructor
    CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    CopyConstructor(CopyConstructor person) {
        this.name = person.name; // Copy name
        this.age = person.age;   // Copy age
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
