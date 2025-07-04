//Create a package services to handle book listing, adding to cart, and checking out.

package services;

import models.Author;
import models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> availableBooks;

    public BookService() {
        availableBooks = new ArrayList<>();
        populateBooks();
    }

    private void populateBooks() {
        availableBooks.add(new Book("Java Programming", new Author("James Gosling"), 499.99, "ISBN001"));
        availableBooks.add(new Book("Clean Code", new Author("Robert C. Martin"), 699.99, "ISBN002"));
        availableBooks.add(new Book("Design Patterns", new Author("Erich Gamma"), 599.99, "ISBN003"));
    }

    public List<Book> listBooks() {
        return availableBooks;
    }

    public Book findBookByIsbn(String isbn) {
        return availableBooks.stream()
                .filter(book -> book.getIsbn().equalsIgnoreCase(isbn))
                .findFirst()
                .orElse(null);
    }
}
