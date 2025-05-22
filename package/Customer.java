/*✅ Task 2: Banking Application
Create a package accounts with classes like Customer, Account.
Create a package transactions for handling deposits, withdrawals, and transfers.
Add a utils package to generate unique transaction IDs and format currency.
Create a main class to simulate a customer performing bank operations.*/

package accounts;

public class Customer
{
String accountHolderName;
String branch;

public Customer(String accountHolderName,String branch)
{
this.accountHolderName=accountHolderName;
this.branch=branch;
}
public void show()
{
System.out.println("Customer name is : "+accountHolderName);
System.out.println("Branch is : "+branch);
}
}