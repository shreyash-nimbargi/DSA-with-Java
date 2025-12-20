public class sum {
    public static int summ(int n)
    {
        if(n == 1) 
        {
            
            return n;
        }
        int result = n + summ(n-1);
        return result;
    }

    public static boolean isSorted(int[] arr,int i)
    {
        if(i == arr.length -1) return true;
        if(arr[i]>arr[i+1]) return false;

       return isSorted(arr, i + 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(summ(n));
        int i = 0;
        int[] arr = {1,2,3,7,5};
        System.out.println(isSorted(arr, i));
    }
}
