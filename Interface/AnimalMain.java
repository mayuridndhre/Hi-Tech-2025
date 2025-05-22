/*Task 1: Animal Interface
Objective: Practice basic interface implementation.
Create an interface Animal with a method makeSound().
Implement it in two classes: Dog and Cat.
Each class should print its own sound (e.g., "Bark" for Dog, "Meow" for Cat).*/

interface Animal
{
void makeSound();
}
class Dog implements Animal
{
public void makeSound()
{
System.out.println("Bark");
}
}
class Cat implements Animal
{
public void makeSound()
{
System.out.println("Meow");
}
}
class AnimalMain
{
public static void main(String args[])
{
Animal a;

a=new Dog();
a.makeSound();

a=new Cat();
a.makeSound();
}
}
