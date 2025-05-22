/*Create another package transactions with class Transaction that imports and updates an Account (deposit/withdraw).
Test it from a third package mainapp.*/

package transactions;
import banking.Account;

public class Transaction
{
public void deposit(Account ac,int amt)
{
ac.balance += amt;
System.out.println("After Deposit Account Balance is :"+ac.balance);
}
public void withdraw(Account ac,int amt)
{
if(ac.balance >= amt)
{
ac.balance -= amt;
System.out.println("After withdraw Account Balance is :"+ac.balance);
}  
else
{
System.out.println(" We have to withdraw "+amt+" Insufficient balance we only have = "+ac.balance+" amount.");
}
}
}