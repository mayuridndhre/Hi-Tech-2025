/*Implement a Person class with a constructor that accepts name and age. Add a method to check if the person is an adult (age >= 18).*/

class Person
{
String name;
int age;

Person(String n,int a)
{
name=n;
age=a;
}

void check()
{
if(age>=18)
{
System.out.println("person is adult");
}
else
{
System.out.println("person is young");
}
}

public static void main(String args[])
{
Person p=new Person("Mayuri",20);
p.check();
}
}