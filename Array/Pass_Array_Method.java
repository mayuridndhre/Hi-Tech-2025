//Parsing Array to a method in java
 
 
 public class Pass_Array_Method
 {
  static void min(int a[])
  {
   int min=a[0];
   for(int i=1;i<a.length;i++)
   {
    if(min>a[i])
    {
      min=a[i];
    }
   }
   System.out.println("Minimum value in the array is : "+min);
 }
 
 public static void main(String args[])
 {
   int a[]={33,4,5,6};
   min(a);
 }
}
