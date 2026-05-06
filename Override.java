class Parent {
    void print(int x) {
        System.out.println("the value of x = " + x);
    }
    Parent(int x) {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("parent show function");
    }
}

class Child extends Parent {
    void print(int x) {
        System.out.println("double of x is = " + 2 * x);
    }

    Child() {
        super(10); // Calls Parent constructor with argument 10
        System.out.println("Child constructor");
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
        //Parent p = new Child();
        // Method of Child will Run
        //p.print(4);
    }
}
