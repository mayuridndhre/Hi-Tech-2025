//Use a utils package for date/time formatting and generating order numbers.

package utils;

import java.util.UUID;

public class OrderIDGenerator {
    public static String generate() {
        return "ORD-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
}
