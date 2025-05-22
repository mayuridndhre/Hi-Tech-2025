/*Task 2: Employee Salary System
Objective: Use an abstract class to generalize employee details and salary calculation.
Create an abstract class Employee with calculateSalary() as an abstract method.
Create subclasses FullTimeEmployee and PartTimeEmployee that implement the salary logic differently.
Use polymorphism to call the method and display the salary.*/

abstract class Employee
{
abstract void calculatesalary();
}
class FullTimeEmployee extends Employee
{
void calculatesalary()
{
System.out.println("Full Time Employee");
}
}
class PartTimeEmployee extends Employee
{
void calculatesalary()
{
System.out.println("Part Time Employee");
}
}
class EmployeeMain
{
public static void main(String args[])
{
Employee e;
e=new FullTimeEmployee();
e.calculatesalary();

e=new PartTimeEmployee();
e.calculatesalary();
}
}