/*Test it from a third package mainapp.*/

package maintransactions;
import banking.Account;
import transactions.Transaction;

class MainTransaction
{
public static void main(String args[])
{
Account a=new Account(12345,"Mayuri",50000);
a.show();

Transaction t=new Transaction();
t.deposit(a,5000);
t.withdraw(a,2000);
t.withdraw(a,54000);

}
}