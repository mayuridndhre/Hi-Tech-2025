/*5. charAt() – Access Characters by Index
🔹 Task Ideas:
Print the first, middle, and last characters of any given string.
Input a string and check if the 1st character is uppercase or not.
Count how many vowels are in "Mayuri" using charAt() in a loop.
Input a 5-letter word and print each letter with its position using charAt().
Input PAN number (ABCDE1234F) and verify if 4th character is a digit.*/

import java.util.*;

class Task5
{
public static void main(String args[])
{
//1
String name="Mayurii";
System.out.println("First character : "+name.charAt(0));
System.out.println("Middle character : "+name.charAt(name.length()/2));
System.out.println("Last character : "+name.charAt(name.length()-1));

//2
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String name : ");
String n=sc.nextLine();
char ch=n.charAt(0);
if(Character.isUpperCase(ch))
{
	System.out.println("First character is uppercase ");
}
else
{
	System.out.println("First character is not uppercase ");
}

//3
int vowelCount = 0;
for (int i = 0; i < name.length(); i++) {
    char c = Character.toLowerCase(name.charAt(i));
    if ("aeiou".indexOf(c) != -1) {
        vowelCount++;
    }
}
System.out.println("Vowel count: " + vowelCount);

//4
String word = "Hello";
for (int i = 0; i < word.length(); i++) {
    System.out.println("Position " + (i + 1) + ": " + word.charAt(i));
}

//5
String pan = "ABCDE1234F";
char fourthChar = pan.charAt(3); // Index starts at 0
if (Character.isDigit(fourthChar)) {
    System.out.println("4th character is a digit.");
} else {
    System.out.println("4th character is not a digit.");
}
}
}