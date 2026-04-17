package Pr_10;

/*
Program Name: Pr_10
Program Description: This program defines a BankAccount class with account holder name
and balance. A static variable interest_rate is used (same for all accounts).
It includes methods to calculate and display interest earned, and a static method
to update the interest rate.
*/

class BankAccount {
    String account_holder_name;
    double balance;

    // Static variable (common for all objects)
    static double interest_rate = 5.0;

    // Constructor
    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    // Method to calculate interest
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }

    // Static method to update interest rate
    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }
}

public class Pr_10 {
    public static void main(String[] args) {

        // Create objects
        BankAccount b1 = new BankAccount("Amit", 10000);
        BankAccount b2 = new BankAccount("Rahul", 20000);

        // Display initial details
        System.out.println("Before updating interest rate:");
        b1.display();
        b2.display();

        // Update interest rate
        BankAccount.updateInterestRate(7.0);

        // Display after update
        System.out.println("\nAfter updating interest rate:");
        b1.display();
        b2.display();
    }
}
