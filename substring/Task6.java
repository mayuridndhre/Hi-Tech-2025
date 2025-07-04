/*6. length() – Count Characters
🔹 Task Ideas:
Count characters in your full name.
Check if a password is more than 8 characters using length().
Compare lengths of two strings and print the longer one.
Find the number of characters before and after trim().
Use length() in a loop to reverse a string.*/

public class Task6 {
    public static void main(String[] args) {
        // 1
        String fullName = "Mayuri Dandhare";
        System.out.println("Full name: " + fullName);
        System.out.println("Number of characters: " + fullName.length());

        // 2
        String password = "Secret123";
        if (password.length() > 8) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is too short.");
        }

        // 3
        String str1 = "Hello";
        String str2 = "Universe";
        if (str1.length() > str2.length()) {
            System.out.println("Longer string: " + str1);
        } else if (str2.length() > str1.length()) {
            System.out.println("Longer string: " + str2);
        } else {
            System.out.println("Both strings are equal in length.");
        }

        // 4
        String messy = "   Clean Me   ";
        System.out.println("Before trim: " + messy.length());
        String trimmed = messy.trim();
        System.out.println("After trim: " + trimmed.length());

        // 5
        String original = "Mayuri";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }
}
