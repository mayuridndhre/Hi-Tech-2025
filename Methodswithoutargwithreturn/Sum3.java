class Sum3
{
int a,b,c,add;

void getdata()
{
a=10;
b=20;
c=20;
}

int calc()
{
add=a+b+c;
return(add);
}
void display()
{
System.out.println("Addition of two nos is : "+add);
}
public static void main(String args[])
{
Sum3 s = new Sum3();
s.getdata();
s.calc();
s.display();
}
}
