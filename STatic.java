class Student {
  int erp;
  String name;
  static String college = "RISU";

  //static method
  static void displayCollege() {
    System.out.println(college); //difference between static method and non static method 5 marks 5 points ; ans - static method belongs to the class and can be called without creating an instance of the class, while non-static method belongs to an instance of the class and requires an object to be called. Static methods can only access static variables and other static methods, while non-static methods can access both static and non-static variables and methods. Static methods cannot use the 'this' keyword, while non-static methods can use it to refer to the current object. Static methods are often used for utility or helper functions that do not require any instance-specific data, while non-static methods are used for operations that depend on the state of a specific object. Static methods are shared among all instances of the class, while non-static methods are unique to each instance.
  }

}
public class STatic {// diference between staticvariable and non static variables 5 marks 5 points ; ans - static variable is shared by all objects of the class, while non-static variable is unique to each object. Static variables are accessed using the class name, while non-static variables are accessed using object references. Static variables are initialized only once, while non-static variables are initialized for each object created. Static variables can be accessed without creating an instance of the class, while non-static variables require an instance to be accessed. Static variables are stored in a common memory location, while non-static variables are stored in individual memory locations for each object. 
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.erp = 1;
    s1.name = "Alice";
    System.out.println(s1.erp);
    System.out.println(s1.name);
    Student.displayCollege();
  }
  
}
