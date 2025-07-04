//Add a utils package to generate unique transaction IDs and format currency.

package utils;

import java.util.UUID;

public class IDGenerator {
    public static String generateID() {
        return UUID.randomUUID().toString();
    }
}