//Create a package transactions for handling deposits, withdrawals, and transfers.
package transactions;
import accounts.Customer;
import accounts.Accountt;

public class TransactionHandling
{
public void deposits(Accountt ac,int amt)
{
ac.balance+=amt;
System.out.println("After Deposit available balance is :"+ac.balance);
}
public void withdrawls(Accountt ac,int amt)
{
if(amt <= ac.balance)
{
ac.balance-=amt;
System.out.println("After Withdrawl available balance is :"+ac.balance);
}
else
{
System.out.println("Insufficient balance you have only "+ac.balance+" so you cannot withdrawl "+amt+ " from your original balance " +ac.balance );
}
}
public void transfers()
{

}
}