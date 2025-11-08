import java.util.*;

public class check {
    
    static int mergesort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return mergesort(left,right);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,4,7};
    }
}
