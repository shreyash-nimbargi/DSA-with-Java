public class Func {
    public static void main(String[] args) {
        String str = "Shreyash";
        String gtr = "abcd";
         System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.compareTo(gtr));
        System.out.println(str.substring(0,4));

        for(int i = 0;i<=4;i++)
        {
            for(int j=i+1;j<=4;j++)
            {
                System.out.print(gtr.substring(i,j)+" ");
            }
        }
    }
}
