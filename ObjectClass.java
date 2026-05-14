class Laptop {
    String brand;
    int price;

    public String toString() {
        return "to string method called";
    }

    public boolean equals(Laptop that) {
        return this.price == that.price;
    }

    public int hashCode() {
        return price;
    }

    // Cannot override the getClass() method
    // as it is a final method in the
    // Object class
}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.brand = "HP";
        obj1.price = 50000;
        Laptop obj2 = new Laptop();
        obj2.brand = "HP";
        obj2.price = 50000;

        System.out.println(obj1);
        // System.out.println(obj1.toString());
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());
    }
}
