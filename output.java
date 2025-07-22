
public class output {

    static void preetyprint()
    {
        float a = 42.345644f;
         System.out.printf("Formatted number %.2f \n",a);
    }

    static void operators()
    {
        System.out.println("a" + "b");
        System.out.println('a' + 'b');
        System.out.println("a" + 1); // integer will be converted to Integer that will call toString()
    }
    public static void main(String args[])
    {
         preetyprint();
         operators();
    }
}
