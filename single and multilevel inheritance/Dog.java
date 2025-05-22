/*ask 2: Animal and Dog
Create a parent class Animal with a method makeSound() that prints "Some generic animal sound".
Create a child class Dog that inherits Animal and adds a method bark() that prints "Dog is barking".
In the main method, create an object of Dog and call both methods*/

class Animal
{

void makeSound()
{
System.out.println("some generic animal sound");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("Dog is barking");
}
public static void main(String args[])
{
Dog d=new Dog();
d.makeSound();
d.bark();
}
}