import java.util.Scanner;

imoprt java.util.*;
public class Mularray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in)
         int[][] arr = new int[3][3];
         for(int row=0;row<arr.length;row++){
                for(int col = 0;col<arr[row].length;col++)
                {
                    arr[row][col] = sc.nextInt();
                }
         }
    }
}
