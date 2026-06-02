import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String keyword = sc.nextLine().toLowerCase();
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        int count = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(keyword)) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}