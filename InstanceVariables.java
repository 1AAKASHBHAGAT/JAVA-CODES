class Test {
  int a;
  double b;
  char c;
  String s;

  void display() {
    System.out.println("int : " + a);
    System.out.println("double : " + b); 
    System.out.println("char : " + c);
    System.out.println("String : " + s);
}
}
public class InstanceVariables {
  public static void main(String[] args) {
    Test t1 = new Test();
    t1.display(); // it prints default values of instance variables
  }
}
