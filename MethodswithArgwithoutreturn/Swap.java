class Swap
{
int a,b,temp;

void getdata(int x,int y)
{
a=x;
b=y;
calc();
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
s.getdata(10,20);
s.display();
}
}