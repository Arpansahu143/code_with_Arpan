abstract class Bank {
    abstract double calculateInterest(double amt, double rate, int yrs);
}

class SavingsAccount extends Bank {
   
    double calculateInterest(double amt, double rate, int yrs) {
        return (amt * rate * yrs) / 100;
    }
}

class FixedDeposit extends Bank {
    
    double calculateInterest(double amt, double rate, int yrs) {
        return amt * Math.pow((1 + rate / 100), yrs) - amt;
    } 
}

public class Q2 {
    public static void main(String[] args) {

        Bank savings = new SavingsAccount();
        Bank fixedDeposit = new FixedDeposit();
        System.out.println("Savings Interest: " + savings.calculateInterest(1000, 5, 2));
        System.out.println("Fixed Deposit Interest: " + fixedDeposit.calculateInterest(1000, 5, 2));

        
    }
}