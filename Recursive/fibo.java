
public class fibo {

    public static int fibo(int n)
    {
        int sum=0;
        if(n<=2)
        {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }
}
