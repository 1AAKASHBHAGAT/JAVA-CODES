class Animal {
    void sound() {
        System.out.println("animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("dog barks");
    }

    void eat() {
        System.out.println("dog eats");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("cat meows");
    }

    void sleep() {
        System.out.println("cat sleeps");
    }
}

class Bird {
    void sound() {
        System.out.println("bird chirps");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal a = new Dog();
        // safe downcasting - jiska object thha
        // usi ka reference wapas le aaye
        Dog d = (Dog) a;
        a.sound();
        d.eat();
        double x = 10.45;
        int y = (int) x;

        Animal b = new Cat();
        Dog d1 = (Dog) b;
        // unsafe downcasting - jiska object thha uska object nahi bana
        // CLASS CAST EXCEPTION
        b.sound();
        d1.sleep();

        // Animal c = new Bird();
        // c.sound();
        // no inheritence therefore error

        // konsa overridden method chalana hai
        // runtime pe decide karo based on object
        // dynamic method dispatch

    }
}