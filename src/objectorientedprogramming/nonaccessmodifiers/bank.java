/*
 This program demonstrates the use of static variables, static methods,
 final variables, and the instanceof operator in Java.
 It defines a BankAccount class where the bank name is shared across
 all accounts, the total number of accounts is tracked, and each
 account has a final account number. The main class creates accounts
 and displays their details.
*/
package ObjectOrientedProgramming.Level1; // Defines the package for this program

import java.util.Scanner; // Imports Scanner class to take user input

class BankAccount { // Defines the BankAccount class

    static String bankName = "ABC National Bank"; // Static variable shared by all accounts
    private static int totalAccounts = 0; // Static variable to track total accounts created
    final int accountNumber; // Final variable that cannot be changed once assigned

    String accountHolderName; // Stores account holder name

    BankAccount(String accountHolderName, int accountNumber) { // Constructor to initialize account details
        this.accountHolderName = accountHolderName; // Assigns account holder name
        this.accountNumber = accountNumber; // Assigns account number
        totalAccounts++; // Increments total account count
    }

    static void getTotalAccounts() { // Static method to display total accounts
        System.out.println("Total accounts created: " + totalAccounts); // Prints total account count
    }

    void displayDetails() { // Method to display account details
        System.out.println("Bank Name: " + bankName); // Prints bank name
        System.out.println("Account Holder: " + accountHolderName); // Prints account holder name
        System.out.println("Account Number: " + accountNumber); // Prints account number
    }
}

public class bank { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter account holder name: "); // Prompts for first account holder name
        String name1 = sc.nextLine(); // Reads first account holder name

        System.out.print("Enter account number: "); // Prompts for first account number
        int accNo1 = sc.nextInt(); // Reads first account number
        sc.nextLine(); // Consumes leftover newline

        BankAccount acc1 = new BankAccount(name1, accNo1); // Creates first BankAccount object

        System.out.print("\nEnter account holder name: "); // Prompts for second account holder name
        String name2 = sc.nextLine(); // Reads second account holder name

        System.out.print("Enter account number: "); // Prompts for second account number
        int accNo2 = sc.nextInt(); // Reads second account number

        BankAccount acc2 = new BankAccount(name2, accNo2); // Creates second BankAccount object

        if (acc1 instanceof BankAccount) { // Checks if acc1 is an instance of BankAccount
            acc1.displayDetails(); // Displays details of first account
        }

        System.out.println(); // Prints a blank line

        if (acc2 instanceof BankAccount) { // Checks if acc2 is an instance of BankAccount
            acc2.displayDetails(); // Displays details of second account
        }

        System.out.println(); // Prints a blank line

        BankAccount.getTotalAccounts(); // Calls static method to display total accounts created
    }
}
