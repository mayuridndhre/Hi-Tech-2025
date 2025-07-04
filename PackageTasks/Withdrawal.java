//Create a package transactions for handling deposits, withdrawals, and transfers.

package transactions;

import accounts.Account;
import utils.IDGenerator;
import utils.CurrencyFormatter;

public class Withdrawal {
    public static void perform(Account account, double amount) {
        if (account.withdraw(amount)) {
            String id = IDGenerator.generateID();
            System.out.println("Withdrawal ID: " + id + " | Withdrawn: " + CurrencyFormatter.format(amount));
        } else {
            System.out.println("Withdrawal failed due to insufficient funds.");
        }
    }
}