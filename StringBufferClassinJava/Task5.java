/*Task 5: Delete a Part of the String
Objective: Use delete(start, end).
📌 Steps:
Start with: "Error: File Not Found"
Delete "Error: " part using delete().
Output: "File Not Found"*/

class Task5
{
public static void main(String args[])
{
StringBuffer b1=new StringBuffer("Error: File Not Found");
b1.delete(0,7);
System.out.println(b1);
}
}