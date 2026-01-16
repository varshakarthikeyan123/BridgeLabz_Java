package CoreProgramming.ClassAndObjects.Level2;
import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class ATM {
    public static void deposit(BankAccount account, double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public static void withdraw(BankAccount account, double amount) {
        if (amount > 0 && amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    public static void balanceDisplay(BankAccount account) {
        System.out.println("Your balance is: " + account.getBalance());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolder = input.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();

        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        deposit(account, depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        withdraw(account, withdrawAmount);

        balanceDisplay(account);

    }
}

