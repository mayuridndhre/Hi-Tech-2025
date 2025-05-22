//Example 1: Method Overloading by Changing Parameters
class MathOperations {
    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println("Sum (2 args): " + obj.add(5, 10));  
        System.out.println("Sum (3 args): " + obj.add(5, 10, 15));  
    }
}