/*Task 3: Find Maximum Number Using Overloading
Objective:
Create a class MaxFinder that has overloaded methods:

findMax(int a, int b) → returns max of two integers.
findMax(double a, double b) → returns max of two doubles.
findMax(int a, int b, int c) → returns max of three integers.*/

class MaxFinder
{
int findMax(int a,int b)
{
return (a>b)?a:b;
}

double findMax(double a,double b)
{
return (a>b)?a:b;
}

void findMax(int a,int b,int c)
{
if(a>b && a>c)
{
System.out.println("a is greater");
}
if(b>a && b>c)
{
System.out.println("b is greater");
}
else
{
System.out.println("c is greater");
}
}
public static void main(String args[])
{
MaxFinder m=new MaxFinder();
System.out.println("max of 5 and 20 is :" +m.findMax(5,20));
System.out.println("max of 1.5 and 9.5 is :" +m.findMax(9.5,1.5));
m.findMax(5,5,5);


}
}