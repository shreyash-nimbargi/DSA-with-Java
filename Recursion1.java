public class Recursion1 {

    public static  void p1(int n)
    {
        if(n==5)
        {
            
            return;
        }
        
        p1(n + 1);
            System.out.println(n);

        
    }
    public static void main(String[] args) {
        
        p1(1);
    }
}
