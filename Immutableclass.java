class person {
  private String name;
  private int age;
  
  public person(String name, int age) {
    this.name = name;
    this.age = age; 
  }

  person(person p) {
    this.name = p.name;
    this.age = p.age;
  }

  //setter
  void setName(String name) {
    this.name = name;
  }

  void setAge(int age) {
    this.age = age;
  }

  //getter
  String getName() {
    return this.name;
  }

  int getAge() {
    return this.age;
    // immutable since the value of name and age cannot be changed once the object is created, and any modifications to the object will result in the creation of a new object rather than changing the existing one.
  //p1 and p2 are two different objects, and modifying p1 does not affect p2, which demonstrates the immutability of the person class.
//value of name and age cannot be changed once the object is created, and any modifications to the object will result in the creation of a new object rather than changing the existing one.  
}
}

   
public class Immutableclass {
  public static void main(String[] args) {
    person p1 = new person("Alice", 30);
    person p2 = new person(p1); // creating a new object using the copy constructor

    System.out.println("Name: " + p1.getName() + ", Age: " + p1.getAge()); // Output: Name: Alice, Age: 30
    System.out.println("Name: " + p2.getName() + ", Age: " + p2.getAge()); // Output: Name: Alice, Age: 30

    // Modifying p1's name and age
    p1.setName("Bob");
    p1.setAge(25);

    System.out.println("Name: " + p1.getName() + ", Age: " + p1.getAge()); // Output: Name: Bob, Age: 25
    System.out.println("Name: " + p2.getName() + ", Age: " + p2.getAge()); // Output: Name: Alice, Age: 30 (p2 remains unchanged)
  }
  
}
