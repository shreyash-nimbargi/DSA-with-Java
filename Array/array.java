import java.util.*;
public class array{
    public static void main(String args[])
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
}