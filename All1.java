class Student {
  String name;
  int age;

  void display() {
    System.out.println("Name : " + name + ", Age :" + age);
  }
}

class Car {
  String brand;
  double price;

  void showDetails() {
    System.out.println("Brand : " + brand + ", Price :" + price);
  }
}
public class All1 {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Alice";
    s1.age = 20;
    s1.display();

    Car c1 = new Car();
    c1.brand = "Toyota";
    c1.price = 25000.0;
    c1.showDetails();
  }
}
