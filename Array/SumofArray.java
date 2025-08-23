import java.util.Arrays;

public class SumofArray {
    public static void add(int[] arr,int sum)
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        add(arr, sum);
    }
}
