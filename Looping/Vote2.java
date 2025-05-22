/*Write a program to check whether a person is eligible to vote or Not using switch statement*/

class Vote2
{
public static void main(String args[])
{
int age=20;
String eligible=" ";

switch(age)
{
case 'm':
case 'M':
case "Male":
case "male":
System.out.println("your are eligible for voting");
break;

case 'f':
case 'F':
case "Female":
case "female":
System.out.println("you are not eligible for voting");
break;

default:
System.out.println("Invalid");
}
}
}