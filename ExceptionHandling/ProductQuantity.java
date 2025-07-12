/*Practice Task 5: Product Quantity Check
Objective: Create exception if ordered quantity exceeds available stock.
Instructions:
Assume stock = 50.
If user enters quantity > 50, throw OutOfStockException.*/
import java.util.Scanner;
import java.util.InputMismatchException;java
class OutOfStockException extends Exception
{
public OutOfStockException(String message)
{
super(message);
}
}
class ProductQuantity
{
public static void main(String args[])
{
int stock=50;
Scanner sc=new Scanner(System.in);
try
{
System.out.println("Enter Quantity : ");
int quantity=sc.nextInt();

if(quantity>50)
throw new OutOfStockException("Item out of Stock");
else
System.out.println("Available");
}
catch(InputMismatchException e)
{
System.out.println("Invalid input : Please enter a valid input");
}
catch(OutOfStockException e)
{
System.out.println(e.getMessage());
}

}
}