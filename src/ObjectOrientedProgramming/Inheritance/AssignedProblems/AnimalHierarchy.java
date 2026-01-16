package ObjectOrientedProgramming.Inheritance.AssignedProblems;
import java.util.Scanner;
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }
}
class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println(name + " says: Meow Meow");
    }
}
class Bird extends Animal {

    Bird(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println(name + " says: Chirp Chirp");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Animal Type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Animal Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Animal Age: ");
        int age = sc.nextInt();

        Animal animal;

        switch (choice) {
            case 1:
                animal = new Dog(name, age);
                break;
            case 2:
                animal = new Cat(name, age);
                break;
            case 3:
                animal = new Bird(name, age);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        animal.makeSound();
    }
}
