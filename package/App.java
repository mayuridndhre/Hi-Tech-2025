//Create a main class App in package main that imports and uses all the above.*/
package main;
import services.UserService;
public class App
{
public static void main(String args[])
{
UserService us=new UserService();
us.registerUser("Mayuri","mayuridandhare62@gmail.com");

}
}