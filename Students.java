class Student {
  String name;
  int age;
  void display() {
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
  }
}
public class Students {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Aakash bhagat";
    s1.age = 19;
    
    s1.display();
  }
}
