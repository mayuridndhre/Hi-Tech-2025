//2. Parameterized Constructor
//A parameterized constructor accepts arguments to initialize object properties.

class Employee {
    String name;
    int id;

    // Parameterized Constructor
    Employee(String empName, int empId) {
        name = empName;
        id = empId;
    }

    void display() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Mayuri", 101);
        Employee e2 = new Employee("Sakshi", 102);

        e1.display();
        e2.display();
    }
}
