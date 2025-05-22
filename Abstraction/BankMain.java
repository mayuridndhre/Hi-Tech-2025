/*Task 5: Bank Transaction System
Objective: Build a base class for banks with abstract methods for interest rates.
Create an abstract class Bank with abstract method getInterestRate().
Create subclasses SBI, HDFC, ICICI that return different interest rates.
Create an array of bank references and print the interest rate of each.*/
abstract class Bank
{
abstract void getInterestRate();
}
class SBI extends Bank
{
void getInterestRate()
{
System.out.println("SBI class");
}
}
class HDFC extends Bank
{
void getInterestRate()
{
System.out.println("HDFC class");
}
}
class ICICI extends Bank
{
void getInterestRate()
{
System.out.println("ICICI class");
}
}
class BankMain
{
public static void main(String args[])
{
Bank b;
b=new SBI();
b.getInterestRate();

b=new HDFC();
b.getInterestRate();

b=new ICICI();
b.getInterestRate();
}
}