class Encap{
  private int age; // why we are using private? ans - We are using the private access modifier for the age variable to implement encapsulation. By making the age variable private, we restrict direct access to it from outside the class. This allows us to control how the age is set and accessed through public getter and setter methods. It helps to protect the integrity of the data by preventing unauthorized or invalid modifications to the age variable. Additionally, it allows us to add validation logic in the setter method to ensure that only valid values are assigned to the age variable, thus maintaining the consistency of the data.


  //setters
  void setAge(int age) {
    if(age < 0) // This is a simple validation check to ensure that the age cannot be set to a negative value, which is not valid. By using the setter method, we can control how the age is set and add any necessary validation or logic before assigning the value to the private variable. This helps to maintain the integrity of the data and prevents invalid values from being assigned to the age variable.
      System.out.println("Invalid age. Please enter a valid age.");
    else
      this.age = age; // The this keyword is used to refer to the current instance of the class
  }



  //getters
  int getAge() {
    return age;
  }

  void printAge() {
    System.out.println("your age is - " + getAge());
  }
}
public class Encapsulation {
  public static void main(String[] args) {
    Encap e = new Encap();
    // e.age = 25; // This will cause a compilation error because age is private
    e.setAge(-25);// This is the correct way to set the age using the setter method
    e.printAge();
    // Encapsulation is the process of hiding the internal details of an object and providing a public interface to access and modify the data. It is achieved through the use of access modifiers (private, public, protected) and getter/setter methods. Encapsulation helps to protect the integrity of the data by preventing direct access to it and allows for better control over how the data is accessed and modified. It also promotes code reusability and maintainability by allowing changes to be made to the internal implementation without affecting the external interface.
  }
  
}
