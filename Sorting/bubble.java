public class bubble {

      public static void sort(int[] arr,int n)
      {
        for(int i =0;i<n;i++)
        {
          for(int j = 0;j<n-i-1;j++)
          {
            if(arr[j] > arr[j+1])
            {
              int temp = arr[j+1];
              arr[j+1] = arr[j];
              arr[j] = temp;
            }
          }
        }
        for(int i = 0;i<=arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
      }
 
    public static void main(String[] args) {
      int arr[] = {20,56,45,23,89};
      int n = arr.length;
      sort(arr, n);
  }
}

