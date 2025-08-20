import java.util.Scanner;

public class Two {

    public static int calculate(int[] arr,int target)
    {
        int ans = 0;
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = i+1; i<arr.length;i++)
            {
                 for(int k = j+1; i<arr.length;i++)
                    {
                        if(arr[i] + arr[j]+ arr[k]== target)
                        {
                            ans++;
                        }
                        else{
                            System.out.println("Not present in the array");
                        }
                    }
             }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array  : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the "+n+" elements");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target sum :");
        int target = sc.nextInt();
        System.out.println(calculate(arr,target));
    }
}
