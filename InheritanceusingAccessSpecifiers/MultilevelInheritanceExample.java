// Base class (Grandparent)
class Grandparent {
    public String publicVar = "Public Variable - Accessible everywhere";
    protected String protectedVar = "Protected Variable - Accessible in subclasses";
    String defaultVar = "Default Variable - Accessible in the same package";
    private String privateVar = "Private Variable - Accessible only in this class";

    public void show() {
        System.out.println("Inside Grandparent Class");
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        // System.out.println(privateVar); // Private variable, not accessible in subclass
    }
}

// Derived class (Parent)
class Parent extends Grandparent {
    public void display() {
        System.out.println("Inside Parent Class");
        System.out.println(publicVar);      // Accessible
        System.out.println(protectedVar);   // Accessible
        System.out.println(defaultVar);     // Accessible (same package)
        // System.out.println(privateVar);  // Not accessible
    }
}

// Further Derived class (Child)
class Child extends Parent {
    public void print() {
        System.out.println("Inside Child Class");
        System.out.println(publicVar);      // Accessible
        System.out.println(protectedVar);   // Accessible
        System.out.println(defaultVar);     // Accessible (same package)
        // System.out.println(privateVar);  // Not accessible
    }
}

// Main Class
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();   // Calling method from Grandparent
        obj.display(); // Calling method from Parent
        obj.print();  // Calling method from Child
    }
}
