/*
 This program demonstrates an Online Food Delivery System.
 It handles veg and non-veg food using abstraction and polymorphism.
*/

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {

    protected String itemName;
    protected double price;
    protected int quantity;

    FoodItem(String name, double price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }

    abstract double calculateTotalPrice();

    void getItemDetails() {
        System.out.println(itemName + " x " + quantity);
    }
}

// Non-veg item
class NonVegItem extends FoodItem implements Discountable {

    NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    double calculateTotalPrice() {
        return (price * quantity) + 50;
    }

    public double applyDiscount() {
        return 30;
    }

    public String getDiscountDetails() {
        return "₹30 discount applied";
    }
}
