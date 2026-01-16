package ObjectOrientedProgramming.Inheritance.MultilevelInheritance;
import java.util.Scanner;
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call parent constructor
        this.trackingNumber = trackingNumber;
    }
    String getOrderStatus() {
        return "Order Shipped";
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order Delivered";
    }
}
public class OnlineRetail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order ID: ");
        int orderId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Order Date: ");
        String orderDate = sc.nextLine();

        System.out.print("Enter Tracking Number: ");
        String trackingNumber = sc.nextLine();

        System.out.print("Enter Delivery Date: ");
        String deliveryDate = sc.nextLine();

        DeliveredOrder order = new DeliveredOrder(
                orderId, orderDate, trackingNumber, deliveryDate
        );

        System.out.println("Order Status: " + order.getOrderStatus());

    }
}
