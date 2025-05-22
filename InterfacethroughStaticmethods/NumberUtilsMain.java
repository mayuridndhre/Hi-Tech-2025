/*ask 3: Number Checker
Interface: NumberUtils
Task: Add a static method isEven(int num) to check if a number is even.
Test: Use it in the main() method with different values.*/
interface NumberUtils
{
static void isEven(int num)
{
if(num%2==0)
{
System.out.println("Number is Even");
}
else
{
System.out.println("Number is odd");
}
}
}
class NumberUtilsMain
{
public static void main(String args[])
{
NumberUtils.isEven(6);
}
}