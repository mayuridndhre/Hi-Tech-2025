/* write a program to read gender(M/F)and print the corresponding gender using a switch statement.*/

class Gendercheck
{
public static void main(String args[])
{
String m="female";

switch(m)
{
case "male":
System.out.println("male");
break;

case "female":
System.out.println("female");
break;

default:
System.out.println("Invalid");
}
}
}