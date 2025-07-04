/*3. toLowerCase() – Convert to Small Letters
🔹 Task Ideas:
Convert "HELLO JAVA" to lowercase.
Create a login system: match email ignoring case (e.g., "MyEmail@domain.com").
Read a string in mixed case and convert to lowercase.
Convert every name from an array to lowercase and store them.
Convert "WELCOME" → "welcome" using toLowerCase() and print charAt(0).*/

import java.util.*;

class Task3
{
public static void main(String args[])
{
//1
String name="HELLO JAVA";
System.out.println(name.toLowerCase());
System.out.println("-------------------------");

//2
Scanner sc=new Scanner(System.in);
String correctmail="MYEmail@domain.com";
System.out.println("Enter your email");
String mail=sc.nextLine();

if(mail.equalsIgnoreCase(correctmail))
{
	System.out.println("Successful");
}
else
{
	System.out.println("Fail");
}
System.out.println("-------------------------");

//3
System.out.println("Enter mixed case String :");
String mixed=sc.nextLine();
System.out.println(mixed.toLowerCase());
System.out.println("-------------------------");

//4
String names[]={"MAYURI","TINA","ROHAN","HARSH"};
for(int i=0;i<names.length;i++)
{
	System.out.println("Convert this in lower case : "+names[i].toLowerCase());
}
System.out.println("-------------------------");

//5
String a="WELCOME";
String a1=a.toLowerCase();
System.out.println(a1);
System.out.println("Print first character : "+a1.charAt(0));
}
}