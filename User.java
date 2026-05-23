import java.util.Scanner;

public class User { 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String usera = sc.nextLine();

    for (int i = 0; i < usera.length(); i++){
      System.out.println(usera.charAt(i));
    }

    sc.close();
  }
}