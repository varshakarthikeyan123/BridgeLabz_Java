package ObjectOrientedProgramming.Encapsulation;
import java.util.Scanner;
// Creating an interface reservable
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
// Created an abstract class
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean available = true;
    private String borrowerName;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    protected void setAvailability(boolean status) {
        this.available = status;
    }

    protected void setBorrower(String name) {
        this.borrowerName = name;
    }
    public void getItemDetails() {
        System.out.println("\nItem ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
    public abstract int getLoanDuration();
}
// Extending a class
class Book extends LibraryItem implements Reservable {

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            setAvailability(false);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}
// Extending a class
class Magazine extends LibraryItem implements Reservable {

    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
    // Creating a method to check the item
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            setAvailability(false);
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}
// Extending a class
class DVD extends LibraryItem implements Reservable {

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 3;
    }

    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            setAvailability(false);
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}
public class LibrarySystem {

    // Polymorphic method
    public static void processItem(LibraryItem item, Scanner sc) {
        item.getItemDetails();
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

        if (item instanceof Reservable) {
            System.out.print("Do you want to reserve this item? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter Borrower Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                ((Reservable) item).reserveItem(name);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Getting user input
        System.out.println("Choose Item Type:");
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. DVD");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        LibraryItem item;
        // Using switch to get user choice
        switch (choice) {
            case 1:
                item = new Book(id, title, author);
                break;
            case 2:
                item = new Magazine(id, title, author);
                break;
            case 3:
                item = new DVD(id, title, author);
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }
        processItem(item, sc);
    }
}

