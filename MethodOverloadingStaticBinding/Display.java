/*Task 2: Display Info
Create a class Display with multiple show() methods:
show() – prints "No input"
show(String name) – prints name
show(int age) – prints age
Demonstrate how Java picks the correct method during compile time.*/
class Display
{
void show()
{
System.out.println("No input");
}
void show(String name)
{
System.out.println("Person name is :" +name);
}
void show(int age)
{
System.out.println("Person age is :"+age);
}
public static void main(String args[])
{
Display d=new Display();
d.show();
d.show("Mayuri");
d.show(23);
}
}