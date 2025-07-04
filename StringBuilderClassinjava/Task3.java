/* 3 July Thursday Using StringBuilder Task 3: Insert a Word in the Middle
Objective: Use insert() method.
📌 Steps:
Start with: "Dev Life"
Insert "Ops " after "Dev " to make: "Dev Ops Life"
Print the final string.*/

class Task3
{
public static void main(String args[])
{
StringBuilder b1=new StringBuilder("Dev Life");
b1.insert(4,"Ops ");
System.out.println(b1);
}
}
