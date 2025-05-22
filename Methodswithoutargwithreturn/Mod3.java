class Mod3
{
int a,b,Mod;
void getdata()
{
a=20;
b=5;
}
int calc()
{
return a%b;
}
int display()
{
System.out.println("Modulus of two nos is : "+Mod);
}
public static void main(String args[])
{
Mod3 m=new Mod3();
m.getdata();
m.calc();
m.display();
}
}