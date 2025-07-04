/*Task 4: Lexicographical Comparison Using .compareTo()
Objective:
Take two strings and compare them lexicographically using .compareTo().
🔹 Example: "apple".compareTo("banana")
🔹 Output: Negative value (because "apple" comes before "banana")*/

import java.util.Scanner;

class CompareToMethod
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First String");
String x=sc.nextLine();

System.out.println("Enter Second String");
String x1=sc.nextLine();


int result = x.compareTo(x1);

        if (result < 0) {
			System.out.println(result);
            System.out.println("Bcoz first String comes before second string");
        } else if (result > 0) {
			System.out.println(result);
            System.out.println("Bcoz first String comes after second string");
        } else {
			System.out.println(result);
            System.out.println("Bcoz Both strings are equal.");
        }

        sc.close();

}
}