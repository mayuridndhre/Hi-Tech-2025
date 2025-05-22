package mypackage1;


public class TestDefaultAccess {
    public static void main(String args[])
    {
        DefaultAccessDemo obj=new DefaultAccessDemo();    //allowed(same package)
        obj.showMessage();  //allowed(same package)
        
    }
}
