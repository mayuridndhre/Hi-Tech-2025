/*Create a Book class with title, author, and price. The constructor should initialize these values and display book information.*/

class Book
{
String title;
String author;
int price;

Book(String t,String a,int p)
{
title=t;
author=a;
price=p;
}

void display()
{
System.out.println("Title of Book is :"+title);
System.out.println("Author of Book is :"+author);
System.out.println("Price of Book is :"+price);
}

public static void main(String args[])
{
Book b=new Book("Story Telling","xyz",550);
b.display();
}

}
