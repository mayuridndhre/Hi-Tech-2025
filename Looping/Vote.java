/*Write a program to check whether a person is eligible to vote or Not using switch statement*/

class Vote
{
public static void main(String args[])
{
int age=20;

int eligible=(age>=18)?1:0;

switch(eligible)
{
case 1:
System.out.println("your are eligible for voting");
break;

case 0:
System.out.println("you are not eligible for voting");
break;

default:
System.out.println("Invalid");
}
}
}