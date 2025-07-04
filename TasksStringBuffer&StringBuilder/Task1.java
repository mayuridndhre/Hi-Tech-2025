/* 4 july Friday 1. String (Immutable)Task:
Write a Java program that:
Accepts a full name from the user
Splits it into first name and last name
Converts both to uppercase
Prints the initials
Example Input:
Bhushan Topre
Output:
Initials: B.T*/

import java.util.Scanner;

class Task1
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name : ");
        String fullName = sc.nextLine();
		System.out.println(fullName);
       
        String[] names = fullName.split(" ");
		if(names.length>=2)
		{
			char firstinitial=Character.toUpperCase(names[0].charAt(0));
			char lastinitial=Character.toUpperCase(names[1].charAt(0));
			
			System.out.println("Initials : "+firstinitial+ ". "+lastinitial);
		}
		else
		{
			System.out.println("Please enter both first and last name");
		}
		
		sc.close();
		
		}
}