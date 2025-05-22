/*Task 2: Person → Employee → Manager
Create a base class Person with attributes name and age, and a method displayPerson().
Create a derived class Employee that inherits Person and has salary and a method displayEmployee().
Create a further derived class Manager that inherits Employee and has department with a method displayManager().
In main(), create a Manager object and display all details.*/

class Person 
{

String name;
int age;

void displayPerson(String name,int age)
{
this.name=name;
this.age=age;
}
}

class Employee extends Person
{
int salary;
void displayEmployee(int salary)
{
this.salary=salary;
}
}

class Manager1 extends Employee
{
String department;
void displayManager(String department)
{
this.department=department;
}

public static void main(String args[])
{
Manager1 m=new Manager1();
m.displayPerson("Mayuri",23);
m.displayEmployee(40000);
m.displayManager("IT");
System.out.println("Person name is :" +m.name);
System.out.println("Person age is :" +m.age);
System.out.println("Employee salary is :" +m.salary);
System.out.println("Manager department is :" +m.department);
}
}