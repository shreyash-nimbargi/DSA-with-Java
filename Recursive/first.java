

public class first {

    public static void printnum(int n)
    {
        if(n==1)
        {
            return;
        }
        System.out.println(n + " " );
        printnum(n-1);
    }
    
    public static void printi(int n)
    {
        
        printi(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 9;
        printnum(n);
        printi(n);
    }
}
