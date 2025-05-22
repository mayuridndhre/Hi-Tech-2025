//write a program to find maximum between three numbers using nested if

class Maxthreeno3
{
public static void main(String args[])
{
int a=50;
int b=200;
int c=400;

if(a>b && a>c)
{
System.out.println("a is greater");

	if(b>a && b>c)
	{
	System.out.println("b is greater");
	}
	else
	{
	System.out.println("b is smaller than a  and c");
	}
}
else
{
	if(c>a && c>b)
	{
	System.out.println("c is greater");
	}
	else
	{
	System.out.println("c is smaller than a and b");
	}

}
}
}