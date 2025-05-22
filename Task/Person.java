/*Task:
Create a class Person with default access variables (name, age) and a method displayDetails().
Try accessing it from another class inside the same package (should work).*/

package person1;

public class Person
{
String name="Mayuri";
int age=23;

void displayDetails()
{
System.out.println("Person name is : "+name+ " and age is :"+age);
}
}