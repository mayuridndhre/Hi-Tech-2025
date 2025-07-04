/* 23 June Monday Task 3: Insert a Word in the Middle
Objective: Use insert() method.
📌 Steps:
Start with: "Dev Life"
Insert "Ops " after "Dev " to make: "Dev Ops Life"
Print the final string.*/

class Task3
{
public static void main(String args[])
{
StringBuffer b1=new StringBuffer("Dev Life");
b1.insert(4,"Ops ");
System.out.println(b1);
}
}
