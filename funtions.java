

public class funtions {
    public static void main(String[] args) {
        String firstName = "Shreyash";
        String lastName = "Nimbargi";
        String fullName = firstName + " " +lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        
        //charAt
        for(int i = 0;i<fullName.length();i++)
        {
            System.out.print(fullName.charAt(i));
        }

        //compare

        int n1 = "Tony";
        int n2 = "Tony";

        if(n1.compareTo(n2)==0)
        {
            System.out.println("String are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
