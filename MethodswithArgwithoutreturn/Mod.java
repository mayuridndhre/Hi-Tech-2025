class Mod
{
int a,b;
float Modu;

void getdata(int x, int y)
{
a=x;
b=y;
cal();
}

void cal()
{
Modu=a%b;
}

void show()
{
System.out.println("Modulus of two nos is : "+Modu);
}

public static void main(String args[])
{
Mod m=new Mod();
m.getdata(10,5);
m.show();
}
}