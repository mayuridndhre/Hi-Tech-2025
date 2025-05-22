//write a program to find maximum between three numbers using only if

class Maxthreeno
{
public static void main(String args[])
{
int a=50;
int b=400;
int c=400;

if(a>b && a>c)
{
System.out.println("a is greater");
}
if(b>a && b>c)
{
System.out.println("b is greater");
}
if(c>a && c>b)
{
System.out.println("c is greater");
}
if(a==b)
{
System.out.println("both a and b are equal");
}
if(b==c)
{
System.out.println("both b and c are equal");
}
if(a==b && b==c)
{
System.out.println("all three nos are equal");
}
}
}