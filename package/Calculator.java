/*Practice Task 1: Package - mathutils
Objective: Create a package with a class that performs arithmetic operations.
Create a package mathutils.
In it, create a class Calculator with methods: add(), subtract(), multiply(), and divide().
Create another class in a different package (e.g., app) to import and use the Calculator class.*/
package mathutils;
public class Calculator
{
int a=10;
int b=5;
int c;
public void add()
{
c=a+b;
System.out.println("Addition of two nos is :" +c);
}
public void subtract()
{
c=b-a;
System.out.println("Substraction of two nos is :" +c);

}
public void multiply()
{
c=a*b;
System.out.println("Multiplication of two nos is :" +c);

}
public void divide()
{
c=a/b;
System.out.println("Division of two nos is :" +c);
}
}