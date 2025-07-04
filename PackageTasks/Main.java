//Create a main class to simulate a customer performing bank operations.*/

import accounts.Account;
import accounts.Customer;
import transactions.Deposit;
import transactions.Withdrawal;
import transactions.Transfer;
import utils.CurrencyFormatter;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ravi Kumar", "C1001");
        Account account1 = new Account("A10001", 10000);
        Account account2 = new Account("A10002", 5000);

        System.out.println("Customer: " + customer.getName());

        Deposit.perform(account1, 2000);
        Withdrawal.perform(account1, 1500);
        Transfer.perform(account1, account2, 3000);

        System.out.println("Final Balance of Account1: " + CurrencyFormatter.format(account1.getBalance()));
        System.out.println("Final Balance of Account2: " + CurrencyFormatter.format(account2.getBalance()));
    }
}