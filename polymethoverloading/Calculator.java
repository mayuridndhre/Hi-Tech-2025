/*Compile-time Polymorphism (Method Overloading)
🔹 Task 1: Calculator Overload
Create a class Calculator with methods named add() to handle:
Adding two integers
Adding three integers
Adding two doubles*/

class Calculator
{
int add(int a,int b)
{
return a+b;
}
int add(int a,int b,int c)
{
return a+b+c;
}
double add(double a,double b)
{
return a+b;
}
public static void main(String args[])
{
Calculator c=new Calculator();
System.out.println(c.add(5,6));
System.out.println(c.add(5,6,4));
System.out.println(c.add(1.5,1.5));
}
}