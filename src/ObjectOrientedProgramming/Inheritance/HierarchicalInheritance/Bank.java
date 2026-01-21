/*
 This program demonstrates hierarchical inheritance in Java.
 It defines a base BankAccount class and derived classes
 SavingsAccount, CheckingAccount, and FixedDepositAccount.
 Based on user choice, the appropriate account type is created
 and its account type is displayed.
*/
package ObjectOrientedProgramming.inheritance.hierarchicalinheritance; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class BankAccount { // Base class for all bank accounts

    String accountNumber; // Stores account number
    double balance; // Stores account balance

    BankAccount(String accountNumber, double balance) { // Constructor to initialize account details
        this.accountNumber = accountNumber; // Assigns account number
        this.balance = balance; // Assigns balance
    }
}

class SavingsAccount extends BankAccount { // SavingsAccount inherits from BankAccount

    double interestRate; // Stores interest rate

    SavingsAccount(String accountNumber, double balance, double interestRate) { // Constructor for savings account
        super(accountNumber, balance); // Calls parent class constructor
        this.interestRate = interestRate; // Assigns interest rate
    }

    void displayAccountType() { // Displays account type
        System.out.println("Account Type: Savings Account"); // Prints savings account type
    }
}

class CheckingAccount extends BankAccount { // CheckingAccount inherits from BankAccount

    double withdrawalLimit; // Stores withdrawal limit

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) { // Constructor for checking account
        super(accountNumber, balance); // Calls parent class constructor
        this.withdrawalLimit = withdrawalLimit; // Assigns withdrawal limit
    }

    void displayAccountType() { // Displays account type
        System.out.println("Account Type: Checking Account"); // Prints checking account type
    }
}

class FixedDepositAccount extends BankAccount { // FixedDepositAccount inherits from BankAccount

    int tenure; // Stores deposit tenure in months

    FixedDepositAccount(String accountNumber, double balance, int tenure) { // Constructor for fixed deposit account
        super(accountNumber, balance); // Calls parent class constructor
        this.tenure = tenure; // Assigns tenure
    }

    void displayAccountType() { // Displays account type
        System.out.println("Account Type: Fixed Deposit Account"); // Prints fixed deposit account type
    }
}

public class Bank { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter Account Number: "); // Prompts user for account number
        String accountNumber = sc.nextLine(); // Reads account number

        System.out.print("Enter Balance: "); // Prompts user for balance
        double balance = sc.nextDouble(); // Reads balance

        System.out.println("1. Savings Account"); // Option for savings account
        System.out.println("2. Checking Account"); // Option for checking account
        System.out.println("3. Fixed Deposit Account"); // Option for fixed deposit account
        System.out.print("Enter choice: "); // Prompts user choice
        int choice = sc.nextInt(); // Reads user choice

        switch (choice) { // Switch case to select account type
            case 1:
                System.out.print("Enter Interest Rate (%): "); // Prompts interest rate
                double interestRate = sc.nextDouble(); // Reads interest rate
                SavingsAccount savings = new SavingsAccount(accountNumber, balance, interestRate); // Creates SavingsAccount object
                savings.displayAccountType(); // Displays account type
                break;

            case 2:
                System.out.print("Enter Withdrawal Limit: "); // Prompts withdrawal limit
                double limit = sc.nextDouble(); // Reads withdrawal limit
                CheckingAccount checking = new CheckingAccount(accountNumber, balance, limit); // Creates CheckingAccount object
                checking.displayAccountType(); // Displays account type
                break;

            case 3:
                System.out.print("Enter Tenure (months): "); // Prompts tenure
                int tenure = sc.nextInt(); // Reads tenure
                FixedDepositAccount fd = new FixedDepositAccount(accountNumber, balance, tenure); // Creates FixedDepositAccount object
                fd.displayAccountType(); // Displays account type
                break;

            default:
                System.out.println("Invalid choice"); // Handles invalid choice
        }
    }
}
