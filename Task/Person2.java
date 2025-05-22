/*Task:
Create a class Person with default access variables (name, age) and a method displayDetails().
Try accessing it from another class inside the same package (should work).*/

package person1;

class Person2
{
public static void main(String args[])
{
Person p=new Person();
p.displayDetails();
p.name="Mahi";
p.age=23;
p.displayDetails();
}
}