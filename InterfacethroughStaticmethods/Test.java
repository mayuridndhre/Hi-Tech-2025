interface MyInterface {
    static void displayMessage() {
        System.out.println("Hello from static method in interface!");
    }
}

public class Test {
    public static void main(String[] args) {
        // MyInterface.displayMessage(); ← Correct usage
        MyInterface.displayMessage();

        // displayMessage(); ← Not allowed (no inheritance of static method)
    }
}