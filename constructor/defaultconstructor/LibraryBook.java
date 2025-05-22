/*Write a LibraryBook class with attributes title and author.The default constructor should initialize them as "No Title" and "unknown Author",then display the book details.*/

class LibraryBook
{
String title;
String author;

LibraryBook()
{
title="No Title";
author="unknown Author";
}

void display()
{
System.out.println("title is :"+title+ " and author is :"+author);
}

public static void main(String args[])
{
LibraryBook l=new LibraryBook();
l.display();
}
}