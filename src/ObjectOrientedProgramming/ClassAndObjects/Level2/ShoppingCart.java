package CoreProgramming.ClassAndObjects.Level2;
import java.util.Scanner;
class CartItem {
    private String itemName;
    private double price;
    private int quantity;
    public void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Item added to cart successfully!");
    }
    public void removeItem() {
        itemName = null;
        price = 0;
        quantity = 0;
        System.out.println("Item removed from cart.");
    }
    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Total Cost: ₹" + totalCost);
    }
}

public class ShoppingCart{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CartItem cart = new CartItem();

        System.out.print("Enter item name: ");
        String name = input.nextLine();

        System.out.print("Enter item price: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        cart.addItem(name, price, quantity);
        cart.displayTotalCost();

        System.out.print("Do you want to remove the item? (yes/no): ");
        input.nextLine();
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            cart.removeItem();
            cart.displayTotalCost();
        }
    }
}
