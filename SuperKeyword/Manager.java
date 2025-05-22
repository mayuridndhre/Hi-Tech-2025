/*Practice Task 4: Using super with Method Overriding and Variables
Task:
Create a class Employee with a method displayInfo() and a variable role = "Employee".
Create a subclass Manager that overrides displayInfo() and has its own role.
In the overridden method, print both parent and child role and call super.displayInfo().*/

class Employee
{
String role="Employee";

void displayInfo()
{
System.out.println("Employee role is :"+role);
}
}
class Manager extends Employee
{
String role="Manager";

void displayInfo()
{
super.displayInfo();
System.out.println("Manager role is :"+role);
}

public static void main(String args[])
{
Manager m=new Manager();
m.displayInfo();
}
}