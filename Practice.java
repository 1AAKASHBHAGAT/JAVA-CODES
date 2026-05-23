import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Choose problem number
        int choice = sc.nextInt();

        switch (choice) {

            // 1. Typecasting Double to Integer
            case 1: {
                double n = sc.nextDouble();
                int result = (int) n;
                System.out.println(result);
                break;
            }

            // 2. Grade Calculator
            case 2: {
                int score = sc.nextInt();

                if (score >= 90) System.out.println("A");
                else if (score >= 80) System.out.println("B");
                else if (score >= 70) System.out.println("C");
                else System.out.println("F");

                break;
            }

            // 3. Salary Breakdown
            case 3: {
                int ctc = sc.nextInt();

                int hra = (ctc * 20) / 100;
                int pf = (ctc * 10) / 100;
                int insurance = (ctc * 5) / 100;
                int other = (ctc * 5) / 100;
                int takeHome = (ctc * 60) / 100;

                System.out.println("CTC: " + ctc);
                System.out.println("HRA: " + hra);
                System.out.println("PF: " + pf);
                System.out.println("Insurance: " + insurance);
                System.out.println("Other Charges: " + other);
                System.out.println("Take-home Salary: " + takeHome);

                break;
            }

            // 4. Candy Overtime
            case 4: {
                int X = sc.nextInt();
                int Y = sc.nextInt();

                int earnings;
                if (Y <= X) earnings = Y;
                else earnings = X + (Y - X) * 2;

                System.out.println(earnings);
                break;
            }

            // 5. Pass/Fail
            case 5: {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();

                int avg = (A + B + C) / 3;

                if (A >= 35 && B >= 35 && C >= 35 && avg >= 50)
                    System.out.println("PASS");
                else
                    System.out.println("FAIL");

                break;
            }

            // 6. Recipe Decoder
            case 6: {
                sc.nextLine(); // consume newline
                String s = sc.nextLine();

                int countA = 0, countB = 0;

                for (char ch : s.toCharArray()) {
                    if (ch == 'A') countA++;
                    else if (ch == 'B') countB++;
                }

                if (countA == countB) System.out.println("YES");
                else System.out.println("NO");

                break;
            }

            // 7. Longest Streak
            case 7: {
                int N = sc.nextInt();

                int current = 0, max = 0;

                for (int i = 0; i < N; i++) {
                    int val = sc.nextInt();

                    if (val > 0) {
                        current++;
                        max = Math.max(max, current);
                    } else {
                        current = 0;
                    }
                }

                System.out.println(max);
                break;
            }

            // 8. Crowded Restaurant
            case 8: {
                int N = sc.nextInt();
                int K = sc.nextInt();

                int current = 0, count = 0;

                for (int i = 0; i < N; i++) {
                    current += sc.nextInt();

                    if (current > K) count++;
                }

                System.out.println(count);
                break;
            }

            // 9. Triangle Validity
            case 9: {
                long A = sc.nextLong();
                long B = sc.nextLong();
                long C = sc.nextLong();

                if (A + B > C && A + C > B && B + C > A)
                    System.out.println("YES");
                else
                    System.out.println("NO");

                break;
            }

            default:
                System.out.println("Invalid Choice");
        }
    }
}