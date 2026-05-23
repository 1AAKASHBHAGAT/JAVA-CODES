class Parent {

  int age;
  String name;

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

    // Constructor
    Child() {
        super(10); // Calls Parent constructor
        System.out.println("Child constructor");
    }

    // Method Overriding
    void print(int x) {
        System.out.println("double of x is = " + 2 * x);
    }

    void show() {
        System.out.println("child show function");
    }

    // ✅ Correct place for super usage
    void callParentFunction() {
        super.show();      // Parent show()
        super.print(5);    // Parent print()

       
    }
    void display(){
          System.out.println(super.name);
          System.out.println(super.age);
        }
    }


public class Override {
    public static void main(String[] args) {

        Child ch = new Child();

        ch.show();       // Child version
        ch.print(3);     // Child version

        ch.callParentFunction(); // Parent methods using super

        // Polymorphism example
        Parent p = new Child();
        p.print(4); // Calls Child's print()
    }
}