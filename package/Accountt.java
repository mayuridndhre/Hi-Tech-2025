//Create a package accounts with classes like Customer, Account.

package accounts;

public class Accountt
{
private int accountNo;
private int balance;


public Accountt(int accountNo,int balance)
{
this.accountNo=accountNo;
this.balance=balance;
}

public int getAccountNo()
{
return accountNo;
}

public int getBalance()
{
return balance;
}

 public void deposit(int amount) 
    {
        balance += amount;
    }

    public boolean withdraw(int amount)
        {
        if (amount <= balance)
        {
            balance -= amount;
            return true;
        }
        return false;
        }
}