// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }void
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }

    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat();  // Inherited from Animal
        d.bark(); // Dog-specific method
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }

    public static void main(String args[]) {
        Cat c = new Cat();
        c.eat();  // Inherited from Animal
        c.meow(); // Cat-specific method
    }
}
