//Aggregation
class Library
{
String Book;
Book b;

Library(String Book,Book b)
{
this.Book=Book;
this.b=b;
}

void display()
{
System.out.println("Book"+Book);
System.out.println("title"+b.title+"Author"+b.author+"Isbn"+b.isbn);
}
public static void main(String args[])
{
Book b1=new Book("java book","james Gosling",3242);
Book b2=new Book("Story book","dfjaslj",34628);
Library l1=new Library("JAVA",b1);
l1.display();
Library l2=new Library("Story",b2);
l2.display();
}
}
