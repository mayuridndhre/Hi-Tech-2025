
package mainbank;

import accounts.Customer;
import accounts.Accountt;
import transactions.TransactionHandling;
import utils.GenerateId;

public class MainBanking {
    public static void main(String[] args) {

       
        Customer customer1 = new Customer("Mayuri Dandhare", "Morshi");
        customer1.show();

        
        Accountt acc1 = new Accountt(101, 5000);  
        Accountt acc2 = new Accountt(102, 2000);  

       
        TransactionHandling handler = new TransactionHandling();

       
        System.out.println("\nTransaction ID: " + GenerateId.generateTransactionId());
        handler.deposits(acc1, 3000);

       
        System.out.println("\nTransaction ID: " + GenerateId.generateTransactionId());
        handler.withdrawls(acc1, 1000);

       
        System.out.println("\nTransaction ID: " + GenerateId.generateTransactionId());
        handler.transfers(acc1, acc2, 2000);

        
        System.out.println("\nFinal Balances:");
        System.out.println("Account " + acc1.getAccountNo() + " Balance: ₹" + acc1.getBalance());
        System.out.println("Account " + acc2.getAccountNo() + " Balance: ₹" + acc2.getBalance());
    }
}
