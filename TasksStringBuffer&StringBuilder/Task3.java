/*3. StringBuilder (Mutable, Not Synchronized)Task:
Write a program that:
Builds a string dynamically using StringBuilder
Appends 5 numbers (1 to 5) with commas
Replaces the last comma with a period
Output:
1,2,3,4,5.*/

class Task3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        
        for (int i = 1; i <= 5; i++) {
            sb.append(i).append(",");
        }

        
        int lastIndex = sb.lastIndexOf(",");  
        sb.replace(lastIndex, lastIndex + 1, ".");

        
        System.out.println(sb.toString());  
    }
}
