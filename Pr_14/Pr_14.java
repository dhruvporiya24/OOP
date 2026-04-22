/*
Program Name: Pr_14
Program Description: Demonstrates inheritance with BankAccount, SavingAccount and FixedDepositAccount.
*/

class BankAccount {
    String name;
    double balance;

    void openAccount(String n, double b) {
        name = n;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest() {
        return balance * 0.05;
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount() {
        return balance * 1.1;
    }
}

public class Pr_14 {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.openAccount("Amit", 10000);
        s.deposit(2000);
        s.checkBalance();
        System.out.println("Interest: " + s.calculateInterest());

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount("Rahul", 15000);
        System.out.println("Maturity: " + f.maturityAmount());
    }
}
