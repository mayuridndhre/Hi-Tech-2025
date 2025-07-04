/*✅ 1. substring() – Extracting Parts of Strings
🔹 Task Ideas:
Extract First Name and Last Name from "Mayuri Dandhare" using substring() and indexOf(" ").
Get domain from an email like "abc@gmail.com" → Output: "gmail.com".
From "2025-06-20", extract the year, month, and day separately.
Extract only the middle part from "<<Hello>>" → Output: "Hello".
From "RollNo-12345-Name", extract only the numeric part → Output: "12345".*/

class Task1
{
public static void main(String args[])
{
//1
String s="Mayuri Dandhare";
System.out.println("First name is :"+s.substring(0,6));
System.out.println("Last name is :"+s.substring(7));
System.out.println("Index of is  :"+s.indexOf(' '));
System.out.println("Index of is  :"+s.indexOf('D'));
System.out.println("-------------------------------------------------------");

//2
String email="abc@gmail.com";
System.out.println("email is : "+email.substring(email.indexOf('@')+1));
System.out.println("-------------------------------------------------------");

//3
String date="2025-06-20";
System.out.println("year is :"+date.substring(0,4));
System.out.println("month is :"+date.substring(5,7));
System.out.println("day is :"+date.substring(8,10));
System.out.println("-------------------------------------------------------");

//4
String s1="<<Hello>>";
System.out.println("Middle part of <<Hello>> is : "+s1.substring(2,7));
System.out.println("-------------------------------------------------------");

//5
String s2="RollNo-12345-Name";
System.out.println("extract only numeric part : "+s2.substring(7,12));
System.out.println("-------------------------------------------------------");

}
}