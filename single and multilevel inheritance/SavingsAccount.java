/*Task 3: Bank Account and Savings Account
Create a class BankAccount with attributes accountNumber and balance, and a method showBalance().
Create a class SavingsAccount that inherits BankAccount and adds an interest rate attribute with a method addInterest().
In the main method, create an object of SavingsAccount, add interest, and display the updated balance.*/

class BankAccount
{
int accountNumber;
double balance;

void showBalance()
{
System.out.println("Account no is : " +accountNumber);
System.out.println("balance is :" +balance);
}
}
class SavingsAccount extends BankAccount
{
double interestRate;

void addInterest()
{
   double interest = balance * (interestRate / 100);
   balance = balance + interest;
}
public static void main(String args[])
{
SavingsAccount s=new SavingsAccount();
s.accountNumber=1234;
s.balance=20000;
s.interestRate=5.0;

System.out.println("Before adding interest :");
s.showBalance();

s.addInterest();
System.out.println("After adding interest :");
s.showBalance();

}
}