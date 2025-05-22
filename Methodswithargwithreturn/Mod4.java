class Mod4
{
int a,b;
float Mod;

void getdata(int p,int q)
{
a=p;
b=q;
}

float calc()
{
Mod=a%b;
return Mod;
}

void display()
{
System.out.println("Modulus of two nos is : "+Mod);
}

public static void main(String args[])
{
Mod4 m=new Mod4();
m.getdata(20,5);
m.calc();
m.display();
}
}