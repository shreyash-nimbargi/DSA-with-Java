public class Stars {
public static void star1()
{
    int n = 5;
		int fact = 1;
		for(int i = 1;i<n;i++)
		{
		     fact= fact * i;
		     System.out.println(fact);
		}
}
public static void star2()
{
   for(int i = 1;i<=3;i++){
        for(int j =1;j<=6;j++)
        {
            if(i == 1 || i == 3 || j == 1 || j== 6)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            } 
            
        }
        System.out.println();
    }
}
	public static void main(String[] args) {
		
    star1();
    star2();
		
	}
}


