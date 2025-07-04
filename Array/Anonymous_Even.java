/*Task 2: Count Even Numbers
Objective: Pass an anonymous array to a method that returns the count of even numbers.*/

public class Anonymous_Even {
    static int countEven(int a[]) 
	{ 
        int count = 0; 

        for (int i : a) {
            if (i % 2 == 0)
			{ 
			
                count++;
            }
        }

        return count; 
    }

    public static void main(String args[]) {
        int result = countEven(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}); 
        System.out.println("Count of even numbers: " + result);
    }
}
