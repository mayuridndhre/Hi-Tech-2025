/*Run-time Polymorphism (Method Overriding)
🔸 Task 1: Animal Sound
Create a superclass Animal with a method makeSound() and subclasses Dog, Cat, and Cow that override this method.*/
class Animal
{
void makeSound()
{
System.out.println("Animal means parent class method calls");
}
}
class Dog extends Animal
{
void makeSound()
{
System.out.println("Dog class");
}

}
class Cat extends Animal
{
void makeSound()
{
System.out.println("Cat class");
}
}
class Cow extends Animal
{
void makeSound()
{
System.out.println("Cow class");
}
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

