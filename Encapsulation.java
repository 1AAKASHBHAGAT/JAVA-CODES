class Encap{
  int age;

  void printAge() {
    System.out.println("your age is - " + age);
  }
}
public class Encapsulation {
  public static void main(String[] args) {
    Encap e = new Encap();
    e.age = 25;
    e.printAge();
    // Encapsulation is the process of hiding the internal details of an object and providing a public interface to access and modify the data. It is achieved through the use of access modifiers (private, public, protected) and getter/setter methods. Encapsulation helps to protect the integrity of the data by preventing direct access to it and allows for better control over how the data is accessed and modified. It also promotes code reusability and maintainability by allowing changes to be made to the internal implementation without affecting the external interface.
  }
  
}
