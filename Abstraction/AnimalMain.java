/*Task 4: Animal Sound Simulator
Objective: Use abstraction to define a framework for animal behavior.
Create an abstract class Animal with an abstract method makeSound().
Subclasses Dog, Cat, and Cow should override the method to print specific sounds.
Use an array of Animal objects and call makeSound() for each.*/
abstract class Animal
{
abstract void makeSound();
}
class Dog extends Animal
{
void makeSound()
{
System.out.println("Dog Barks");
}
}
class Cat extends Animal
{
void makeSound()
{
System.out.println("Cat Meow");
}
}
class Cow extends Animal
{
void makeSound()
{
System.out.println("Cow Barks");
}
}
class AnimalMain
{
public static void main(String args[])
{
Animal a=new Dog();
a.makeSound();

Animal a=new Cat();
a.makeSound();

Animal a=new Cow();
a.makeSound();
}
}
