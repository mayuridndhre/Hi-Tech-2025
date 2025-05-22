interface Printable {
    void print();
}

interface Showable {
    void show();
}

// Class implementing multiple interfaces
class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void show() {
        System.out.println("Showing document...");
    }
}

public class Test {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}