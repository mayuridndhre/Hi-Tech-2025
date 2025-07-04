/*8. valueOf() – Convert to String
🔹 Task Ideas:
Convert integer to string and concatenate with another string.
Convert boolean and float to string using String.valueOf() and print.
Convert ASCII int to char and back using valueOf() and charAt().
Create a message like "Your balance is: " + String.valueOf(balance).
Use valueOf() to convert a character array to a string.*/

public class Task8 {
    public static void main(String[] args) {
        // 1
        int age = 25;
        String ageMessage = "My age is " + String.valueOf(age);
        System.out.println(ageMessage);

        // 2
        boolean isJavaFun = true;
        float price = 99.99f;
        System.out.println("Is Java fun? " + String.valueOf(isJavaFun));
        System.out.println("Price is: " + String.valueOf(price));

        // 3
        int asciiCode = 65;
        char ch = (char) asciiCode; // 65 is 'A'
        System.out.println("Character for ASCII " + asciiCode + " is: " + ch);

        String letterStr = String.valueOf(ch); // Convert char to string
        char fromStr = letterStr.charAt(0); // Back to char
        System.out.println("Character from string: " + fromStr);

        // 4
        double balance = 4523.75;
        String message = "Your balance is: " + String.valueOf(balance);
        System.out.println(message);

        // 5
        char[] letters = { 'J', 'a', 'v', 'a' };
        String word = String.valueOf(letters);
        System.out.println("Character array converted to string: " + word);
    }
}
