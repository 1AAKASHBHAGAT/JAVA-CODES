public class FirstRepeatingElement {

    public static void main(String[] args) {

        int arr[] = {3,5,7,5,3,1};

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {

                    System.out.println("First Repeating Element = " + arr[i]);

                    return;
                }
            }
        }

        System.out.println("No Repeating Element");
    }
}