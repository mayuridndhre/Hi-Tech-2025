/*Write a BankAccount class with overloaded constructors:

Default constructor with balance 1000.
Constructor with accountNumber and balance.
Constructor with all details (accountNumber, name, balance).*/

class BankAccount
{
int accountnumber;
String name;
int balance;

BankAccount()
{
balance=1000;
}

BankAccount(int a,int b)
{
accountnumber=a;
balance=b;
}

BankAccount(int a,String n,int b)
{
accountnumber=a;
name=n;
balance=b;
}

void show()
{
System.out.println(accountnumber);
System.out.println(name);
System.out.println(balance);
}

public static void main(String args[])
{
BankAccount b=new BankAccount();
b.show();
BankAccount b1=new BankAccount(12345,20000);
b1.show();
BankAccount b2=new BankAccount(54321,"Mayuri",50000);
b2.show();
}
} 