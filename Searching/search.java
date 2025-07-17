public class search {
    public static void main(String args[]){
        int[] arr = {4, 2, 9, 9, 6};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max)
            {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=secondMax)
            {
                secondMax=arr[i];
            }
        }

    }
}

