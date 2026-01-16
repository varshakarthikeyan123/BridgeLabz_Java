package ObjectOrientedProgramming.Inheritance.HierarchicalInheritance;
import java.util.Scanner;
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}
class FixedDepositAccount extends BankAccount {
    int tenure;

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        System.out.println("1. Savings Account");
        System.out.println("2. Checking Account");
        System.out.println("3. Fixed Deposit Account");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Interest Rate (%): ");
                double interestRate = sc.nextDouble();
                SavingsAccount savings = new SavingsAccount(accountNumber, balance, interestRate);
                savings.displayAccountType();
                break;

            case 2:
                System.out.print("Enter Withdrawal Limit: ");
                double limit = sc.nextDouble();
                CheckingAccount checking = new CheckingAccount(accountNumber, balance, limit);
                checking.displayAccountType();
                break;

            case 3:
                System.out.print("Enter Tenure (months): ");
                int tenure = sc.nextInt();
                FixedDepositAccount fd = new FixedDepositAccount(accountNumber, balance, tenure);
                fd.displayAccountType();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

}
