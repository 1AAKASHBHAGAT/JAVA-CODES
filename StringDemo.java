import java.util.Scanner;

public class StringDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String one = "hello";
    String two = "hello";

    boolean result = one.equals(two);
    System.out.println(result);  // true
    
    sc.close();
  }
}
