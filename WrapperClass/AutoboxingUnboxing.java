/*Task 3: Mixed Autoboxing & Unboxing
Objective:
Write a method that accepts an Integer (wrapper) and internally performs arithmetic with primitive int.
Steps:
Create a method square(Integer num) that returns num * num.
Pass a primitive int value to this method (autoboxing will happen).
Inside the method, unboxing will occur automatically for the arithmetic.
Print the squared value.*/

class AutoboxingUnboxing
{

		int square(Integer num)
		{
		return num * num;
		}
		
		
		public static void main(String args[])
		{
			AutoboxingUnboxing a=new AutoboxingUnboxing();
			System.out.println(a.square(5));
		}
	
}
