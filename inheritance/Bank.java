/*Task 5: Bank Account System
Create a BankAccount class with properties accountNumber and balance.
Then, create subclasses:

SavingsAccount (with additional interestRate)

CurrentAccount (with additional overdraftLimit)

Write methods to deposit, withdraw, and display account details.*/

class BankAccount
{
double accountNumber;
double balance;

void deposit(double amount)
{
balance=balance+amount;
System.out.println("After deposit 5000 balance is :"+balance);
System.out.println("--------------");
}
void withdraw(double amount)
{
balance=balance-amount;
System.out.println("After withdraw balance is :"+balance);
}
void display()
{
System.out.println("Account No is :"+accountNumber);
System.out.println("Balance is :"+balance);
}

}
class SavingsAccount extends BankAccount
{
int InterestRate;
}
class CurrentAccount extends BankAccount
{
int overdraftLimit;
}
class Bank
{
public static void main(String args[])
{
SavingsAccount s=new SavingsAccount();
s.accountNumber=12345;
s.balance=4000;
s.InterestRate=5;
s.display();
s.deposit(500);

s.overdraftLimit=10;
s.display();
s.withdraw(200);
System.out.println("--------------");
}
}