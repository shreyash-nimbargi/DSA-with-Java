import java.util.*;

public class Checksort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean result = check(arr);
        System.out.println(result);
    }

    static boolean check(int[] arr)
    {
        
        for(int i = 0;i<arr.length - 1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
           
        }
        return true;
    }
}
