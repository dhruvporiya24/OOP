package Pr_10;

/*
Program Name: Pr_10
Description: BankAccount using static variable.
*/

class BankAccount {
    String account_holder_name;
    double balance;

    // Static variable (common for all objects)
    static double interest_rate = 5.0;

    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

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

        BankAccount b1 = new BankAccount("Amit", 10000);
        BankAccount b2 = new BankAccount("Rahul", 20000);

        System.out.println("Before updating interest rate:");
        b1.display();
        b2.display();

        BankAccount.updateInterestRate(7.0);

        System.out.println("\nAfter updating interest rate:");
        b1.display();
        b2.display();
    }
}
