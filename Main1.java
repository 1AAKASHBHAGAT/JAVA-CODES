import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. Print elements
        System.out.print("Array elements: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 2. Sum
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);

        // 3. Max
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max = " + max);

        // 4. Min
        int min = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min = " + min);

        // 5. Count even & odd
        int even = 0, odd = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);

        // 6. Reverse array
        int start = 0, end = n - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("Reversed array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 7. Linear Search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
