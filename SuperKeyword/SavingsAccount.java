/*Practice Task 5: Real-world Simulation
Task:
Create a class BankAccount with a constructor and method accountDetails().
Create a subclass SavingsAccount with its own constructor and override accountDetails().
Use super() to call the parent constructor and super.accountDetails() inside the overridden method.*/

class BankAccount
{
BankAccount()
{
System.out.println("Parent class constructor");
}
void accountDetails()
{
System.out.println("Parent class Method");
}
}
class SavingsAccount extends BankAccount
{
SavingsAccount()
{
//super();---automatically called previous constructor
System.out.println("Child class constructor");
}
void accountDetails()
{
super.accountDetails();
System.out.println("Child class Method");
}

public static void main(String args[])
{
SavingsAccount s=new SavingsAccount();
s.accountDetails();
}
}