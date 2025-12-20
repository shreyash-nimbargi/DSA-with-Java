public class first1 {

    public static void repeat(int n)
    {
        if(n == 0)
        {
            return ;
        }
         repeat(n-1);
         System.out.print(n+" ");
        
    }
    public static void repeatdec(int n)
    {
        if(n==1) return;
        System.out.print(n+" ");
        repeat(n-1);
    }
    public static void main(String[] args) {
        
      int n = 10;
      repeat(n);
      repeatdec(n);
    }
}
