//Create a package accounts with classes like Customer, Account.

package accounts;

public class Accountt
{
int accountNo;
public int balance;


public Accountt(int accountNo,int balance)
{
this.accountNo=accountNo;
this.balance=balance;
}

public void display()
{
System.out.println("Account No is : "+accountNo);
System.out.println("Available Account Balance is : "+balance); 

}
}