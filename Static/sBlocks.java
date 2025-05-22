/* Static Block */ 
/* 
It is used to initalized the static data member. 
It is executed before the main() method or before creation of object. 
*/
class SBlock
{
   static 
   {
      System.out.println("Static Block Executed!");
   }
   public static void main(String args[])
   {
        System.out.println("Main Method Executed!");
   }
}
