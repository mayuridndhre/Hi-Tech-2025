/*Practice Task 2: Calling Parent Class Method
Task:
Create a class Bird with a method fly() that prints "Bird is flying".
Create a subclass Eagle that overrides the fly() method with "Eagle is soaring".
Inside the overridden method, call the parent’s version using super.fly().*/

class Bird
{
void fly()
{
System.out.println("bird is flying");
}
}
class Eagle extends Bird
{
void fly()
{
super.fly();
System.out.println("Eagle is soaring");
}
}
class main
{
public static void main(String args[])
{
Eagle e=new Eagle();
e.fly();
}

}