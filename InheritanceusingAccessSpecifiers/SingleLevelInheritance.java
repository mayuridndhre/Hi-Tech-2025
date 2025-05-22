class Animal
{
private String privateVar="Private Variable";
String defaultVar="Default Variable";
protected String protectedVar="Protected Variable";
public String publicVar="Public Variable";

public Animal()
{
System.out.println("Animal Constructor Called");
}

private void privateMethod()
{
System.out.println("This is a private method");
}

void defaultMethod()
{
System.out.println("Default Method :"+defaultVar);
}

protected void protectedMethod()
{
System.out.println("Protected Method :" +protectedVar);
}

public void publicMethod()
{
System.out.println("public Method:"+publicVar);
}
}
class Dog extends Animal
{
public Dog()
{
System.out.println("Dog Constructor Called");
}

public void showAccess()
{
        System.out.println("Accessing Default Variable: " + defaultVar);
        System.out.println("Accessing Protected Variable: " + protectedVar);
        System.out.println("Accessing Public Variable: " + publicVar);


defaultMethod();
protectedMethod();
publicMethod();
}
}

public class SingleLevelInheritance
{
public static void main(String args[])
{
Dog d=new Dog();
d.showAccess();
}

}
