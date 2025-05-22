//Create package services → Class UserService to register and show users.

package services;
import models.User;
import utils.DateUtil;

public class UserService
{
public void registerUser(String name,String email)
{
User u=new User(name,email);
u.displayInfo();
System.out.println("User Registered on :"+DateUtil.getCurrentDateTime());
}

}