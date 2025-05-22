/*Task:
Create a BankAccount class with private variables (accountNumber, balance).
Provide public getter methods to access the private variables.*/

class BankAccount
{
private int accountNumber=123456;
private int balance=50000;

private void getter()
{
System.out.println("accountNumber is : "+accountNumber+ " and balance is : "+balance);
}
public void display()
{
getter();
}
}
class BankAccount2
{
public static void main(String args[])
{
BankAccount b=new BankAccount();
b.display();
}
}