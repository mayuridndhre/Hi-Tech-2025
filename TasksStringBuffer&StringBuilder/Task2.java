/*2. StringBuffer (Mutable, Synchronized)Task:
Write a Java program that:
Accepts a sentence
Reverses the entire sentence using StringBuffer
Deletes the first 5 characters and inserts "Hello " at index 0
Input:
Java is awesome
Output:
Hello emosewa si av*/

class Task2
{
public static void main(String args[])
{
StringBuffer b1=new StringBuffer("Java is awesome");
b1.reverse();
System.out.println(b1);
}
}