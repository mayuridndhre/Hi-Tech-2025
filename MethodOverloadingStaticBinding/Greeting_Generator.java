/*Task 3: Greeting Generator
Create overloaded greet() methods in a class:
greet() – prints "Hello!"
greet(String name) – prints "Hello, [name]!"
greet(String name, String time) – prints "Good [time], [name]!"
Call each one from the main class.*/
class Greeting_Generator
{
void greet()
{
System.out.println("Hello");
}
void greet(String name)
{
System.out.println("Hello,"+name);
}
void greet(String name,String time)
{
System.out.println("Good " +time+ " "+name);
}
public static void main(String args[])
{
Greeting_Generator g=new Greeting_Generator();
g.greet();
g.greet("Mahii");
g.greet("Mayuri","Night");
}
}