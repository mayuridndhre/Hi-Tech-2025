/*Category 2: this can be used to call the constructor
Task 3: Constructor Chaining with this()
Create a class Person with:

A default constructor that calls a parameterized constructor using this().
A parameterized constructor that takes String name, int age and prints a message.
Test constructor chaining by creating an object using the default constructor.*/

class Person
{
String name;
int age;

Person()
{
this("Mayuri",23);
}
Person(String name,int age)
{
this.name=name;
this.age=age;
}
void display()
{
System.out.println(name);
System.out.println(age);

}

public static void main(String args[])
{
Person p=new Person();
p.display();
}
}