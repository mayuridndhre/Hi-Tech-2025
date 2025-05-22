/*Category 1: this can be used to access the instance variable
Task 1: Resolve Naming Conflict with this
Write a Java class Employee that has:

Instance variables: name, id
A constructor that initializes these variables using the same parameter names.
A method display() that prints employee details.
Use this to differentiate between instance variables and parameters.*/

class Employee
{
String name;
int id;

Employee(String name,int id)
{
this.name=name;
this.id=id;
}
void display()
{
System.out.println(name);
System.out.println(id);
}
public static void main(String args[])
{
Employee e=new Employee("Mayuri",12345);
e.display();
}
}