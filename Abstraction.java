abstract class Parent {
  abstract void print();

  //  constructor - yes it supports constructors
  Parent() {
    System.out.println("parent class constructor");
  }
  String name; // abstract class must have an abstract method
  int age;
 void show(){
  System.out.println("show");
 }
}

class child extends Parent{
  void print(){
    System.out.println("child class Overriding the abstract method"); // because we want the funtion body as well therefore
    // no abstract method
    }
    child() {
      super();
      System.out.println();
}
}

public class Abstraction {
  public static void main(String[] args) {
    System.out.println("Abstraction");
    // Parent pa = new Parent();
    child ch = new child();
    ch.print();
    ch.name = "john";
    ch.age = 19;
    ch.show();
    Parent p = new child();
    p.print();

    // abstract method - no body;
    // abstract method - abstract class;
    // abstract class - inheritence;
    //  inheritence - overriding;

  }
}
