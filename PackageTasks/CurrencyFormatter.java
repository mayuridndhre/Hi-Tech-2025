//Add a utils package to generate unique transaction IDs and format currency.

package utils;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static String format(double amount) {
        //return NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(amount);
        Locale india = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        return NumberFormat.getCurrencyInstance(india).format(amount);

    }
}
