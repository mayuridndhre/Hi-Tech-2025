//Create a main class to simulate a customer performing bank operations.*/

package mainbank;
import accounts.Customer;
import accounts.Accountt;
import transactions.TransactionHandling;

class MainBank
{
public static void main(String args[])
{
Customer c=new Customer("Mahii","Amravati");
Accountt a=new Accountt(12345,60000);
c.show();
a.display();

TransactionHandling t=new TransactionHandling();
t.deposits(a,5000);
t.withdrawls(a,3000);
t.withdrawls(a,70000);




}
}