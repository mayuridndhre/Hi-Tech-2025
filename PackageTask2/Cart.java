//Create a package models for Book, Author, and Cart.

package models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addBook(Book book) {
        items.add(book);
        System.out.println(book.getTitle() + " added to cart.");
    }

    public List<Book> getItems() {
        return items;
    }

    public double getTotal() {
        return items.stream().mapToDouble(Book::getPrice).sum();
    }

    public void clear() {
        items.clear();
    }
}
