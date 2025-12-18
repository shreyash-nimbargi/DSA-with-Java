
public class RecursionBasics {
    public static void printnum(int n)
    {
        if(n == 0)
        {
            return ;
        }
        printnum(n-1);
        System.out.println( " " + n); 
    }
    // 
    public static int printn(int n)
    {
        if(n == 1)
        {
            return n;
        }
        return n + printn(n-1);
    }
    // fibonacci
    public static int fib(int n)
    {
        if(n == 0 || n==1)
        {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    // to check whether the arr is sorted
    public static boolean isSorted(int[] arr,int i)
    {
        if(i == arr.length -1)
        {
            return true;
        }
        if(arr[i] > arr[i+1])
        {
            return false;
        }
        
        return isSorted(arr, i+1);
    }

    public static int firstOccurance(int arr[], int key,int i)
    {
        if(key == 
        )
    }
   public static void main(String[] args) {
    int[] arr = {1,2,9,4,5};
    int n = 10;
    printnum(n);
    System.out.println(printn(n));
    System.out.println(fib(n));
    System.out.println( isSorted(arr, 0));
   }
}