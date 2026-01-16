package CoreProgramming.ClassAndObjects.Level1;
import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public double getPrice() {
        return this.price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
public class BookDemo {
    public void displayDetails(Book book) {
        System.out.println("Title  : " + book.getTitle());
        System.out.println("Author : " + book.getAuthor());
        System.out.println("Price  : " + book.getPrice());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = input.nextLine();
        System.out.print("Enter author name: ");
        String author = input.nextLine();
        System.out.print("Enter book price: ");
        double price = input.nextDouble();
        Book book = new Book(title, author, price);
        BookDemo demo = new BookDemo();
        demo.displayDetails(book);
    }
}



