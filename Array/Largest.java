import java.util.*;

public class Largest {
  
    public  static void manual()
    {
      
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      int largest = arr[arr.length-2];
      System.out.println(largest);
    }
    public static void main(String[] args) {
      int[] arr = {23,34,54,67};
      manual();
  }
}