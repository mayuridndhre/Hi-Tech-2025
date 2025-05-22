class Swap
{
int a,b,temp;

void getdata()
{
a=10;
b=20;
}

void calc()
{
System.out.println("before swapping value of a is :"+a+ "and the value of b is :"+b);
temp=a;
a=b;
b=temp;
}

void display()
{
System.out.println("after swapping value of a is :"+a+ "and the value of b is :"+b);
}

public static void main(String args[])
{
Swap s=new Swap();
s.getdata();
s.calc();
s.display();
}
}