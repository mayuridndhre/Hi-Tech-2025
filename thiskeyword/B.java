/*Task 5: Pass this to Another Class’s Method
Create two classes:

Class A has an instance variable message and a method print(A obj).
Class B has a method callPrint() that calls print(this) in Class A.*/

class A
{
String message;

void prin(B obj)
{
System.out.println("print method call");
}
}
class B
{

void callPrint()
{
A a=new A();
a.prin(this);
}
public static void main(String args[])
{
B b=new B();
b.callPrint();

}
}