/*Constructor Overloading in Java
Java allows constructor overloading, which means multiple constructors can exist in the same class with different parameters.*/

class Person {
    String name;
    int age;

    // Default Constructor
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Person(String n) {
        name = n;
        age = 18;
    }

    // Parameterized Constructor with two parameters
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("David");
        Person p3 = new Person("Emma", 25);

        p1.display();
        p2.display();
        p3.display();
    }
}