/*Task 4: Animal Sounds
Create a parent class Animal with method makeSound().
Create child classes Dog, Cat, Cow – all override makeSound().
In main(), declare reference as Animal, assign different objects, and call makeSound().*/
class Animal
{
void makeSound()
{
System.out.println("Animal Parent class Method call");
}
}
class Dog extends Animal
{
void makeSound()
{
System.out.println("Dog class Method call");
}
}
class Cat extends Animal
{
void makeSound()
{
System.out.println("Cat class Method call");
}
}
class Cow extends Animal
{
void makeSound()
{
System.out.println("Cow class Method call");
}
}
class Main
{
public static void main(String args[])
{
Animal a;

a=new Animal();
a.makeSound();

a=new Dog();
a.makeSound();

a=new Cat();
a.makeSound();

a=new Cow();
a.makeSound();
}
}
