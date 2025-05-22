/*Implement an Employee class with instance variables id,name,salary. The default constructor should initialize values to 0,"Not Assigned",and 0.0, then print details.*/

class Employee
{
int id;
String name;
double salary;

Employee()
{
id=0;
name="Not Assigned";
salary=0.0;
}

void display()
{
System.out.println("Employee id is "+id);
System.out.println("Employee name is "+name);
System.out.println("Employee salary is "+salary);
}

public static void main(String args[])
{
Employee e=new Employee();
e.display();
}

}

