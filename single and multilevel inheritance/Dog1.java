/*Task 1: Animal → Mammal → Dog
Create a parent class Animal with a method eat().
Create a child class Mammal that inherits Animal and has a method walk().
Create a further child class Dog that inherits Mammal and has a method bark().
In the main() method, create a Dog object and call all three methods.*/

class Animal
{
void eat()
{
System.out.println("Animal eats");
}
}
class Mammal extends Animal
{
void walk()
{
System.out.println("Mammal walks");
}
}
class Dog1 extends Mammal
{
void bark()
{
System.out.println("Dog barks Bhoo...");
}
public static void main(String args[])
{
Dog1 d=new Dog1();
d.eat();
d.walk();
d.bark();
}
}
