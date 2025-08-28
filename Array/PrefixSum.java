
import java.util.*;
public class PrefixSum {

    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = arr[0];
        for(int i=1;i<n;i++ )
        {
            pre[i] = arr[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(pre));

    }
}
