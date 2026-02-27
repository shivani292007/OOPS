import java.util.*;
import java.io*;


abstract class BankAccount {
    String accountHolder;

    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}


class SavingsAccount extends BankAccount {
    private double balance;

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder);
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Input");
        } else {
            balance += amount;
            System.out.printf("Amount deposited successfully. Updated Balance: %.2f%n", balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid Input");
        } else {
            balance -= amount;
            System.out.printf("Amount withdrawn successfully. Updated Balance: %.2f%n", balance);
        }
    }
}


class CurrentAccount extends BankAccount {
    private double balance;

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder);
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Input");
        } else {
            balance += amount;
            System.out.printf("Amount deposited successfully. Updated Balance: %.2f%n", balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid Input");
        } else {
            balance -= amount;
            System.out.printf("Amount withdrawn successfully. Updated Balance: %.2f%n", balance);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account type (Savings or Current):");
        String type = sc.nextLine();

        System.out.println("Enter account holder name:");
        String accountHolder = sc.nextLine();

        System.out.println("Enter initial balance:");
        double balance = sc.nextDouble();

        BankAccount a; 
        if (type.equals("Savings")) {
            a = new SavingsAccount(accountHolder, balance);
        } else if (type.equals("Current")) {
            a = new CurrentAccount(accountHolder, balance);
        } else {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Enter amount to deposit:");
        double deposit = sc.nextDouble();
        a.deposit(deposit);   

        System.out.println("Enter amount to withdraw:");
        double withdraw = sc.nextDouble();
        a.withdraw(withdraw); 
    }
}