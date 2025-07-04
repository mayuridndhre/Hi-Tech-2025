
package mainbank;

import accounts.Customer;
import accounts.Accountt;
import transactions.TransactionHandling;
import utils.GenerateId;

public class MainBanking {
    public static void main(String[] args) {

        // Create a Customer
        Customer customer1 = new Customer("Mayuri Dandhare", "Morshi");
        customer1.show();

        // Create two accounts (can be same or different customers)
        Accountt acc1 = new Accountt(101, 5000);  // Mayuri's main account
        Accountt acc2 = new Accountt(102, 2000);  // Mayuri's second account (or another customer)

        // Create a Transaction Handler
        TransactionHandling handler = new TransactionHandling();

        // Deposit Operation
        System.out.println("\nTransaction ID: " + GenerateId.generateTransactionId());
        handler.deposits(acc1, 3000);

        // Withdrawal Operation
        System.out.println("\nTransaction ID: " + GenerateId.generateTransactionId());
        handler.withdrawls(acc1, 1000);

        // Transfer Operation
        System.out.println("\nTransaction ID: " + GenerateId.generateTransactionId());
        handler.transfers(acc1, acc2, 2000);

        // Final Balances
        System.out.println("\nFinal Balances:");
        System.out.println("Account " + acc1.getAccountNo() + " Balance: ₹" + acc1.getBalance());
        System.out.println("Account " + acc2.getAccountNo() + " Balance: ₹" + acc2.getBalance());
    }
}
