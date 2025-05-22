/*Task 5: Static Method with List
Interface: ListUtils
Task: Add a static method printList(List<String> items) that prints all items line-by-line.
Test: Call it with a list of 5 strings.*/
interface ListUtils
{
static void printList(String[] items)
{
  // Using for-each loop to print each item in the list
     for (String item : items)
     {
     System.out.println(item);
     }
}
class ListUtilsMain
{
public static void main(String args[])
{
List<String> myItems = List.of("Pen", "Pencil", "Eraser", "Sharpener", "Notebook");
ListUtils.printList(myItems);
}
}