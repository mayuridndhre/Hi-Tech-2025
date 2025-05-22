package mypackage2;

import mypackage1.Parentt;

 public class Childd extends Parentt {
    void display() {
        System.out.println("This is the Child class.");
    }

}
public class Test
{
    public static void main(String[] args) {
        Childd obj = new Childd();
        obj.show();      // From Parent
        obj.display();   // From Child
    }
}
