class Div
{
int a,b;
float Div;
void getdata(int x,int y)
{
a=x;
b=y;
}
void cal()
{
Div=a/b;
}
void show()
{
System.out.println("Div of two nos is :"+Div);
}

public static void main(String args[])
{
Div d = new Div();
d.getdata(20,5);
d.cal();
d.show();
}
}