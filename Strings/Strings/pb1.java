import java.util.*;
public class pb1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second number ");
        int b = sc.nextInt();

        System.out.println("Now Select the operation below");
        System.out.println("1) Addition\n2)Substraction\n3)Division\n ");
            int total = sc.nextInt();
        switch(total){
            case 1:
            System.out.println("Add is "+(a+b)); 
            break;
            case 2:
            System.out.println("Substraction is :"+(a-b));
            break;
        }
        
    }
}
