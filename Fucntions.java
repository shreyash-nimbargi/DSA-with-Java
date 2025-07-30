public class Fucntions {
    public static void main(String[] args) {
        sum();
        
        int ans = sum1(2, 4);
        System.out.println(ans);
        String ans1 = greet("Hello");
        System.out.println(ans1);
    }

        static String greet(String yoo)
        {
            return "Hello";
            
        }
    static void sum()
    {
        int a = 9;
        int b = 9;
        System.out.println(a + b);
    }

    static int sum1(int d,int c)
    {
        int sum = d + c;
        return sum;
    }
}
