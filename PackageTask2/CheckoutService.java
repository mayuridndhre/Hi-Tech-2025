//Create a package services to handle book listing, adding to cart, and checking out.

package services;

import models.Book;
import models.Cart;
import utils.DateTimeUtils;
import utils.OrderIDGenerator;

public class CheckoutService {
    public void checkout(Cart cart) {
        if (cart.getItems().isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\n--- Receipt ---");
        for (Book book : cart.getItems()) {
            System.out.println(book);
        }

        System.out.println("Total: ₹" + cart.getTotal());
        System.out.println("Order ID: " + OrderIDGenerator.generate());
        System.out.println("Order Time: " + DateTimeUtils.getCurrentDateTime());
        cart.clear();
    }
}
