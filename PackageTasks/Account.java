/*✅ Task 2: Banking Application
Create a package accounts with classes like Customer, Account.
Create a package transactions for handling deposits, withdrawals, and transfers.
Add a utils package to generate unique transaction IDs and format currency.
Create a main class to simulate a customer performing bank operations.*/


package accounts;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(Account target, double amount) {
        if (withdraw(amount)) {
            target.deposit(amount);
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}