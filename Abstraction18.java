abstract class Adarsh{ // 1 . abstract method says that dont need body bracket ek phle vala part 2. if you have abstract class also reque=ie=red a abstrsct method 3.quired inheritance .4 must required over ride
    String name ;
    int age ; 
    abstract void print(); //if a any method is abstract of Class also should be Abstract 
    //Abstract class must need an abstract method
    void ad () { //abstract class can also contain normal method 
        System.out.println("Ad");

    } 
    Adarsh(){
    // isme constructer ban rha h study why because it also make object one of reason is usme normal method or variable bhi hai to unke liye ham constructer ka use kr skte hai vo normal vale method ko call karega 
    
    System.out.println("Parent clas constructer");
    
  }
    }
  
class aditya extends Adarsh { // child class must override the abstract method 
    // dont write abstract with print method here kyu ki hame yaha method ki body bhi chahiye or abstract lagagne pr bs vo brace ke phle vala aprt chaahiye rhta hai 
      void print() {
        System.out.println("Child class overridding the abstract method");
      }
}

public class Abstraction18 {
    public static void main(String[] args) {
       // Adarsh a1 = new Adarsh(); // abstract class ka object nahi banaya ja skta hai (research reason) Because we only declared method but dont tell that what it ahve to do it has incomplete Abstracct class is incomplete
       // a1.print();
        aditya a2 = new aditya(); // upcasting kr ke bhi call kr skte hai (Adarsh a2 = new aditya();) Parent reference Child object 
        a2.print();
        // abstract and final cant be use together because final means it caan not be reuse / overridde but abstract must need to override rather it will be incomplete forever
        a2.name="John";
        a2.ad(); // Abstract cant be directly call it can be call from the child object bcoz we cant make abstract class / parent class object 
        // parent p1 = new parent ();
        
    }
}


confuese ho jayga

    // abstract method - no body;
    // abstract method - abstract class;
    // abstract class - inheritence;
    //  inheritence - overriding;

  }
}
