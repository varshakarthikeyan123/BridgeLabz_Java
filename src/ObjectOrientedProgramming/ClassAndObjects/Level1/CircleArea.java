package CoreProgramming.ClassAndObjects.Level1;
import  java.util.Scanner;
class Circle{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        if (radius > 0){
            this.radius = radius;
        }
    }
}
public class CircleArea{
    public static double area(Circle circle){
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        return area;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of circle: " + area(circle));
    }
}
