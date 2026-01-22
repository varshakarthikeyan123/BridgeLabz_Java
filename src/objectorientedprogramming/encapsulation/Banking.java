/*
 This program demonstrates a Banking System.
 It shows abstraction using abstract classes,
 interfaces for loan-related operations,
 encapsulation using private/protected members,
 and polymorphism through method overriding.
*/

// Interface defining loan-related behaviors
interface Loanable {

    void applyForLoan(); // Method to apply for a loan

    double calculateLoanEligibility(); // Method to calculate loan eligibility
}

// Abstract class representing a generic bank account
abstract class BankAccount {

    private int accountNumber; // Stores account number (encapsulated)
    private String holderName; // Stores account holder name (encapsulated)
    protected double balance; // Stores balance (accessible to subclasses)

    BankAccount(int accNo, String name, double balance) { // Constructor to initialize account details
        this.accountNumber = accNo; // Assigns account number
        this.holderName = name; // Assigns account holder name
        this.balance = balance; // Assigns initial balance
    }

    void deposit(double amount) { // Method to deposit money
        balance += amount; // Adds amount to balance
    }

    void withdraw(double amount) { // Method to withdraw money
        balance -= amount; // Subtracts amount from balance
    }

    abstract double calculateInterest(); // Abstract method to calculate interest
}

// Savings Account class extending BankAccount and implementing Loanable
class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(int acc, String name, double bal) { // Constructor for SavingsAccount
        super(acc, name, bal); // Calls parent class constructor
    }

    double calculateInterest() { // Overrides abstract method
        return balance * 0.04; // Calculates interest at 4%
    }

    public void applyForLoan() { // Implements Loanable method
        System.out.println("Loan applied"); // Displays loan application message
    }

    public double calculateLoanEligibility() { // Implements Loanable method
        return balance * 2; // Loan eligibility is twice the balance
    }
}
