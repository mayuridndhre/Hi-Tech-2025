/*Create a BankAccount class with a default constructor that initializes balance to 1000 and displays the account balance.*/

class BankAccount
{
int balance;

BankAccount()
{
balance=1000;
}

void display()
{
System.out.println("account balance is "+balance);
}
public static void main(String args[])
{
BankAccount b=new BankAccount();
b.display();
}
}