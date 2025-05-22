//Create package models → Class User with user info.

package models;
public class User
{
public String name;
public String email;

public User(String name,String email)
{
this.name=name;
this.email=email;
}
public void displayInfo()
{
System.out.println("User Name is : " +name);
System.out.println("User email is :"+email);
}

}
