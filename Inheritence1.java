class Pet { //parent class
  String name;
  int age; // private int age; // if we make it private then it cannot be accessed by the child class and we need to use getter and setter methods to access it

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

void Meow() {
  System.out.println("meowwwwww.......");
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
    c.Meow(); // from Pet class // inherited
    c.Meow(); // from Cat class // unique
  }
  
}
