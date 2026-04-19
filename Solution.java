public import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        // input array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // print array using built-in method
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
 
  
}
