/*Task 2: Method Overloading for Printing Messages
Objective:
Create a class MessagePrinter that has overloaded methods:

printMessage() → prints "Hello, World!".
printMessage(String name) → prints "Hello, [name]!".
printMessage(String name, int age) → prints "Hello, [name]! You are [age] years old."*/

class MessagePrinter
{
String name;
int age;

void printMessage()
{
System.out.println("Hello, World!");
}

void printMessage(String name)
{
System.out.println("Hello," +name);
}

void printMessage(String name,int age)
{
System.out.println("Hello," +name+ "! You are " +age+ " years old.");
}

public static void main(String args[])
{
MessagePrinter m=new MessagePrinter();
m.printMessage();
m.printMessage("Mahii");
m.printMessage("Mayuri",23);
}
}