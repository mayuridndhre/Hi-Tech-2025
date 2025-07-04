/*Object cloning
-------------------
Object cloning is nothing but the way to create excatcopy of an object. the clone() of Object class is used to create the clone of an object.  */

class Employee implements Cloneable 
{
       int id;
       String name;
       Employee(String name, int id)
       {
                  this.name = name ;
				  this.id = id; 
        }	   
		 public Object clone()throws CloneNotSupportedException
		{
		       return super.clone(); 
		}
}
public class Main_Clone
{
     public static void main(String args[])
	 {
	        try
			 {
			          Employee e1 = new Employee("Bhushan",101);
					  System.out.println("Name: "+e1.name+"\t"+e1.id);
					  
					  Employee e2 = (Employee)e1.clone(); 
					  System.out.println("Name: "+e2.name+"\t"+e2.id);
					  
			 }catch(CloneNotSupportedException c)
			 {
			    
			 }
	 }
}