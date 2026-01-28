package javacollectionstreams.javagenerics;

/*
 * This program represents a Dynamic Online Marketplace.
 * A generic Product class is used to store products of different categories.
 * A generic method applies discount without method overloading.
 */

// Generic Product class
class Product<T> {

    // Product name
    String name;

    // Product price
    double price;

    // Product category
    T category;

    // Constructor
    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Method to display product details
    void showProduct() {
        System.out.println(name + " Price: " + price);
    }
}

public class OnlineMarketplace {

    // Generic method to apply discount
    static <T> void applyDiscount(Product<T> product, double percent) {

        // Reducing price based on discount
        product.price -= product.price * percent / 100;
    }

    public static void main(String[] args) {

        // Creating product object
        Product<String> book = new Product<>("Java Book", 500, "Education");

        // Applying discount
        applyDiscount(book, 10);

        // Displaying product details
        book.showProduct();
    }
}

