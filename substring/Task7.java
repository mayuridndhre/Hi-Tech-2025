/*7. replace() – Substitute Text
🔹 Task Ideas:
Replace "Java" with "Core Java" in a sentence.
Replace all spaces " " with dashes "-" in a string.
Mask email like "mayuri@gmail.com" → "m*****@gmail.com".
Remove all vowels from a sentence using replace() multiple times.
Convert "123-456-7890" to "1234567890" using replace("-","").*/

public class Task7 {
    public static void main(String[] args) {
        // 1
        String sentence = "I am learning Java programming.";
        String updatedSentence = sentence.replace("Java", "Core Java");
        System.out.println("Updated sentence: " + updatedSentence);

        // 2
        String spaced = "Replace all spaces with dashes";
        String dashed = spaced.replace(" ", "-");
        System.out.println("With dashes: " + dashed);

        // 3
        String email = "mayuri@gmail.com";
        int atIndex = email.indexOf('@');
        String maskedEmail = email.charAt(0) + "*****" + email.substring(atIndex);
        System.out.println("Masked email: " + maskedEmail);

        // 4
        String text = "Remove all vowels from this sentence.";
        text = text.replace("a", "")
                   .replace("e", "")
                   .replace("i", "")
                   .replace("o", "")
                   .replace("u", "")
                   .replace("A", "")
                   .replace("E", "")
                   .replace("I", "")
                   .replace("O", "")
                   .replace("U", "");
        System.out.println("Without vowels: " + text);

        // 5
        String phone = "123-456-7890";
        String cleanedPhone = phone.replace("-", "");
        System.out.println("Cleaned phone number: " + cleanedPhone);
    }
}
