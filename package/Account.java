/*Practice Task 4: Multiple Packages - banking and transactions
Objective: Use classes from multiple packages.
Create a package banking with class Account (fields: accNo, name, balance).
Create another package transactions with class Transaction that imports and updates an Account (deposit/withdraw).
Test it from a third package mainapp.*/

package banking;

public class Account
{
public int accNo;
public String name;
public int balance;

public Account(int accNo,String name,int balance)
{
this.accNo=accNo;
this.name=name;
this.balance=balance;
}

public void show()
{
System.out.println("Name of Customer is :"+name);
System.out.println("accNo of Customer is :"+accNo);
System.out.println("Account Balance is :"+balance);
}
}