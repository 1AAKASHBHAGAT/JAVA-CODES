import java.util.*;
public class strings1 {
    public static void main(String[] args) {
        String one = "hello";
        String two = new String("hi"); //2nd method to declare and initialize string...
        if(one.equals(two)){
            System.out.println("same");
        }
        else System.out.println("different");

        //length of string
        System.out.println(one.length()); //ye int deta h..

        //concat 2 strings
        System.out.println(one.concat(two));
        System.out.println(one + two);

        //convert to uppercase
        System.out.println(one.toUpperCase()); //ye string deta h..

         //convert to lowercase
        System.out.println(one.toLowerCase()); //ye string deta h..

        //access character at index
        System.out.println((one.charAt(1)));//ye character deta h..

        //q - take a string input from user and print its individual characters?
    
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " "); //Java me string access karne ke liye charAt(i) use hota hai, s[i] nahi bcz 
        } //java me string array nhi hota isliye direct indexing allowed nahi hota i.e s[i] not allowed..
    }
}