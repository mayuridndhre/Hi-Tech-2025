//a) public boolean equals(Object another) : Compares this string to the specified object. 
class Equals
{
     public static void main(String args[])
	 {
	        String s1 = "Rohit"; 
			String s2 = "Rohit";
			String s3 = new String("Rohit");
			String s4 = "Sachin"; 
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			System.out.println(s1.equals(s4));			
	 }
}