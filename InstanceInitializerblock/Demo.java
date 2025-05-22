public class Demo {

    // First instance initializer block
    {
        System.out.println("Instance Block 1");
    }

    // Constructor
    Demo() {

        System.out.println("Constructor");
    }

    // Second instance initializer block
    {
        System.out.println("Instance Block 2");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
    }
}