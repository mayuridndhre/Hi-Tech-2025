/*Task 1: Employee and Manager
Create a parent class Employee with attributes name and salary, and a method displayDetails().
Create a child class Manager that inherits Employee and has an additional attribute department.
In the main method, create a Manager object and display all details.*/

class Employee
{
String name;
int salary;

void displayDetails()
{
System.out.println("Employee name is :" +name);
System.out.println("salary is :" +salary);
}
}
class Manager extends Employee
{
String department;
public static void main(String args[])
{

Manager m=new Manager();
m.name="Mayuri";
m.salary=60000;
m.department="IT";
m.displayDetails();
System.out.println("Department is :" +m.department);

}
}