class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Main class
public class HierarchicalInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat();  //method call of animal class
        d.bark(); //method call of dog class

        System.out.println();

        Cat c = new Cat();
        c.eat();   //method call of animal class
        c.meow(); //method call of cat class
    }
}
