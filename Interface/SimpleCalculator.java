/*Task 5: Calculator Interface
Objective: Interface with multiple method declarations.
Create an interface Calculator with methods:
add(int a, int b)
subtract(int a, int b)
Implement the interface in a class SimpleCalculator.
Call the methods with sample numbers and print results.*/
interface Calculator
{
void add(int a,int b);
void substract(int a,int b);
}
class SimpleCalculator implements Calculator
{
public void add(int a,int b)
{
int add=a+b;
System.out.println("Addition of two nos is :"+add);
}
public void substract(int a,int b)
{
int sub=a-b;
System.out.println("Substraction of two nos is :"+sub);
}

public static void main(String args[])
{
SimpleCalculator s=new SimpleCalculator();
s.add(5,5);
s.substract(10,2);
}
}