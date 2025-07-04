/*Task 4: Concatenate Using String.join()
Objective: Join multiple strings using a delimiter (like space or comma).
📌 Task:
Use String.join(" ", "AWS", "Jenkins", "Terraform")
Expected Output: AWS Jenkins Terraform*/

class UsingStringJoinEx
{
public static void main(String args[])
{
String s="AWS";
String s1="Jenkins";
String s2="Terraform";

String result=String.join(" ",s,s1,s2);
System.out.println(result);
}
}