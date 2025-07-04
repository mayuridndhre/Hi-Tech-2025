/*ask 3: Compare Two Strings Using ==
Objective:
Compare two strings using == and .equals() and explain the difference.
🔹 Hint: Create strings with and without using new String().*/

class CompareTwoStrings
{
public static void main(String args[])
{
String s="Mayuri";
String s1=new String("Mayuri");
String s2="Mayuri";

System.out.println("By using == Method");
System.out.println(s==s1);
System.out.println(s1==s2);
System.out.println(s==s2);


System.out.println("By using .equals() Method");
System.out.println(s.equals(s1));
System.out.println(s.equals(s2));
}
}