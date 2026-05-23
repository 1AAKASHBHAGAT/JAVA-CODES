class Car {
  String brand;
  double price;

  void showDetails() {
    System.out.println("Brand : " + brand);
    System.out.println("Price : " + price);
    
  }
}
public class Cars {
  public static void main(String[] args){
    Car c1 = new Car();
    c1.brand = "BMW";
    c1.price = 5000000;
    c1.showDetails();
  }
}
  


