/*Task 2: Compare Strings Ignoring Case
Objective:
Use .equalsIgnoreCase() to compare two strings ignoring their letter case.
🔹 Input: "Hello" and "hello"
🔹 Output: "Strings are equal (case-insensitive)"*/

class StringsIgnoreCase
{
public static void main(String args[])
{
String s=new String("Hello");
String s1="hello";
System.out.println(s.equalsIgnoreCase(s1));
}
}