/*Task 7: Book Information Using this()
Create a class Book with two constructors:

A constructor with title and author.
A constructor with only title, which calls the first constructor and assigns a default author "Unknown".*/

class Book1
{

String title;
String author;

Book1(String title,String author)
{
this.title=title;
this.author=author;
}

Book1(String title)
{
this.title=title;
this.author=author;
}

void display()
{
System.out.println(title);
System.out.println(author);
}


public static void main(String args[])
{
Book1 b=new Book1("default title");
b.display();

Book1 b1=new Book1("abc","xyz");
b1.display();
}
}