/*Task 5: Concatenate Using format() Method
Objective: Use String.format() to build a full sentence from string variables.
📌 Task:
If name = "Bhushan" and course = "DevOps", create a sentence:
"Hello Bhushan, welcome to the DevOps course!"*/

class UsingFormatMethod
{
public static void main(String args[])
{
String name="Bhushan";
String course="DevOps";

String result=String.format("%s %s",name,course);
System.out.println("Hello "+name+", welcome to the "+course+" course! ");
}
}