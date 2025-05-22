/*Test on Inheritance 
-----------------------
1. Single Inheritance - Library Management System
Problem Statement:
Create a Library System where:
A Book class stores details like title, author, and ISBN.
A LibraryBook class (which inherits Book) should have additional properties like rackNumber and isIssued.
Implement methods to:
Add a new book
Issue a book
Return a book
Display book details
Expected Output Example:
Book Added: The Alchemist | Author: Paulo Coelho | ISBN: 978-0062315007  
Book Issued: The Alchemist  
Book Returned: The Alchemist*/

class Book
{
String title;
String author;
int ISBN;
void BookAdded()
{
System.out.println(title+" | "+author+" | "+ISBN);
}
}
class LibraryBook extends Book
{
int rackNumber;
Boolean isIssued;

void BookIssued()
{
System.out.println(title);
}


public static void main(String args[])
{
LibraryBook l=new LibraryBook();
l.title="The Alchemist";
l.author="Paulo Coelho";
l.ISBN=9787;
l.BookAdded();
l.BookIssued();
}
}
