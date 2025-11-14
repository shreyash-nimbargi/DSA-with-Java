public class number {

    public static int prod(int n)
    {
        if(n%10 == 0)
        {
            return n;
        }

        return prod(n%10) * prod(n/10);
    }

    public static void printnum(int n)
    {
        if(n == 1)
        {
            
            return ;
        }
        System.out.println(n);
            printnum(n-1);
    }
    public static void main(String[] args) {
        int ans = prod(222);
        
        System.out.println(ans);
        printnum(10);
    }
}
