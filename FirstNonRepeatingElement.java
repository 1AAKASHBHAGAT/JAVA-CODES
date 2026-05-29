public class FirstNonRepeatingElement {

    public static void main(String[] args) {

        int arr[] = {4, 5, 1, 2, 0, 4, 5, 2};

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First Non-Repeating Element = " + arr[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No Non-Repeating Element Found");
        }
    }
}