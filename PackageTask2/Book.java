//Create a package models for Book, Author, and Cart.

package models;

public class Book {
    private String title;
    private Author author;
    private double price;
    private String isbn;

    public Book(String title, Author author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return title + " by " + author.getName() + " - ₹" + price;
    }
}