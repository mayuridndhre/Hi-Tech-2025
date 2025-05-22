/*🔹 Task 2: Static Method for String Reversal
Interface: StringUtils
Task: Create a static method reverse(String input) that returns the reversed string.
Test: Call the method and print the result.*/

interface StringUtils
{
static String reverse(String input)
{
 return new StringBuilder(input).reverse().toString();
}
}
class StringUtilsMain
{
public static void main(String args[])
{
String reversed=StringUtils.reverse("Hello");
System.out.println("Reversed String: " + reversed);
}
}