/*ask 2: Bank Interest Rate
Create a base class Bank with method getInterestRate(). Create subclasses SBI, HDFC, and ICICI that return different interest rates.*/
class Bank
{
double getInterestRate(double a)
{
return a;
}
}
class SBI extends Bank
{
double getInterestRate(double a)
{
return a;
}
}
class HDFC extends Bank
{
double getInterestRate(double a)
{
return a;
}
}
class ICICI extends Bank
{
double getInterestRate(double a)
{
return a;
}
public static void main(String args[])
{
Bank b;

b=new Bank();
System.out.println(b.getInterestRate(0.0));

b=new SBI();
System.out.println(b.getInterestRate(5));

b=new HDFC();
System.out.println(b.getInterestRate(6));

b=new ICICI();
System.out.println(b.getInterestRate(7));

}
}