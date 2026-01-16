package CoreProgramming.ClassAndObjects.Level1;
import java.util.Scanner;

class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
}

public class PhoneDetails {

    public static void phoneDetails(MobilePhone mobilePhone) {
        System.out.println("Brand: " + mobilePhone.getBrand());
        System.out.println("Model: " + mobilePhone.getModel());
        System.out.println("Price: " + mobilePhone.getPrice());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your mobile phone brand: ");
        String brand = input.nextLine();

        System.out.print("Enter your mobile phone model: ");
        String model = input.nextLine();

        System.out.print("Enter your mobile phone price: ");
        double price = input.nextDouble();

        MobilePhone mobilePhone = new MobilePhone(brand, model, price);
        phoneDetails(mobilePhone);

        input.close();
    }
}
