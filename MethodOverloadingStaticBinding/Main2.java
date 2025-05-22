/*Task 5: Bank Interest Rate
Create a class Bank with method getInterestRate().
Create subclasses SBI, HDFC, and ICICI – each override getInterestRate().
In main(), use dynamic binding to call getInterestRate() using Bank reference pointing to different banks.*/
class Bank
{
void getInterestRate(double interest)
{
System.out.println("Bank class :"+interest);
}
}
class SBI extends Bank
{
void getInterestRate(double interest)
{
System.out.println("SBI class :"+interest);
}
}
class HDFC extends Bank
{
void getInterestRate(double interest)
{
System.out.println("HDFC class :"+interest);
}
}
class ICICI extends Bank
{
void getInterestRate(double interest)
{
System.out.println("ICICI class :"+interest);
}
}
class Main2
{
public static void main(String args[])
{
Bank b;

b=new Bank();
b.getInterestRate(0.0);

b=new SBI();
b.getInterestRate(2);

b=new HDFC();
b.getInterestRate(3);

b=new ICICI();
b.getInterestRate(4);
}
}