public class Main
{
public static void main(String args[])
{
 Employee e=new Employee();
 //Setting values using setter methods 
 e.setName("Mayuri");
 e.setAge(22);
 //getting values using getter methods
 System.out.println("Employee Name : "+e.getName());
 System.out.println("Employee Age : "+e.getAge());
 //trying to set invalid age
 e.setAge(15);
 
 
}
}