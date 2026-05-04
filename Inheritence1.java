class Pet { //parent class
  String name;
  int age;

}
class Dog extends Pet { // class childName extends parentclassname
  void bark() {
    System.out.println("barking......");
  }

void eat() {
  System.out.println("eating.......");
}
}

class Cat extends Pet {
  String name;
  int age;

void eat() {
  System.out.println("eating.......");
}
}
public class Inheritence1 {
  public static void main(String[] args){
    Dog d = new Dog();
    //has access to its own properties as well as the properties of the parent class Pet
    d.bark();//bark method of Dog class // unique
    d.eat(); // from Pet class // inherited
    Cat c = new Cat();
    //has access to its own properties as well as the properties of the parent class Pet
    c.eat(); // from Pet class // inherited
  }
  
}
