package mypack2;

import mypack1.Parent;

public class Child extends Parent {
    public void display() {
        System.out.println("This is the Child class.");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();      // From Parent
        obj.display();   // From Child
    }
}
