//Example in Java
//In Java, we use this() to call another constructor within the same class.
/*Explanation:
new Car(); calls the default constructor Car().
Inside Car(), this("Toyota", 2022); calls the parameterized constructor.
The parameterized constructor initializes the values and prints a message.
Control returns to the default constructor, which then prints "Default constructor called".
Finally, display() prints the car details.*/

//Code Example:
class Car {
    String brand;
    int year;

    // Constructor 1 (Default values)
    Car() {
        this("Toyota", 2022);  // Calls Constructor 2
        System.out.println("Default constructor called");
    }
+
    // Constructor 2 (Parameterized)
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Parameterized constructor called: " + brand + " " + year);
    }

    void display() {
        System.out.println("Car: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car();  // Calls default constructor, which calls the parameterized one
        car1.display();
    }
}