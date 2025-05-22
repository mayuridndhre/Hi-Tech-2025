/*ask 3: Greetings Overload
Create a class Greeter with a method greet():
greet() → prints a generic greeting.
greet(String name) → prints "Hello, [name]!".
greet(String name, int age) → prints "Hello, [name], age [age]!"*/

class Greeter
{
void greet()
{
System.out.println("generic greeting");
}
void greet(String name)
{
System.out.println("Hello,"+name+"!");
}

void greet(String name,int age)
{
System.out.println("Hello,"+name+", age"+age+" !"); 
}

public static void main(String args[])
{
Greeter g=new Greeter();
g.greet();
g.greet("Mayuri");
g.greet("Mahii",23);
}
}