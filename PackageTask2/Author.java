//packageTask2
/* Task 3: Online Bookstore
Create a package models for Book, Author, and Cart.
Create a package services to handle book listing, adding to cart, and checking out.
Use a utils package for date/time formatting and generating order numbers.
Create a main class to simulate browsing and purchasing books.*/

package models;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

