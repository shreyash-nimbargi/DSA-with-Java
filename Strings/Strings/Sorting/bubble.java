public class bubble {

 
    public static void main(String[] args) {
      int arr[] = {20,56,45,23,89};
      for(int i = 0;i<arr.length - 1;i++)
      {
        for(int j = 1;j<arr.length-i-1;j++)
        {
          if(arr[j] > arr[j+1])
          {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = arr[j];
          }
        }
      }
      for (int i = 0;i<arr.length;i++)
      {
        System.out.print(arr[i]+ " ");
      }
  }
}

