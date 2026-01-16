package ObjectOrientedProgramming.Level1;
import  java.util.Scanner;
// Created a class called product
class Product {

    static double discount = 0.0;

    final int productID;

    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
        } else {
            System.out.println("Invalid discount percentage");
        }
    }
    // Created a method to get details
    static void processProduct(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;

            double discountedPrice = p.price - (p.price * discount / 100);
            double totalCost = discountedPrice * p.quantity;

            System.out.println("Product ID: " +p.productID);
            System.out.println("Product Name: " +p.productName);
            System.out.println("Price per item: " +p.price);
            System.out.println("Quantity: " +p.quantity);
            System.out.println("Discount: " +discount + "%");
            System.out.println("Total Cost after discount: " + totalCost);
        } else {
            System.out.println("Object is not an instance of Product");
        }
    }
}
// Created a main class called shopping cart
public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter discount percentage: ");
        double dis = sc.nextDouble();
        Product.updateDiscount(dis);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product p1 = new Product(id, name, price, qty);
        // Calling method
        Product.processProduct(p1);

    }
}


