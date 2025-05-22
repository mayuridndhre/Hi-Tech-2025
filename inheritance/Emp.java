/*Task 3: Employee Management System
Create an Employee class with attributes name and salary.
Then, create two subclasses:

Manager (with an additional property department)

Developer (with an additional property programmingLanguage)

Write a method in each subclass to display the employee details.*/

class Employee
{
String name;
int salary;
}
class Manager extends Employee
{
String department;
void showManager()
{
System.out.println("Name of Employee is :"+name);
System.out.println("salary of Employee is :"+salary);
System.out.println("department of Employee is :"+department);
System.out.println("---------------------------");
}
}
class Developer extends Employee
{
String programmingLanguage;
void showDeveloper()
{
System.out.println("Name of Employee is :"+name);
System.out.println("salary of Employee is :"+salary);
System.out.println("Programming Language of Employee is :"+programmingLanguage);
System.out.println("---------------------------");
}
}
class Emp
{
public static void main(String args[])
{
Manager m=new Manager();
m.name="Mayuri";
m.salary=45000;
m.department="Computer Science";
m.showManager();

Developer d=new Developer();
d.name="Mahi";
d.salary=60000;
d.programmingLanguage="Java";
d.showDeveloper();
}
}

