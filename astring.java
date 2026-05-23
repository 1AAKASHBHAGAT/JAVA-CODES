import java.uastringanner;

public class StringDemo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String user = "admin";
    String pass = "test@123";

    // Take input from user
    System.out.print("Enter username: ");
    String username = sc.nextLine();

    System.out.print("Enter password: ");
    String password = sc.nextLine();

    // Login check
    if(user.equals(username) && pass.equals(password)) {
      System.out.println("Login successful ");
    } else {
      System.out.println("Invalid credentials");
    }

    // String comparison demo
    String one = "hello";
    String two = new String("hi");

    boolean result = one.equals(two);
    System.out.println("Are strings equal? " + result);

    sc.close();
  }
}
