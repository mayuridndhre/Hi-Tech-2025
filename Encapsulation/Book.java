/*Task 5: Book Library System
Create a Book class:
Private: title, author, pages.
Add:
Getters and setters.
Add a method isThickBook() that returns true if pages > 500*/

public class Book
{
private String title;
private String author;
private int pages;

public String getTitle()
{
return title;
}
public void setTitle(String title)
{
this.title=title;
}

public String getAuthor()
{
return author;
}
public void setAuthor(String author)
{
this.author=author;
}

public int getPages()
{
return pages;
}
public void setPages(int pages)
{
this.pages=pages;
}

public boolean isThickBook()
{
return pages>500;
}

public static void main(String args[])
{
Book b=new Book();
b.setTitle("ABC");
b.setAuthor("XYZ");
b.setPages(200);

System.out.println("Title of Book is : "+b.getTitle());
System.out.println("Author of Book is : "+b.getAuthor());
System.out.println("Pages of Book is : "+b.getPages());
System.out.println("Is the Book is Thick : "+b.isThickBook());


}
}