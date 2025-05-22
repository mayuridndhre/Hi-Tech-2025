class Mod
{
int a,b;
float Modu;

void getdata()
{
a=10;
b=5;
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
m.getdata();
m.cal();
m.show();
}
}