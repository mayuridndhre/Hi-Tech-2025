/*Write a program to check whether a person is eligible to vote or Not using switch statement*/

class Gender2
{
public static void main(String args[])
{

String gen="Male";

switch(gen)
{
case "Male":
case "male":
System.out.println("Male");
break;

case "Female":
case "female":
System.out.println("Female");
break;

default:
System.out.println("Invalid");
}
}
}