//Hierarchical Inheritance example with access specifier
// Parent Class (Super Class)
class Animal {
    public String name = "Animal";    // Public variable
    protected String type = "Wild";   // Protected variable
    String category = "Mammal";       // Default variable
    private int age = 5;              // Private variable (not inherited)

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Category: " + category);
        // System.out.println("Age: " + age); // Not accessible outside this class
    }
}
// Child Class 1 (inherits from Animal)
class Dog extends Animal {
    public void showDogDetails() {
        System.out.println("Dog Details:");
        System.out.println("Name: " + name);     // Public (Accessible)
        System.out.println("Type: " + type);     // Protected (Accessible)
        System.out.println("Category: " + category); // Default (Accessible in same package)
        // System.out.println("Age: " + age);  // Private (Not Accessible)
    }
}
// Child Class 2 (inherits from Animal)
class Cat extends Animal {
    public void showCatDetails() {
        System.out.println("Cat Details:");
        System.out.println("Name: " + name);     // Public (Accessible)
        System.out.println("Type: " + type);     // Protected (Accessible)
        System.out.println("Category: " + category); // Default (Accessible in same package)
        // System.out.println("Age: " + age);  // Private (Not Accessible)
    }
}
// Main Class
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Accessing methods from parent class
        System.out.println("Accessing Parent Class Method:");
        dog.displayInfo();
        cat.displayInfo();

        // Accessing methods from child classes
        System.out.println("\nAccessing Child Class Methods:");
        dog.showDogDetails();
        cat.showCatDetails();
    }
}