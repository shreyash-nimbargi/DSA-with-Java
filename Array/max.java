public class max {
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,9};
        int max = 0;

        for(int i=0;i<=arr.length-2;i++)
        {
            if(arr[i]<arr[i+1])
            {
                max = arr[i+1];
               
            }
            
        }
        System.err.println(max);
    }
}
