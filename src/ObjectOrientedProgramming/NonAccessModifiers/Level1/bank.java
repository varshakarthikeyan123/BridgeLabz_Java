package ObjectOrientedProgramming.Level1;
import java.util.Scanner;
class BankAccount {
    static String bankName = "ABC National Bank";
    private static int totalAccounts = 0;
    final int accountNumber;

    String accountHolderName;
    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    static void getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }
    void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo1 = sc.nextInt();
        sc.nextLine();

        BankAccount acc1 = new BankAccount(name1, accNo1);

        System.out.print("\nEnter account holder name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo2 = sc.nextInt();

        BankAccount acc2 = new BankAccount(name2, accNo2);

        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }

        System.out.println();

        if (acc2 instanceof BankAccount) {
            acc2.displayDetails();
        }

        System.out.println();

        BankAccount.getTotalAccounts();

    }
}
