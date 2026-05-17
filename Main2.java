class Car {

    String brand;
    String color;
    int speed;

    void start() {
        System.out.println(brand + " car started");
    }

    void details() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }
}

public class Main2 {

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.brand = "BMW";
        c1.color = "Black";
        c1.speed = 180;

        c1.start();
        c1.details();
    }
}
