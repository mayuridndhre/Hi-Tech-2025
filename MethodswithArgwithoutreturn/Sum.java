class Sum
{
int a,b,c,add;
void getdata(int x,int y,int z)
{
a=x;
b=y;
c=z;
calc(a,b,c);
}
void calc(int a,int b,int c)
{
add=a+b+c;
}
void display()
{
System.out.println("Sum of three nos is : "+add);
}

public static void main(String args[])
{
Sum s = new Sum();
s.getdata(10,20,10);
s.display();
}
}
