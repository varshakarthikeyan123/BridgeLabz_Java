package CoreProgramming.JavaConstructors.Level2;
import java.util.Scanner;
class Product {
    String productName;
    double price;
    static int totalProducts = 0;
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price       : " + price);
    }
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name1 = input.nextLine();
        System.out.print("Enter product price: ");
        double price1 = input.nextDouble();
        input.nextLine(); // clear buffer

        Product p1 = new Product(name1, price1);

        System.out.print("\nEnter product name: ");
        String name2 = input.nextLine();
        System.out.print("Enter product price: ");
        double price2 = input.nextDouble();

        Product p2 = new Product(name2, price2);

        System.out.println("\nProduct 1 Details:");
        p1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        p2.displayProductDetails();

        System.out.println();
        Product.displayTotalProducts();
    }
}

