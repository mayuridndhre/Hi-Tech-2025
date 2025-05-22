/*ask 4: Interface as Functionality Provider
Create interface Flyable with method fly() and interface Swimmable with method swim(). Implement both in a class Duck.*/
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
System.out.println("Duck Flying");
}
public void swim()
{
System.out.println("Duck Swimming");
}
public static void main(String args[])
{
Duck d=new Duck();
d.fly();
d.swim();
}
}