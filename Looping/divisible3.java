//Write a program to check whether a number is divisible by 5 and 11 or not using nested if

class divisible3
{
public static void main(String args[])
{
int a=5;

if(a%5==0)
{
 	if(a%11==0)
 	{
 	System.out.println("no is divisible by 5 and 11");
 	}
 	else
 	{
 	System.out.println("no is not divisible by 5 but not divisible by 11");
 	}
}
else
{
System.out.println("no is not divisible by 5");
}
}
}