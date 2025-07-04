import java.util.Scanner;

class ScannerDemo
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);


//System.out.println("Enter First no : ");
int a=sc.nextInt();
//System.out.println("Enter Second no : ");
int b=sc.nextInt();
int sum=a+b;
System.out.println("Addition of two nos is :"+sum);
}
}