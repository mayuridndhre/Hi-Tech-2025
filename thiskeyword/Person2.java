/*Category 1: this to Pass an Argument in a Constructor Call
Task 1: Constructor Chaining with this()
Write a Java class Person with:

A default constructor that calls a parameterized constructor using this().
A parameterized constructor that takes String name, int age and prints a message.
Test constructor chaining by creating an object using the default constructor.*/

class Person2
{
String name;
int age;

Person2()
{
this("Mahii",22);
}

Person2(String name,int age)
{
this.name=name;
this.age=age;
System.out.println(name);
System.out.println(age);
}
public static void main(String args[])
{
Person2 p=new Person2();
}
}