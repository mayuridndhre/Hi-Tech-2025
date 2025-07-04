/* 23 June Monday Task 4: Replace a Word in a Sentence
Objective: Use replace(start, end, str).
📌 Steps:
Original String: "Learning Java is fun"
Replace "Java" with "DevOps" using replace().
Output: "Learning DevOps is fun"*/

class Task4
{
public static void main(String args[])
{
StringBuffer b1=new StringBuffer("Learning Java is fun");
b1.replace(9,14,"DevOps ");
System.out.println(b1);
}
}