/*2. toUpperCase() – Convert to Capital Letters
🔹 Task Ideas:
Convert "welcome to java programming" to all uppercase.
Convert only the first 3 letters to uppercase, rest lowercase.
Input your name in lowercase, convert to uppercase.
From a list of names, print only those in uppercase.
Make a menu title uppercase: "main menu" → "MAIN MENU".*/

import java.util.Scanner;

class Task2
{
public static void main(String args[])
{
//1 and 2
System.out.println("-------------------------------------------------------");
String name="welcome to java programming";
System.out.println("Convert it to uppercase : "+name.toUpperCase());
String firstthree=name.substring(0,3).toUpperCase();
String rest=name.substring(3).toLowerCase();
System.out.println("First three Uppercase : "+firstthree + rest);
System.out.println("-------------------------------------------------------");

//3
Scanner sc=new Scanner(System.in);
System.out.println("Input your name in lower case");
String n =sc.nextLine();
System.out.println("convert it in uppercase : " +n.toUpperCase());
System.out.println("-------------------------------------------------------");

//4
String list[]={"MAYURI","TINA","mahi","Tejas"};
System.out.println("From this list print only names which is in uppercase : ");
for(String nm:list)
{
	if(nm.equals(nm.toUpperCase()))
	{
		System.out.println(nm);
	}
}
System.out.println("-------------------------------------------------------");



//5
String menutitle="main menu";
System.out.println("convert it in uppercase : "+menutitle.toUpperCase());
System.out.println("-------------------------------------------------------");

}
}