package ObjectOrientedProgramming.Level1;
import java.util.Scanner;
// Created a book class
class Book{
    String title;
    String author;
    final int isbn;
    static String libraryName = "Owl House";

    static void displayLibraryName(){
        System.out.println("Library Name: " + libraryName);
    }
    Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    // Created a method
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
// Created a main class called Library
public class Library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter Book Title: ");
        String title = input.nextLine();
        System.out.print("Enter Book Author: ");
        String author = input.nextLine();
        System.out.print("Enter Book ISBN: ");
        int isbn = input.nextInt();
        Book book = new Book(title, author, isbn);
        // Calling method
        if (book instanceof Book) {
            Book.displayLibraryName();
            book.displayBookDetails();
        }
    }
}
