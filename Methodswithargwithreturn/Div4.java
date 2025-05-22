class Div4
{
int a,b;
float Div;

void getdata(int x,int y)
{
a=x;
b=y;
}
float calc()
{
Div=a/b;
return a/b;
}
void show()
{
System.out.println("Division of two nos is : "+Div);
}
public static void main(String args[])
{
Div4 d=new Div4();
d.getdata(20,5);
d.calc();
d.show();
}
}