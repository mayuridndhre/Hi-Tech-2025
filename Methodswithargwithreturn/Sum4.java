class Sum4
{
int a,b,c,add;

void getdata(int x,int y,int z)
{
a=x;
b=y;
c=z;
calc(a,b,c);
}

int calc(int a,int b,int c)
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
Sum4 s = new Sum4();
s.getdata(10,20,10);
s.display();

}
}
