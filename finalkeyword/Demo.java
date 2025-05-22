class Demo
{
final int a=5;

void show()
{
a=5; // cannot assign a value to final variable a
System.out.println(a);
}
public static void main(String args[])
{
Demo a=new Demo();
a.show();
}
}