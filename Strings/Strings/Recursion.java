public class Recursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n)
    {
        if(n == 5)
        {
            System.out.println(5);
            return;
        }
        
        print(n + 1);
    }
}
