import java.util.Arrays;

public class Arrays3 {

    public static void printArray(int arr[]) {
        arr[0] = 100;
        for (int ele : arr) {
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        // methods in array class;
        // 1. sort; - changes in original array;
        int arr[] = { 5, 4, 3, 2, 1 };
        Arrays.sort(arr);
        for (int ele : arr) {
            System.out.println(ele);
        }

        // 2. fill; - changes in original array;
        int arr1[] = new int[5];
        Arrays.fill(arr1, 5);
        for (int ele : arr1) {
            System.out.println(ele);
        }

        // 3. toString; - returns a string
        int arr2[] = { 1, 2, 3, 4, 5 };
        // String str = Arrays.toString(arr2);
        // System.out.println(str);

        // 4. copyOf; - returns a new array
        int arr3[] = Arrays.copyOf(arr2, arr2.length);
        // String str1 = Arrays.toString(arr3);
        // System.out.println(str1);

        // 5. equals; - checks each value of both arrays
        if (Arrays.equals(arr2, arr3)) {
            System.out.println("same");
        }

        // 6. jagged Array - 2D array whose rows and columns are different
        int arr4[][] = {
                { 1, 2, 3 },
                { 4, 5, 6, 7 },
                { 8, 9 }
        };

        for (int r = 0; r < arr4.length; r++) {
            for (int c = 0; c < arr4[r].length; c++) {
                System.out.print(arr4[r][c] + " ");
            }
            System.out.println();
        }

        // 7. passing array to method;
        int arr5[] = { 1, 2, 3, 4, 5 };
        printArray(arr5);
    }
}
