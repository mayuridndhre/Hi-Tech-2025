 /*this to Pass an Argument in a Method Call
We can use this to pass the current instance to a method of the same or another class.*/

/*Explanation:
new Person("Alice"); initializes an object.
callShow() calls show(this); passing the current instance (this).
The show(Person p) method receives the object and prints the name.*/

/*Example: Passing this in a Method
2️⃣ this to Pass an Argument in a Method Call
We can use this to pass the current instance to a method of the same or another class.*/

//Example: Passing this in a Method
class Person1 {
    String name;

    Person1(String name) {
        this.name = name;
    }

    void show(Person1 p) { // Method that accepts a Person object
        System.out.println("Person Name: " + p.name);
    }

    void callShow() {
        show(this); // Passing the current instance to the method
    }

    public static void main(String[] args) {
        Person1 p1 = new Person1("Alice");
        p1.callShow();
    }
}
