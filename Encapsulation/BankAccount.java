/*Task 2: Bank Account Management
Create a BankAccount class with:
Private variables: accountNumber, accountHolderName, balance.
Add:
Getters and setters.
Method to deposit and withdraw money.
Prevent withdrawal if balance is insufficient.*/

public class BankAccount
{
private int accountNumber;
private String accountHolderName;
private int balance;

public int getAccountNumber()
{
return accountNumber;
}

public void setAccountNumber(int accountNumber)
{
this.accountNumber=accountNumber;
}

public String getAccountHolderName()
{
return accountHolderName;
}

public void setAccountHolderName(String accountHolderName)
{
this.accountHolderName=accountHolderName;
}

public int getBalance()
{
return balance;
}

public void setBalance(int balance)
{
this.balance=balance;
}

public void deposit(int amount)
{
balance+=amount;
}

public void withdrawal(int amount)
{
if(amount<=balance)
{
balance-=amount;
}
else
{
System.out.println("Insufficient balance");
}
}
public static void main(String args[])
{
BankAccount b=new BankAccount();
b.setAccountNumber(12);
b.setAccountHolderName("Mayuri");
b.setBalance(50000);

System.out.println("AccountHolder Name is : "+b.getAccountHolderName());
System.out.println("AccountHolder Number is : "+b.getAccountNumber());
System.out.println("AccountHolder Balance is : "+b.getBalance());

b.deposit(500);
System.out.println("After Deposit the Balance is :" +b.getBalance());
b.withdrawal(200);
System.out.println("After Withdrawal the Balance is :" +b.getBalance());
}
}