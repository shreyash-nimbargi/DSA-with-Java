import java.util.*;

public class Largest {
  
    public  static void manual(int[] arr)
    {
      
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      int big = arr[arr.length-1];
      System.out.println(big);
    }

    static void secondlargest(int arr[])
    {
        int sLar =  arr[arr.length-2];
        System.out.println(sLar);
    }
    public static void main(String[] args) {
      int[] arr = {23,34,54,67};
      manual(arr);
      secondlargest(arr);
  }
}