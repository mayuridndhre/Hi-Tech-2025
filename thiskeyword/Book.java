/*Task 5: Using this() in Constructor for Default Values
Create a class Book with two constructors:

A constructor with title and author.
A constructor with only title, which calls the first constructor and assigns a default author "Unknown".*/

class Book
{
String title;
String author;

Book()
{
this("English","xyz");
author="Unknown";
System.out.println("default constructor");
}

Book(String title,String author)
{
this("Marathi");
this.title=title;
this.author=author;
System.out.println("two parameterized constructor");
}

Book(String title)
{

this.title=title;
System.out.println("single parameterized constructor");
}
public static void main(String args[])
{
Book b=new Book();
}
}