class Person {  //question 1 write a java program to demonstrate single inheritance using a base class person  with private data members (name, age) and public member functions to access them. Derive a class Student that adds roll number and marks. Display all details.
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

class Student extends Person {
  private int rollNumber;
  private double marks;

  public Student(String name, int age, int rollNumber, double marks) {
    super(name, age);
    this.rollNumber = rollNumber;
    this.marks = marks;
  }

  public int getRollNumber() {
    return rollNumber;
  }

  public double getMarks() {
    return marks;
  }
}
 
public class Single {
  public static void main(String[] args) {
    Student student = new Student("Alice", 20, 101, 85.5);
    System.out.println("Name: " + student.getName());
    System.out.println("Age: " + student.getAge());
    System.out.println("Roll Number: " + student.getRollNumber());
    System.out.println("Marks: " + student.getMarks());
  }
}