class Swap3
{
int a,b,temp;

void getdata(int x,int y)
{
a=x;
b=y;
}
void show()
{
System.out.println("Swapping of two nos a is :"+a+ "and b is : "+b);
}
int calc()
{
temp=a;
a=b;
b=temp;
return a;
}
void display()
{
System.out.println("Swapping of two nos a is :"+a+ "and b is : "+b);
}
public static void main(String args[])
{
Swap3 s=new Swap3();
s.getdata(10,20);
s.show();
s.calc();
s.display();
}
}