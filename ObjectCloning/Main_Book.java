/*Task 1: Clone a Simple Object (Shallow Copy)
Objective:
Create a Book class with fields like title and author. Implement cloning using Cloneable and clone a Book object.*/

class Book implements Cloneable
{
	String title;
	String author;
	Book(String title,String author)
	{
		this.title=title;
		this.author=author;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class Main_Book
{
	public static void main(String args[])
	{
		try
		{
			Book b1=new Book("abc","xys");
			System.out.println("Title of Book is : " +b1.title+ " Author of Book is : " +b1.author);
			
			Book b2=(Book)b1.clone();
			System.out.println("Title of Book is : " +b2.title+ " Author of Book is : " +b2.author);
		}
		catch(CloneNotSupportedException e)
		{
		
		}
	}
}
