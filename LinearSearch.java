public class LinearSearch {
  public static void main (String[] args) {
    int arr[] = {5,7,2,9};
    int key = 7;

    for(int i=0;i<arr.length;i++) {
      if(arr[i] == key) {
        System.out.println("found at index " +i);
        return;
      }
    }
    System.out.println("not Found");
  }
  }
