import java.util.*;
public class array{

    public static void first()
    {
        int[] arr = new int[4];
        arr[0] = 20;
        arr[1] = 23;
        arr[2] = 25;
        arr[3] = 56;

        for(int i = 0;i<4;i++)
        {
            System.out.println(arr[i]);
        }

        String[] str = new String[2];
        str[0] = "Hello there";
        str[1] = "Hello shreyash";
        for(int j = 0;j<2;j++)
        {
            System.out.print(str[j]);
        }

       
    }
     public static void sumofdigits()
        {
            System.out.println("\nEnter here : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = new int[n];
            int sum = 0;
            while(n>0)
            {

                sum = sum + n % 10;
                n = n/10;
            }
            System.out.println(sum);
        }
    public static void main(String args[])
    {
        first();
        sumofdigits();
    }
}