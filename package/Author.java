//Create a package models for Book, Author, and Cart.

package models;
public class Author
{

String authorName;

public Author(String authorName)
{
this.authorName=authorName;
}

public void display()
{
System.out.println("Author Name of Book is : "+authorName);
}


}