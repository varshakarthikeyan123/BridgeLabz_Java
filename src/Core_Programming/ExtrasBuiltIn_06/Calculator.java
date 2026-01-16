package CoreProgramming.ExtrasBuiltIn;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float firstNumber = input.nextFloat();
        System.out.print("Enter second number: ");
        float secondNumber = input.nextFloat();
        System.out.print("Enter operation: ");
        String op =  input.next();
        switch(op){
            case "+":
                float add = firstNumber + secondNumber;
                System.out.println(add);
                break;
                case "-":
                    float sub = firstNumber - secondNumber;
                    System.out.println(sub);
                    break;
                    case "*":
                        float multiplication = firstNumber * secondNumber;
                        System.out.println(multiplication);
                        break;
                        case "/":
                            float div = firstNumber / secondNumber;
                            System.out.println(div);
                            break;
                            default:
                                System.out.println("Invalid operation");
        }
    }
}
