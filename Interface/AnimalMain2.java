/*Task 2: Interface Inheritance
Objective: Practice extending interfaces and using inherited methods.
✅ Requirements:
Create an interface Animal with a method makeSound().
Create another interface Pet that extends Animal and adds a method play().
Implement both in a class Dog.
In the main method, call both methods.*/
interface Animal
{
void makeSound();
}
interface Pet extends Animal
{
void play();
}
class Dog implements Animal,Pet
{
public void makeSound()
{
System.out.println("Dog Bhoo.....");
}

public void play()
{
System.out.println("Dog playing.....");
}


}
class AnimalMain2
{
public static void main(String args[])
{
Dog d=new Dog();
d.makeSound();
d.play();
}
}