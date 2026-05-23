import java.util.Scanner;
class OddOrEven {
  public static void main(String[] args) {
    int n;
    System.out.println("enter any number");
    Scanner r=new Scanner (System.in);
    n = r.nextInt();
    if (n%2==0) {
      System.out.println( "number is even");
    }
    else {
      System.out.println("number is odd");
    }

    
    
  }
}