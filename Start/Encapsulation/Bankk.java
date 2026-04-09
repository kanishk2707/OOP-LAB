class BankAccount {
    // private data
    private double balance;

    // constructor
    public BankAccount() {
        balance = 0.0;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit!");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // getter
    public double getBalance() {
        return balance;
    }
}

public class Bankk {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(1000);
        acc.withdraw(300);

        System.out.println("Balance: " + acc.getBalance());
    }
}