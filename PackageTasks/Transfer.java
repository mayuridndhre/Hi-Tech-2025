//Create a package transactions for handling deposits, withdrawals, and transfers.

package transactions;

import accounts.Account;
import utils.IDGenerator;
import utils.CurrencyFormatter;

public class Transfer {
    public static void perform(Account from, Account to, double amount) {
        if (from.transfer(to, amount)) {
            String id = IDGenerator.generateID();
            System.out.println("Transfer ID: " + id + " | Transferred: " + CurrencyFormatter.format(amount));
        } else {
            System.out.println("Transfer failed due to insufficient funds.");
        }
    }
}