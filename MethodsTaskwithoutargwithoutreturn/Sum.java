class Sum
{
int a,b,c,add;
void getdata()
{
a=10;
b=20;
c=30;
}
void sum()
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
s.getdata();
s.sum();
s.display();
}

}