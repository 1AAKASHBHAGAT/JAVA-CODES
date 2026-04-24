import java.util.*;

public class String1 {
    public static void main(String[] args) {
        // 1. Creation
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println(s1);
        System.out.println(s2);

        // 2. Comparison; - .equals() - returns boolean
        System.out.println(s1.equals(s2));

        // q. check admin;
        String user = "admin";
        String pass = "test@123";

        // Scanner sc = new Scanner(System.in);
        // String username = sc.nextLine();
        // String password = sc.nextLine();

        // if (username.equals(user) && password.equals(pass)) {
        // System.out.println("welcome admin");
        // } else {
        // System.out.println("invalid credentials");
        // }

        // 3. methods
        // length; - returns int
        System.out.println(s1.length());

        // toUpperCase; - returns String
        System.out.println(s1.toUpperCase());

        // toLowerCase; - returns String
        System.out.println(s1.toLowerCase());

        // chatAt - return char;
        System.out.println(s1.charAt(1));

        // concat - add 2 strings
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));

        // q - print a string character by character;
        String str = "hello world";
        System.out.println(str.charAt(5));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // string is immutable
        String s = "hello";
        s.concat("world");
        // changes are happening in a new object
        // but not in orginal string, hence immutable;
        System.out.println(s);

        // 4. string buffer and string builder

    }
}
