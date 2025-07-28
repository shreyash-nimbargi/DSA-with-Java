//number of rows = number of times the outer loop runs

public class patern {
    public static void main(String[] args) {
        pt1(4);
    }

    static void pt1(int n)
    {
        for(int row = 1;row<=n;row++)
        {
            for(int col = 1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
