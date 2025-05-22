class Parent {
    {
        System.out.println("Parent Instance Block");
    }

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    {
        System.out.println("Child Instance Block");
    }

    Child() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}