//Example 2: Method Overloading by Changing Data Type
class OverloadExample {
    void display(int num) {
        System.out.println("Integer: " + num);
    }

    void display(double num) {
        System.out.println("Double: " + num);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display(10);
        obj.display(10.5);
    }
}