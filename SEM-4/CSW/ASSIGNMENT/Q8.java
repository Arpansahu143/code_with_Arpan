
abstract class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public abstract void withdraw(double amount);

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    
    public void deposit(double amount) {
        double interest = amount * (interestRate / 100);
        super.deposit(amount + interest);
        System.out.println("Interest Added: " + interest);
    }

   
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            super.deposit(-amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}


class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            super.deposit(-amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}


public class Q8 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, 5000, 5);
        CurrentAccount current = new CurrentAccount(102, 2000, 1000);

        
        savings.deposit(1000);
        savings.withdraw(3000);
        current.withdraw(2500);
        current.withdraw(500);

        
        System.out.println("\nSavings Account Details:");
        savings.displayAccountDetails();
        System.out.println("\nCurrent Account Details:");
        current.displayAccountDetails();
    }
}
