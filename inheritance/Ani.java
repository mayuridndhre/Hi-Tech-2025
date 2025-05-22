/*Task 2: Animal Classification
Create an Animal class with a method makeSound().
Then, create subclasses:

Dog (override makeSound() to print "Barks")

Cat (override makeSound() to print "Meows")

Cow (override makeSound() to print "Moos")

Create objects of each subclass and call makeSound().*/

class Animal
{
void makeSound()
{
System.out.println("Super class method calls");
}
}
class Dog extends Animal
{
void makeSoundDog()
{
System.out.println("Dog Barks");
}
}
class Cat extends Animal
{
void makeSoundCat()
{
System.out.println("Cat Meows");
}
}
class Cow extends Animal
{
void makeSoundCow()
{
System.out.println("Cow Moos");
}
}
class Ani
{
public static void main(String args[])
{
Dog d=new Dog();
d.makeSound();
d.makeSoundDog();

Cat c=new Cat();
c.makeSound();
c.makeSoundCat();

Cow c1=new Cow();
c1.makeSound();
c1.makeSoundCow();
}
}