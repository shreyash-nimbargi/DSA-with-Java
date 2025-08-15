public class lsearch {
    public static void main(String args[]){
        int[] arr = {20,40,30,50,69};
        int min = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]<min){
                min = arr[i];
                
            }
            
        }
            System.out.println(min);
        
        
        
        
        
        //this code is for searching in the array
        // int target = 30;

        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]==target){
        //         System.out.println("Element is present in index : "+i);
        //     }
        // }
    }
}
