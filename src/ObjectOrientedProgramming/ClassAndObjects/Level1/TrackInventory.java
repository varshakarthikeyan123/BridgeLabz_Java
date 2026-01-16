package CoreProgramming.ClassAndObjects.Level1;
import java.util.Scanner;
class Item{
    int itemCode;
    String itemName;
    double price;
    public Item(int itemCode, String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public int getItemCode(){
        return this.itemCode;
    }
    public String getItemName(){
        return this.itemName;
    }
    public double getPrice(){
        return this.price;
    }
    public int setItemCode(int itemCode){
        return this.itemCode;
    }
    public String setItemName(String itemName){
        return this.itemName;
    }
    public double setPrice(double price){
        if ( price > 0 ){
            this.price = price;
        }
        return price;
    }
}
public class TrackInventory {
    public static double itemPice(Item item){
        System.out.print("Enter quantity: ");
        int quantity = new Scanner(System.in).nextInt();
        double totalPrice = item.getPrice()*quantity;
        return totalPrice;
    }
    public static void itemDisplay(Item item){
        System.out.println("Item Name: " + item.getItemName());
        System.out.println("Item Code: " + item.getItemCode());
        System.out.println("Item Price: " + item.getPrice());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String name = input.nextLine();
        System.out.print("Enter item code: ");
        int code = input.nextInt();
        System.out.print("Enter item price: ");
        double price = input.nextDouble();
        Item item = new Item(code, name, price);
        itemDisplay(item);
        double result = itemPice(item);
        System.out.println("The total price of the item is: " + result);
    }
}
