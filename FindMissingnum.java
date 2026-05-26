public class FindMissingnum {
  public static void main(String [] arg) {
    int arr[] = {1,2,4,5};

    int n = 5;

    int expectedsum = n * (n + 1) / 2;
  
    int actualsum = 0;

  for(int num : arr)
    actualsum += num;
  
System.out.println("missing Number = " + (expectedsum - actualsum));

}
  
}
