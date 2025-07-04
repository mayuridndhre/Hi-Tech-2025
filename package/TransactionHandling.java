//Create a package transactions for handling deposits, withdrawals, and transfers.
package transactions;

import accounts.Accountt;

public class TransactionHandling {

    public void deposits(Accountt ac, int amt) {
        ac.deposit(amt);
        System.out.println("After Deposit, available balance is: " + ac.getBalance());
    }

    public void withdrawls(Accountt ac, int amt) {
        if (ac.withdraw(amt)) {
            System.out.println("After Withdrawal, available balance is: " + ac.getBalance());
        } else {
            System.out.println("Insufficient balance. You have only " + ac.getBalance() + " and cannot withdraw " + amt);
        }
    }

    public void transfers(Accountt from, Accountt to, int amt) {
        if (from.withdraw(amt)) {
            to.deposit(amt);
            System.out.println("Transferred " + amt + " from Account " + from.getAccountNo() + " to Account " + to.getAccountNo());
        } else {
            System.out.println("Transfer failed. Insufficient balance.");
        }
    }
}
