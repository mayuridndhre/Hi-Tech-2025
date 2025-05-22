/*Task 3: Online Bookstore
Create a package models for Book, Author, and Cart.
Create a package services to handle book listing, adding to cart, and checking out.
Use a utils package for date/time formatting and generating order numbers.
Create a main class to simulate browsing and purchasing books.*/

package models;
public class Book
{
String bookName;
String title;
int price;


public Book(String bookName,String title,int price)
{
this.bookName=bookName;
this.title=title;
this.price=price;
}

public void show()
{
System.out.println("Name of Book is :"+bookName);
System.out.println("Title of Book is :"+title);
System.out.println("Price of Book is :"+price);
}

}