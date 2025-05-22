/*Task 4: Overloading a Method for Sum Calculation
Objective:
Create a class SumCalculator that has overloaded methods:

sum(int a, int b) → returns sum of two integers.
sum(double a, double b) → returns sum of two doubles.
sum(int a, int b, int c) → returns sum of three integers.*/

class SumCalculator
{

int sum(int a,int b)
{
return a+b;
}

double sum(double a,double b)
{
return a+b;
}

int sum(int a,int b,int c)
{
return a+b+c;
}

public static void main(String args[])
{
SumCalculator s=new SumCalculator();
System.out.println("addition of two nos is :" +s.sum(5,10));
System.out.println("addition of two doubles is :" +s.sum(1.5,1.5));
System.out.println("Addition of three nos is :" +s.sum(5,10,10));
}
}