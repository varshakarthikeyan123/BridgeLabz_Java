/*
 This program simulates a simple ATM system using classes and objects in Java.
 It defines a BankAccount class to store account details and an ATM class
 that allows deposit, withdrawal, and balance display using user input.
*/
package CoreProgramming.ClassAndObjects.Level2; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to read user input

class BankAccount { // Defines the BankAccount class

    private String accountHolder; // Stores the name of the account holder
    private String accountNumber; // Stores the bank account number
    private double balance; // Stores the current account balance

    public BankAccount(String accountHolder, String accountNumber, double balance) { // Constructor to initialize account details
        this.accountHolder = accountHolder; // Assigns account holder name
        this.accountNumber = accountNumber; // Assigns account number
        this.balance = balance; // Assigns initial balance
    }

    public String getAccountHolder() { // Getter method to access account holder name
        return accountHolder; // Returns account holder name
    }

    public String getAccountNumber() { // Getter method to access account number
        return accountNumber; // Returns account number
    }

    public double getBalance() { // Getter method to access balance
        return balance; // Returns current balance
    }

    public void setAccountHolder(String accountHolder) { // Setter method to update account holder name
        this.accountHolder = accountHolder; // Updates account holder name
    }

    public void setAccountNumber(String accountNumber) { // Setter method to update account number
        this.accountNumber = accountNumber; // Updates account number
    }

    public void setBalance(double balance) { // Setter method to update balance
        this.balance = balance; // Updates account balance
    }
}

public class ATM { // Defines the ATM class

    public static void deposit(BankAccount account, double amount) { // Method to deposit money
        if (amount > 0) { // Checks if deposit amount is valid
            account.setBalance(account.getBalance() + amount); // Adds amount to balance
            System.out.println("Amount deposited: " + amount); // Prints deposit message
        } else {
            System.out.println("Invalid deposit amount"); // Prints error message
        }
    }

    public static void withdraw(BankAccount account, double amount) { // Method to withdraw money
        if (amount > 0 && amount <= account.getBalance()) { // Checks withdrawal conditions
            account.setBalance(account.getBalance() - amount); // Deducts amount from balance
            System.out.println("Amount withdrawn: " + amount); // Prints withdrawal message
        } else {
            System.out.println("Insufficient balance or invalid amount"); // Prints error message
        }
    }

    public static void balanceDisplay(BankAccount account) { // Method to display balance
        System.out.println("Your balance is: " + account.getBalance()); // Prints current balance
    }

    public static void main(String[] args) { // Main method where execution starts
        Scanner input = new Scanner(System.in); // Creates Scanner object for user input

        System.out.print("Enter account holder name: "); // Prompts user for account holder name
        String accountHolder = input.nextLine(); // Reads account holder name

        System.out.print("Enter account number: "); // Prompts user for account number
        String accountNumber = input.nextLine(); // Reads account number

        System.out.print("Enter initial balance: "); // Prompts user for initial balance
        double balance = input.nextDouble(); // Reads initial balance

        BankAccount account = new BankAccount(accountHolder, accountNumber, balance); // Creates BankAccount object

        System.out.print("Enter amount to deposit: "); // Prompts user for deposit amount
        double depositAmount = input.nextDouble(); // Reads deposit amount
        deposit(account, depositAmount); // Calls deposit method

        System.out.print("Enter amount to withdraw: "); // Prompts user for withdrawal amount
        double withdrawAmount = input.nextDouble(); // Reads withdrawal amount
        withdraw(account, withdrawAmount); // Calls withdraw method

        balanceDisplay(account); // Displays final account balance
    }
}
