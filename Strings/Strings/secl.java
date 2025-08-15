public class secl {
    public static void main(String args[])
    {
        int arr[] = {10,20,30,40,50,60};
        int max=arr[0];
        int secondmax;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]<max)
            {
                secondmax = max;
                max = arr[i];
            }

            elseif(arr[i]>secondmax)
            {
                secondmax = arr[i];
            }
            
        }
    }
}
