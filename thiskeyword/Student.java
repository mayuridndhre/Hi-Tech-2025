/*this to Pass an Argument in a Constructor Call
We use this to pass the current instance from one constructor to another. This is useful when we want to initialize an object using another constructor instead of repeating code.*/

/*Explanation:
new Student(); calls the default constructor.
Inside the default constructor, this("Default Student", 18); calls the parameterized constructor.
The parameterized constructor initializes the values.
Control returns to the default constructor and prints "Default constructor called".
display() prints the student details.*/

//Example: Passing this in a Constructor

class Student {
    String name;
    int age;

    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor calling another constructor using 'this'
    Student() {
        this("Default Student", 18); // Calls the above constructor
        System.out.println("Default constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();  // Calls default constructor
        s1.display();
    }
}
