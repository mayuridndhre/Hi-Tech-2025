import models.Book;
import models.Cart;
import services.BookService;
import services.CheckoutService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        CheckoutService checkoutService = new CheckoutService();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Bookstore!\n");

        while (true) {
            System.out.println("\nAvailable Books:");
            for (Book book : bookService.listBooks()) {
                System.out.println(book.getIsbn() + " - " + book);
            }

            System.out.print("\nEnter ISBN to add to cart or 'checkout' to finish: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("checkout")) {
                checkoutService.checkout(cart);
                break;
            }

            Book selected = bookService.findBookByIsbn(input);
            if (selected != null) {
                cart.addBook(selected);
            } else {
                System.out.println("Invalid ISBN. Try again.");
            }
        }

        scanner.close();
    }
}