class DataType{
  int a;
  double price; // explain the code through comments and also explain the default values of instance variables
  char grade = 'A';
  String name = "Aakash bhagat";

  void show() {
    System.out.println("int : " + a);// default value of int is 0
    System.out.println("double : " + price);// default value of double is 0.0
    System.out.println("char : " + grade);// default value of char is '\u0000'
    System.out.println("String : " + name);// default value of String is null
  }
}
public class ClassWithDifferentDataType {
  public static void main(String[] args) {
    DataType dt = new DataType();
    dt.show();
  }
}
