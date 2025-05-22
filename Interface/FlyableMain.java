/*Task 3: Multiple Interfaces
Objective: Practice multiple interface inheritance.
Create two interfaces:
Flyable with method fly(),
Swimmable with method swim().
Create a class Duck that implements both interfaces.
Implement both methods and test in main().*/
interface Flyable
{
void fly();
}
interface Swimmable
{
void swim();
}
class Duck implements Flyable,Swimmable
{
public void fly()
{
System.out.println("Fly method");
}
public void swim()
{
System.out.println("swim method");
}
}
class FlyableMain
{
public static void main(String args[])
{
Duck d=new Duck();
d.fly();
d.swim();
}
}