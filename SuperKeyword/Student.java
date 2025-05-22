/*Practice Task 3: Calling Parent Constructor
Task:
Create a class Person with a constructor that prints "Person created".
Create a subclass Student that calls the parent constructor using super() and prints "Student created".*/

class Person
{
Person()
{
System.out.println("Person created");
}
}
class Student extends Person
{
Student()
{
//super();..........automatic call honr previous constructor without declare
System.out.println("Student created");
}

public static void main(String args[])
{
Student s=new Student();
}
}
