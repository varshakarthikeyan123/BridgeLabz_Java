package CoreProgramming.StringFunction.Level1;
import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void generateException(String[] names) {
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException...");
        String name = names[names.length];
        System.out.println(name);
    }
    public static void handleException(String[] names) {
        System.out.println("\nHandling ArrayIndexOutOfBoundsException...");
        try {
            String name = names[names.length];
            System.out.println(name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException");
            System.out.println("Array index accessed is out of range");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = scan.nextInt();
        scan.nextLine();
        String[] names = new String[size];
        System.out.print("Enter the names: ");
        for (int i = 0; i < size; i++) {
            names[i] = scan.nextLine();
        }
        generateException(names);
        handleException(names);
    }
}

