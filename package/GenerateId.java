//Add a utils package to generate unique transaction IDs and format currency.

package utils;
import java.util.UUID;

public class GenerateId {
    public static String generateTransactionId() {
        return "TXN-" + UUID.randomUUID().toString().substring(0, 8);
    }
}
