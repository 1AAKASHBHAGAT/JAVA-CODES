import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long sum = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            int reading = sc.nextInt();

            if (reading >= 0) {
                sum += reading;
                count++;
            }
        }

        if (count == 0) {
            System.out.printf("%.1f%n", 0.0);
        } else {
            double average = (double) sum / count;
            System.out.printf("%.1f%n", average);
        }

        sc.close();
    }
}