package ObjectOrientedProgramming.Encapsulation;
import java.util.Scanner;
// Creating an interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
// Creating an abstract class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double calculateDiscount();
    // Creating a method to display details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}
// Extending a class
class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "18% GST applied";
    }
}
// Expalding a class
class Clothing extends Product implements Taxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public String getTaxDetails() {
        return "5% GST applied";
    }
}
// Expanding a class
class Groceries extends Product {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
// Creating a Main class named ECommerce title
public class ECommerce {
    // Creating a method for printing final price
    public static void printFinalPrice(Product product) {
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
            System.out.println(((Taxable) product).getTaxDetails());
        } else {
            System.out.println("No tax applied");
        }

        double finalPrice = product.getPrice() + tax - discount;

        product.displayDetails();
        System.out.println("Discount: ₹" + discount);
        System.out.println("Tax: ₹" + tax);
        System.out.println("Final Price: ₹" + finalPrice);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Getting input
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        // Created a new object for products
        Product[] products = new Product[n];
        // Loop to get product choice
        for (int i = 0; i < n; i++) {
            System.out.println("\nChoose Product Type:");
            System.out.println("1. Electronics");
            System.out.println("2. Clothing");
            System.out.println("3. Groceries");
            int choice = sc.nextInt();
            
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            // Switch case to get choice
            switch (choice) {
                case 1:
                    products[i] = new Electronics(id, name, price);
                    break;
                case 2:
                    products[i] = new Clothing(id, name, price);
                    break;
                case 3:
                    products[i] = new Groceries(id, name, price);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    i--;
            }
        }
        // Calling the method
        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}

