class Parent {
    void print(int x) {
        System.out.println("the value of x = " + x);
    }

    void show() {
        System.out.println("parent show function");
    }
}

class Child extends Parent {
    void print(int x) {
        System.out.println("double of x is = " + 2 * x);
    }

    void show() {
        System.out.println("child show function");
    }
}

public class Override {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.show();
        ch.print(3);

        // Reference of Parent, Object of Child
        Parent p = new Child();
        // Method of Child will Run
        p.print(4);
    }
}
