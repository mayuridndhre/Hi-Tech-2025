//Create a package transactions for handling deposits, withdrawals, and transfers.

package transactions;

import accounts.Account;
import utils.IDGenerator;
import utils.CurrencyFormatter;

public class Deposit {
    public static void perform(Account account, double amount) {
        account.deposit(amount);
        String id = IDGenerator.generateID();
        System.out.println("Deposit ID: " + id + " | Deposited: " + CurrencyFormatter.format(amount));
    }
}