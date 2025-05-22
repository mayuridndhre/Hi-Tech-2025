class Demo2
{
final int a;

void show()
{
a=5; // cannot assign a value to final variable a-----------a=5;
System.out.println(a);
}
public static void main(String args[])
{
Demo2 a=new Demo2();
a.show();
}
}